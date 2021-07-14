package com.basics.base.springsource;

import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 模拟Spring容器初始化过程，Bean初始化
 * @author 洛水晴川
 * @date 2021/4/14 15:47
 * */
public class XiaoleApplicationContext {

    private Class appConfigClass;
    /**
     * bean容器
     */
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>(64);

    /**
     * 单例池(循环依赖)
     */
    private Map<String, Object> singletonObjects = new HashMap<>(64);
    /**
     * Bean初始化前、后所做的事情
     */
    private List<BeanPostProcessor> beanPostProcessorList = new ArrayList<>();

    public XiaoleApplicationContext(Class<?> appConfigClass) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        this.appConfigClass = appConfigClass;
        // 解析配置类
        beanScan(appConfigClass);
        // 初始化单例池
        preInstantialSingletons();
    }

    private void beanScan(Class<?> appConfigClass) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (appConfigClass.isAnnotationPresent(ComponentScan.class)) {
            ComponentScan annotation = appConfigClass.getAnnotation(ComponentScan.class);
            String path = annotation.value();
            // 扫描：根据包名扫描类
            System.out.println(String.format("当前扫描路径：%s", path));

            ClassLoader classLoader = appConfigClass.getClassLoader();
            path = path.replace(".", "/");
            URL resource = classLoader.getResource(path);

            File file = new File(resource.getFile());
            File[] files = file.listFiles();
            for (File f : files) {
                String filePath = f.getPath();
                if (filePath.endsWith("class")) {
                    String className = filePath.substring(filePath.indexOf("com"), filePath.indexOf(".class"));
                    className = className.replace("\\", ".");
                    Class<?> clazz = classLoader.loadClass(className);
                    System.out.println(String.format("扫描到的类：%s", clazz));

                    // 注入bean
                    if (clazz.isAnnotationPresent(Component.class)) {
                        Component componentVar = clazz.getAnnotation(Component.class);
                        String beanName = componentVar.value();
                        BeanDefinition beanDefinition = new BeanDefinition();
                        beanDefinition.setClazz(clazz);
                        beanDefinitionMap.put(beanName, beanDefinition);
                        if (BeanPostProcessor.class.isAssignableFrom(clazz)) {
                            beanPostProcessorList.add((BeanPostProcessor) clazz.newInstance());
                        }
                        if (clazz.isAnnotationPresent(Scope.class)) {
                            Scope scopeVar = clazz.getAnnotation(Scope.class);
                            beanDefinition.setScope(scopeVar.value());
                        } else {
                            beanDefinition.setScope("singleton");
                        }

                    }
                }
            }

        }
    }


    public Object getBean(String beanName) throws InstantiationException, IllegalAccessException {
        if (beanDefinitionMap.containsKey(beanName)) {
            // 从容器中取出bean
            if ("singleton".equals(beanDefinitionMap.get(beanName).getScope())) {
                // 单例：初始化单例池
                Object o = singletonObjects.get(beanName);
                return o;
            } else {
                // 多例：直接创建
                Object bean = createBean(beanName, beanDefinitionMap.get(beanName));
                return bean;
            }
        } else {
            throw new NullPointerException();
        }
    }

    private Object createBean(String beanName, BeanDefinition beanDefinition) throws IllegalAccessException, InstantiationException {
        Class<?> clazz = beanDefinition.getClazz();
        Object instance = clazz.newInstance();

        // 依赖注入IOC
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field file : declaredFields) {
            if (file.isAnnotationPresent(Autowired.class)) {
                String name = file.getName();
                Object bean = getBean(name);
                file.setAccessible(true);
                file.set(instance, bean);
            }
        }

        // bean初始化前
        for (BeanPostProcessor beanPostProcessor : beanPostProcessorList) {
            instance = beanPostProcessor.postProcessBeforeInitialization(instance, beanName);
        }

        // 初始化bean
        if (instance instanceof InitializeBean) {
            ((InitializeBean) instance).afterPropertiesSet();
        }

        // bean初始化后
        for (BeanPostProcessor beanPostProcessor : beanPostProcessorList) {
            instance = beanPostProcessor.postProcessAfterInitialization(instance, beanName);
        }

        // TODO 还可以在创建bean的过程中做一些其他的事 ... ...

        System.out.println(String.format("[%s] >> 创建bean完成=> [%s]", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")), instance));
        return instance;
    }

    /**
     * 初始化单例池
     */
    private void preInstantialSingletons() throws InstantiationException, IllegalAccessException {
        for (Map.Entry<String, BeanDefinition> entry : beanDefinitionMap.entrySet()) {
            BeanDefinition beanDefinition = entry.getValue();
            String beanName = entry.getKey();
            if ("singleton".equals(beanDefinition.getScope())) {
                Object bean = createBean(beanName, beanDefinition);
                singletonObjects.put(beanName, bean);
            }
        }
    }
}

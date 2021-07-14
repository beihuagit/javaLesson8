package com.basics.functions;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @Author: xiaole.chen
 * @Date: 2020/7/28 11:53
 * @Description: 四大内置函数式接口
 * Java8内置四大核新函数式接口
 * Consumer<T>: 消费型接口(无返回值，传入参数进行消费，消费完即结束)
 *          void accept(T t);
 * Supplier<T>: 供给型接口
 *          T get();
 * Function<T, R>: 函数型接口
 *          R apply(T t);
 * Predicate<T>: 断言型接口
 *          boolean test(T t);
 * */
public class FunctionTest {

    @Test
    public void test1() {
        // 1.消费型
        Consumer<String> res = System.out::println;
        res.accept("消费型函数：");
        happy(1000.00, (m) -> System.out.println("小张去游泳消费：" + m));
        // 2.供给型
        /*List<Integer> list = getNumberList(10, () -> (int)(Math.random() * 100));
        list.forEach(n -> {
            for(int i = 0; i< n; i++) {
                System.out.print("*");
            }
            System.out.println("\n");
        });*/
        // 3.函数型
        //String newStr = strHandler("\t\t\t  hello, I'm from china, I love China   ", String::trim);
        //System.out.println(newStr);
        // 4.断言型
        //List<String> list = Arrays.asList("Beijing2022", "www", "Chongqing", "city", "ok", "cn", "China");
        //List<String> ls = strFilter(list, (s) -> s.length() > 3);
        //System.out.println(ls);
    }

    /**
     * 演示消费型接口：娱乐消费
     * @param money
     * @param consumer
     */
    private void happy(Double money, Consumer<Double> consumer) {
        // 拿着钱去消费
        consumer.accept(money);
    }

    /**
     * 演示供给型接口
     * 需求：产生指定个数的随机整数，并放入列表
     * @return
     */
    private List<Integer> getNumberList(int num, Supplier<Integer> supplier) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int n = supplier.get();
            list.add(n);
        }
        return list;
    }

    /**
     * 演示函数式接口
     * @param str
     * @param func
     * @return
     */
    private String strHandler(String str, Function<String, String> func) {
        return func.apply(str);
    }

    /**
     * 演示断言型接口
     * 需求：将满足条件的字符串放入集合中返回
     */
    private List<String> strFilter(List<String> list, Predicate<String> pre) {
        List<String> flist = new ArrayList<>();
        list.forEach(str -> {
            if (pre.test(str)) {
                flist.add(str);
            }
        });
        return flist;
    }
}

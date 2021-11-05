package com.basics.base.typer.innerclass;

/**
 * 内部类的使用场景：成员内部类、局部内部类、匿名内部类和静态内部类
 * 内部类可以嵌套内部类
 * @author 洛水晴川
 * */
public class TestInnerClass {
    private final String language = "人话";

    /**
     * 匿名内部类: 重写了接口或者抽象类的方法
     */
    Inner inner = new Inner() {
        @Override
        public int getAge() {
            // 访问外部类成员
            System.out.println(talk("English"));
            // 访问外部类final修饰的变量
            System.out.println("请讲" + language);

            return super.getAge();
        }

        @Override
        public void setAge(int age) {
            super.setAge(age);
        }
    };

    public static void main(String[] args) {
        // 可直接访问静态内部类的静态成员方法
        System.out.println(Inner.say("乐乐"));
        // 普通内部类的实例化分两步：
        TestInnerClass tt = new TestInnerClass();
        tt.print();
        TestInnerClass.InnerClass inClass = tt.new InnerClass("乐乐", "深圳");
        System.out.println(inClass.getAddress());
        inClass.talk("中文");

    }

    private String talk(String language) {
        return "会说" + language;
    }

    public void print() {
        inner.setAge(28);
        // 构造匿名内部类，访问内部类的方法
        System.out.println(inner.getAge());
    }


    public interface TalkAbout {
        /**
         * 内部类接口的方法
         * @param language
         */
        void talk(String language);
    }

    /**
     * 静态内部类
     */
    public static class Inner {
        // 成员变量
        private int age;

        /**
         * 静态内部类的静态方法
         * @param message
         * @return
         */
        public static String say(String message) {
            return "hello：" + message;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    class InnerClass implements TalkAbout {
        private String name;
        private String address;
        private String lang = language;

        InnerClass(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        @Override
        public void talk(String language) {
            System.out.println("说" + language);
        }
    }
}

package com.basics.threads.juc;

/**
 * 多线程内存可见性问题：当多个线程访问或操作共享数据时(主存)，彼此是不可见的
 * volatile: 多线程共享数据区：多个线程操作“共享数据”时，相互是可见的
 * 效率低：volatile是可重入锁，JVM低层重排序不起作用了；但是比Synchronized效率高一些，Synchronized 是互斥锁
 * 不能保证变量的原子性
 * @author 洛水晴川
 * @date 2021/9/7 10:52
 * */
public class TestVolatile {


    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        new Thread(td).start();
        while (true) {
            /*synchronized (td) {
                if (td.isFlag()) {
                    System.out.println("------------------");
                    break;
                }
            }*/

            if (td.isFlag()) {
                System.out.println("------------------");
                break;
            }
        }
    }

}

class ThreadDemo implements Runnable {

    //private boolean flag = false;

    private volatile boolean flag = false;

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("flag = " + isFlag());
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

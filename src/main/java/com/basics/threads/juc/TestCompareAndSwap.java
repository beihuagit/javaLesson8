package com.basics.threads.juc;

/**
 * 模拟CAS算法
 * @author 洛水晴川
 * @date 2021/9/7 12:03
 * */
public class TestCompareAndSwap {

    public static void main(String[] args) {
        final CompareAndSwap cas = new CompareAndSwap();
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    int expectedVal = cas.get();
                    boolean b = cas.compareAndSet(expectedVal, (int)(Math.random() * 101));
                    System.out.println(b);
                }
            }).start();
        }
    }

}

class CompareAndSwap {

    private int val;

    // 获取内存值
    public synchronized int get() {
        return val;
    }

    // 必较
    public synchronized int compareAndSwap(int expectedVal, int newVal) {
        int oldVal = val;
        if (oldVal == expectedVal) {
            this.val = newVal;
        }
        return oldVal;
    }

    // 设置
    public synchronized boolean compareAndSet(int expectedVal, int newVal) {
        return expectedVal == compareAndSwap(expectedVal, newVal);
    }
}

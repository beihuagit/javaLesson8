package com.basics.threads;

/**
 *��עThreadLocal������Ĺ�ϣ�룺0x61c88647����ϣ��ײ
 *@author xiaole.chen
 *@date 2020/11/6 10:09
 */
public class ThreadLocalTest {

    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal();
        System.out.println(threadLocal.get());
    }
}

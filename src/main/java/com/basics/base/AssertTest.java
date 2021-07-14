package com.basics.base;

/**
 * ����[Assert]
 * jdk1.4֮���ṩ������C/C++�еĶ���
 * @author xiaole.chen
 * @date 2020/11/2 11:26
 * */
public class AssertTest {

    /**
     * ��������ʱ�����Ӳ�����-Djava -ea
     * @param args
     */
    public static void main(String[] args) {
        Boolean isSafe = false;
        assert isSafe : "is not Safe";
        System.out.println("����ͨ��");
        /*
         * ������Դ�Ϊfalse������׳�һ���쳣��
         * Exception in thread "main" java.lang.AssertionError: is not Safe
	     *     at com.xiaole.base.AssertTest.main(AssertTest.java:17)
	     * �������ͨ��
         */
    }
}

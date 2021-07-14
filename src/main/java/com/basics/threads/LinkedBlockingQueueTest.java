package com.basics.threads;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * ��ָ����С��˳��Ļ������
 * @author xiaole.chen
 * @date 2020/10/27 18:27
 * */
public class LinkedBlockingQueueTest extends LinkedBlockingQueue {
    private static final long serialVersionUID = -7247652987120055651L;

    public static void main(String[] args) throws InterruptedException {
        Map<String,String> map = new LinkedHashMap<String, String>(16){{put("test", "���");}};
        //LinkedBlockingQueueTest test = new LinkedBlockingQueueTest();
        //test.put("����0");
        //test.put("����1");
        //test.put("����2");
        //test.put("����3");
        //test.put("����4");
        //System.out.println(test);

        PriorityBlockingQueue<Object> pbq = new PriorityBlockingQueue<>();
        pbq.add("����");
        pbq.add("HashMap");
        pbq.add(map.toString());
        System.out.println("����һ�����˳��Ķ��У�" +pbq);
        pbq.forEach(System.out::println);
    }
}

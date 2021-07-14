package com.basics.Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.function.Predicate;

/**
 * һ����������������ɵļ���
 * @author xiaole.chen
 * @date 2020/11/16 17:08
 * */
public class DequesTest {

    public static void main(String[] args) {
        // ��ʼ��һ������
        Deque<String> deques = new ArrayDeque<>();
        deques.add("hello");
        deques.add("test");
        deques.add("computer");
        deques.add("telephone");

        //
        List<String> list = new ArrayList<>();
        list.add("software");
        list.add("people");
        list.add("Shenzhen");
        list.add("Chongqing");
        list.add("Chengdu");
        deques.addFirst("xiaole");
        deques.addAll(list);
        deques.addLast("flower");
        deques.offerLast("++++we++++");
        deques.offerFirst("====I'm===");
        System.out.println(deques.toString());
        System.out.println("����weԪ�أ����Ƴ�");
        deques.removeIf(Predicate.isEqual("++++we++++"));
        System.out.println(deques.toString());
        // Ĭ���Ƴ���һ��Ԫ��
        deques.remove();
        System.out.println(deques.toString());
        //
        System.out.println("��һ��Ԫ�أ�"+deques.element());
        System.out.println("��һ��Ԫ�أ�"+deques.getFirst());
        System.out.println("���һ��Ԫ�أ�"+deques.getLast());
        deques.add("people");
        System.out.println(deques.toString());
        System.out.println("�׸�Ԫ�أ�"+deques.peek());
        System.out.println("�ײ�Ԫ�أ�"+deques.peekFirst());
        System.out.println("β��Ԫ�أ�"+deques.peekLast());

        // ����Ԫ��(��������)
        deques.poll();
        System.out.println(deques.toString());
        // ������һ��Ԫ��
        deques.pollFirst();
        System.out.println(deques.toString());
        // �������һ��Ԫ��
        deques.pollLast();
        System.out.println(deques.toString());
        // ��ջ�е���һ��Ԫ��
        deques.pop();
        System.out.println("����Ԫ��֮��"+deques.toString());
        deques.remove("telephone");
        deques.removeFirst();
        deques.removeLast();
        deques.addFirst("people");
        deques.removeFirstOccurrence("people");
        deques.removeLastOccurrence("people");
        System.out.println("�Ƴ�����Ԫ�أ�"+deques.toString());

        //
        deques.addAll(list);
        System.out.println("�ٷ���һЩԪ�أ�"+deques.toString());
        System.out.println("��ǰ�б�Ĵ�С�ǣ�"+deques.size());
        // ���Ժ���ȳ����Ƚ��ȳ���������
        /*for(int i = 0; i < deques.size(); i++){
            System.out.println(deques.pollLast());
        }*/
        // ��������ɾ��
        deques.forEach(o -> System.out.println("ɾ����"+o+";ֵ��"+o.intern() +"��ɾ�������"+deques.remove(o)));
        System.out.println("�����Ƴ�Ԫ�أ�"+deques.toString());
    }
}

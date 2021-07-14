package com.basics.Collections;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ��ͨ�б�
 * @author xiaole.chen
 * @date 2020/11/16 18:22
 * */
@Data
public class ListTest {

    public static void main(String[] args) {
        //List<String> list = new ArrayList<>();
        //list.add("Java");
        //list.add("C++");
        //list.add("C");
        //list.add("C#");
        //list.add("JSP");
        //list.add("JS");
        //list.add("ASP");
        //list.add("PHP");
        //list.add("Python");
        // ����������������(�Ա�deque)
        //list.forEach(list::remove);
        //System.out.println(list);
        //for (int i = 0; i < list.size(); i++){
        //    list.remove(i);
        //}

        //System.out.println(list.subList(1, 5));
        //char[] a = new char[list.size()];
        //Arrays.binarySearch(a, 'P');
        //System.out.println(a);
        List<Object> list = Arrays.asList("A","B",2,"D","E","F",8,"H","I","J","10",10,"M","N","O","P","Q","R","S","T");
        //System.out.println(list.get(9));
        //System.out.println(Objects.deepEquals(list.get(10),list.get(11)));
        List<User> list2 = new ArrayList<>();
        for(int i=0; i<11; i++) {
            User user = new User();
            //user.setName(String.format("who%s", i));
            //user.setAge(i);
            //user.setStatus("0");
            list2.add(user);
        }
        list.forEach(o -> list2.forEach(f -> {
            //if(o.equals(f.getAge())){
            //    f.setStatus("1");
            //}
        }));
        System.out.println(list2.toString());
        System.out.println("   1  3 ".trim().replaceAll("\\s", ""));
    }
}

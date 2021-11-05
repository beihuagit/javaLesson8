package com.basics.threads.sync;

import org.openjdk.jol.info.ClassLayout;

/**
 * JOL工具的使用，即Java Object Layout可以查看一个Java对象的内存布局
 * @author 洛水晴川
 * @date 2021/7/26 10:40
 * */
public class JOLTest {
/**
     java.lang.Object object internals:
     OFF  SZ   TYPE DESCRIPTION               VALUE
     0    8        (object header: mark)     0x0000000000000001 (non-biasable; age: 0)
     8    4        (object header: class)    0xf80001e5
     12   4        (object alignment gap)
     Instance size: 16 bytes
     Space losses: 0 bytes internal + 4 bytes external = 4 bytes total
 -----------------------------------------------------------------------------------------
 对象结构：第一行是Java对象头的Mark word,有8个字节：包含锁信息
 第二行是Java对象头的Class point类指针，本来也是占8个字节,因JDK默认开启类指针压缩所以占4个字节,
 总共12个字节,又因12不能被8整除,所以最后又补了四个空字节（对齐）,所以java中new一个空对象总共占16个字节.

 在HotSpot虚拟机中，对象在内存中存储的布局可以分为3块区域：对象头（Header）、实例数据（Instance Data）和对齐填充（Padding）。
 HotSpot虚拟机的对象头包括两部分信息，第一部分用于存储对象自身的运行时数据，如哈希码（HashCode）、GC分代年龄、锁状态标志、
 线程持有的锁、偏向线程ID、偏向时间戳等， 这部分数据的长度在32位和64位的虚拟机（未开启压缩指针）中分别为32bit和64bit，
 官方称它为"Mark Word"。 对象头的另外一部分是类型指针，即对象指向它的类元数据的指针，虚拟机通过这个指针来确定这个对象是哪个类的实例。
 并不是所有的虚拟机实现都必须在对象数据上保留类型指针，换句话说，查找对象的元数据信息并不一定要经过对象本身，
 这点将在2.3.3节讨论。另外，如果对象是一个Java数组，那在对象头中还必须有一块用于记录数组长度的数据，因为虚拟机
 可以通过普通Java对象的元数据信息确定Java对象的大小，但是从数组的元数据中却无法确定数组的大小。
 接下来的实例数据部分是对象真正存储的有效信息，也是在程序代码中所定义的各种类型的字段内容。无论是从父类继承下来的，
 还是在子类中定义的，都需要记录起来。 第三部分对齐填充并不是必然存在的，也没有特别的含义，它仅仅起着占位符的作用。
 由于HotSpot VM的自动内存管理系统要求对象起始地址必须是8字节的整数倍，换句话说，就是对象的大小必须是8字节的整数倍。


 Mark Word：在32位虚拟机是4字节，在64位虚拟机是8字节
 类型指针：在不开启对象指针压缩的情况下是8字节。压缩后变为4字节，默认压缩。
 对其填充：用于对象在内存中占用的字节数不能被8整除的情况下，进行补充。
 ————————————————
 GC时对象地址变了，hashCode如何保持不变？
 原因：
 当hashCode没有被调用时，对象的对象头中的HashCode为0。
 只有当HashCode首次被调用时，才会存储对应的hashcode值。
 当再次被调用时，则直接获取计算好的即可。

 synchronized本质是修改mark word的锁信息

 */
    public static class T {
        int m = 10;
        boolean b;

    }

    public static void main(String[] args) {
        //T t = new T();
        Object t = new Object();
        System.out.println(ClassLayout.parseInstance(t).toPrintable());
        synchronized (t) {
            System.out.println(ClassLayout.parseInstance(t).toPrintable());
        }
        System.out.println(ClassLayout.parseInstance(t).toPrintable());
    }
}

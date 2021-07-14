package com.basics.base.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 字符流：默认一次读取16bit，可以设置缓冲区，以减少对磁盘的读取次数
 * @author 洛水晴川
 * @date 2021/5/17 18:47
 * */
public class FileReaderTest {

    public static void main(String[] args) throws IOException {
        //FileReader fr = new FileReader("G:\\test-io.txt"); // FileReader继承了InputStreamReader,但并未实现带字符集的构造函数;因此采用以下方法避免中文乱码
        InputStreamReader isr = new InputStreamReader(new FileInputStream("G:\\test-io.txt"), "UTF-8");
        int num = 0;
        // 字符流读取以char数组形式
        char []buf = new char[1024];
        StringBuffer str = new StringBuffer();
        //while ((num = isr.read(buf)) != -1) {
        //    System.out.println(num);
        //}
        String []bufString = new String[1024];
        String line = null;
        BufferedInputStream isrReader = new BufferedInputStream(new FileInputStream("G:\\test-io.txt"));
        //while ((line = isrReader.read(str)) != null) {}
        for (int i = 0; i < buf.length; i++) {
            System.out.print(buf[i]);
        }
    }
}

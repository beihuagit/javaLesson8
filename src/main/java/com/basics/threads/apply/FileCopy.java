package com.basics.threads.apply;

import com.basics.utils.ThreadPoolExecutorUtil;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

/**
 * 多线程应用场景：
 * 将文件夹下的文件拷贝到目标文件夹(并重命名)
 * 我们以拷贝QQ接收文件目录为例
 * @author 洛水晴川
 * @date 2021/10/14 17:22
 * */
public class FileCopy {

    public static void main(String[] args) {
        // 定义源文件夹和目标文件夹的位置
        File src = new File("C:\\Users\\chenxl\\Documents\\Tencent Files\\1058484410\\FileRecv");
        File dest = new File("F:\\opt");
        // 拿到源文件夹所有文件名
        String[] fileNames = src.list((dir, name) -> name.endsWith(".mp3") && new File(dir, name).isFile());
        System.out.println(Arrays.toString(fileNames));
        ExecutorService executor = ThreadPoolExecutorUtil.createThreadPoolExecutor("fileCopy");
        for (String name : fileNames) {
            executor.execute(new CopyThread(src, dest, name));
        }
        executor.shutdown();
    }

}

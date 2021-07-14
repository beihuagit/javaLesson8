package com.basics.utils;

import java.io.File;

/**
 * 删除maven本地仓库多余版本
 * @author xiaole.chen
 * @version 1.0
 */
public class DeleteUselessRepository {

    private static String MAVEN_PATH = "E:\\maven_repository";

    /**
     * 判断是否存在jar
     */
    private static boolean judge(File file) {
        boolean isHaveJar = false;
        File[] files = file.listFiles();
        if (files != null && files.length > 0) {
            for (File _file : files) {
                if (_file.getName().endsWith(".jar")) {
                    isHaveJar = true;
                }
                if (_file.isDirectory()) {
                    boolean isNextHaveJar = judge(_file);
                    if (isNextHaveJar) {
                        isHaveJar = true;
                    }
                }
            }
        }
        if (!isHaveJar) {
            delete(file);
        }
        return isHaveJar;
    }

    private static void removeSubFile(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory() && !f.getName().contains(".")) {
                removeSubFile(f);
            } else {
                // 直至遍历到版本号最内层（保留一个）
                File file2 = f.getParentFile();
                File[] files2 = file2.listFiles();
                if (files2 != null && files2.length > 1) {
                    for (int i = 0; i < files2.length - 1; i++) {
                        // 删除子文件
                        File[] subFiles = files2[i].listFiles();
                        if (subFiles != null) {
                            for (File f2 : subFiles) {
                                f2.delete();
                                System.out.println("删除文件：" + f2.getAbsolutePath());
                            }
                        }
                        // 删除目录本身
                        files2[i].delete();
                        System.out.println("删除目录：" + f.getAbsolutePath());
                    }
                }
            }
        }
    }

    /**
     * 删除操作
     */
    public static void delete(File file) {
        // 如果当前删除文件是目录，且目录不含有版本号关键信息，那么继续递归
        // 否则删除该目录下所有文件，除了最新的一个
        File[] files = file.listFiles();
        if (files != null && files.length > 0) {
            for (File f : files) {
                removeSubFile(f);
            }
        } else {
            file.delete();
            System.out.println("目录已删除：" + file.getAbsolutePath());
        }
    }

    public static void main(String[] args) {
        File mavenRoot = new File(MAVEN_PATH);
        if (mavenRoot.exists()) {
            File[] files = mavenRoot.listFiles();
            if (files != null && files.length > 0) {
                //保留最新版本，删除老版本
                for (File file : files) {
                    delete(file);
                }
            }
        }
    }
}

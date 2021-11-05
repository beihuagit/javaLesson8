package com.basics.threads.apply;

import lombok.SneakyThrows;

import java.io.*;

/**
 * @author 洛水晴川
 * @date 2021/10/14 18:07
 * */
public class CopyThread implements Runnable {

    private final String fileName;
    private final File srcFile;
    private final File destFile;

    public CopyThread(File srcFile, File destFile, String fileName) {
        this.srcFile = srcFile;
        this.destFile = destFile;
        this.fileName = fileName;
    }

    @SneakyThrows
    @Override
    public void run() {
        // 源文件
        File srcFile = new File(this.srcFile, fileName);
        // 目标文件（重命名，我们也可以不重命名）
        File destFile = new File(this.destFile, fileName);
        //File destFile = new File(this.destFile, fileName.replace(".log", ".txt"));
        BufferedReader br = new BufferedReader(new FileReader(srcFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destFile));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        // 拷贝完成删除源文件
        srcFile.deleteOnExit();
        bw.close();
        br.close();
    }
}

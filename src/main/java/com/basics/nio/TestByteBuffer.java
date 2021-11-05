package com.basics.nio;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Netty的演进：处理Socket连接-->> 一阶段：多线程连接；二阶段：线程池连接；三阶段：Selector
 * Nio三大组件：Channel：FileChannel, DatagramChannel, SocketChannel, ServerSocketChannel
 *            Buffer:ByteBuffer(使用最多)
 *                   MappedByteBuffer
 *                   DirectByteBuffer
 *                   HeapByteBuffer
 *                   ShortBuffer
 *                   IntBuffer
 *                   LongBuffer
 *                   FloatBuffer
 *                   DoubleBuffer
 *                   CharBuffer
 *            Selector:
 * @author 洛水晴川
 * @date 2021/9/16 11:05
 * */
@Slf4j
public class TestByteBuffer {

    public static void main(String[] args) {

        // 1.输入输出流：FileChannel,  RandomAccessFile
        try (FileChannel channel = new FileInputStream("data.txt").getChannel()) {

            // 准备缓冲区
            ByteBuffer buffer = ByteBuffer.allocate(10);
            while (true) {
                // 从Channel读数据到buffer
                int len = channel.read(buffer);
                log.info("读取到的字节数>> {}", len);
                if (len == -1) {
                    break;
                }
                buffer.flip(); // 切换至读模式
                while (buffer.hasRemaining()) {
                    byte b = buffer.get();
                    log.info("读取到的字节：{}", ((char) b));
                }
                buffer.clear(); // 切换至写模式，或者compact()
            }
        } catch (IOException e) {

        }
    }
}

package com.zjy.netty;

//  created by zjy on 2022/3/13 15:47

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestByteBuffer {
    @SneakyThrows
    public static void main(String[] args) {
        FileChannel channel = new FileInputStream("data.txt").getChannel();
        //准备缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(10);
        //从channel读 向buffer写
        while (channel.read(buffer) !=-1){
            buffer.flip();//切换至读模式
            while (buffer.hasRemaining()){
                System.out.println((char) buffer.get());
            }
            buffer.clear();//切换至写模式
        }
    }
}

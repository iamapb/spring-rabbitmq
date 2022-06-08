package com.base.io.NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NioServer {

    private static final List<SocketChannel> chanelList = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        // 创建NIO ServerSockerChannel 与BIO的serverSocket类似
        ServerSocketChannel serverSocket = ServerSocketChannel.open();
        serverSocket.socket().bind(new InetSocketAddress(9000));

        // 设置ServerSocketChannel 为非阻塞，配置为true 则和 BIO类似
        serverSocket.configureBlocking(false);
        System.out.println("服务启动成功");

        while (true) {
            SocketChannel socketChannel = serverSocket.accept();
            if (socketChannel != null) {  // 如果有客户端进行连接
                System.out.println("连接成功");
                socketChannel.configureBlocking(false);
                chanelList.add(socketChannel);
            }

            Iterator<SocketChannel> iterator = chanelList.iterator();
            while (iterator.hasNext()) {
                SocketChannel sc = iterator.next();
                ByteBuffer byteBuffer = ByteBuffer.allocate(128);
                int len = sc.read(byteBuffer);
                if (len > 0) {
                    System.out.println("接收到消息" + new String(byteBuffer.array()));
                } else if(len == -1) {
                    iterator.remove();
                    System.out.println("客户端断开连接");
                }
            }
        }
    }
}

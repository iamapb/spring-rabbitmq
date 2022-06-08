package com.base.io.BIO;

import com.base.io.IOTest;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true) {
            System.out.println("连接");
            Socket clientSocket = serverSocket.accept();
            System.out.println("客户端连接");
            handler(clientSocket);
        }
    }

    public static void handler(Socket clientSocket) throws IOException {
        byte[] bytes = new byte[1024];
        System.out.println("准备read.....");
        int read = clientSocket.getInputStream().read(bytes);
        if (read != -1) {
            System.out.println("接收到客户短的数据"+ new String(bytes, 0, read));
        }
        clientSocket.getOutputStream().write("HelloClient".getBytes());
        clientSocket.getOutputStream().flush();
    }
}

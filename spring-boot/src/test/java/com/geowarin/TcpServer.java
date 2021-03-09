package com.geowarin;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String... args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(5000);
        try (Socket socket = serverSocket.accept()) {
            InputStream input = socket.getInputStream();
            for (int c; (c = input.read()) != -1; ) {
                System.out.print((char) c);
            }
        }
    }
}

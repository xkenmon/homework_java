package cn.bigmeng.homework_java.experiment.net.echo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("Server started, wait for connect...");
        while (true) {
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String rmIp = socket.getRemoteSocketAddress().toString();
            System.out.println(new Date() + " -- connected from " + rmIp);

            String line;
            while (!(line = br.readLine()).equals("#END")) {
                System.out.println(new Date() + " -- recv from " + rmIp + " : " + line);
                bw.write(line + '\n');
                bw.flush();
            }
        }
    }
}

package cn.bigmeng.homework_java.experiment.net.echo;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line = input.readLine()).equals("#END")) {
            bw.write(line);
            bw.newLine();
            bw.flush();
            System.out.println(br.readLine());
        }
        bw.write(line);
        bw.newLine();
        bw.close();
    }
}

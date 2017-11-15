package cn.bigmeng.homework_java.experiment.net.helloEcho;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class HelloEchoClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket(InetAddress.getLocalHost(), 8888);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line = input.readLine()).equals("#END")) {
            if (line.equals("#ENDSERVER")){
                bw.write(line+'\n');
                bw.close();
                System.exit(0);
            }
            bw.write(line+"\r\n");
            bw.flush();
            System.out.println("client send to server : " + line);
            System.out.println("server send to client : " + br.readLine());
        }
        bw.write("#END\n");
        bw.close();
    }
}

package cn.bigmeng.homework_java.experiment.net.helloEcho;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class HelloEchoServer {
    public static void main(String[] args) throws IOException {
        try {
            ServerSocket sSoc = new ServerSocket(8888);
            while (true) {
                Socket s = sSoc.accept();
                InputStreamReader isr = new InputStreamReader(s.getInputStream());
                OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
                BufferedReader br = new BufferedReader(isr);
                BufferedWriter bw = new BufferedWriter(osw);
                String line;
                while (!(line = br.readLine()).equals("#END")) {
                    if (line.equals("#ENDSERVER")){
                        s.close();
                        System.out.println(new Date()+"--received msg #ENDSERVER, Exit...");
                        System.exit(0);
                    }
                    System.out.println(new Date() + "--received msg : " + line);

                    if (line.equals("hello")) {
                        bw.write("Hello!\n");
                        System.out.println(new Date() + "--send msg : Hello!");
                    } else {
                        bw.write("not hello.\n");
                        System.out.println(new Date() + "--send msg : not hello");
                    }
                    bw.flush();
                }
                System.out.println(new Date()+"--received msg #END, so close this socket.");
                bw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

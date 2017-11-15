package cn.bigmeng.homework_java.experiment.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringInput {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        System.out.println("please enter chars, #END means end of input.");
        String line;
        while (!(line = bufferedReader.readLine()).equals("#END")) {
            System.out.println(line);
        }
        reader.close();
    }
}

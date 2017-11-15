package cn.bigmeng.homework_java.experiment.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetFileInfo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please enter file path(for example C:\\):");
        String fileName = reader.readLine();
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File isn't exists.");
            System.exit(0);
        }
        System.out.println("File Path: " + file.getAbsolutePath());
        if (file.isDirectory()) {
            System.out.println("Type: Dir");
            System.out.println("Subdirectory:");
            for (File f : file.listFiles()) {
                System.out.println("\t" + f.getName());
            }
        } else {
            System.out.println("Type: File");
            System.out.println("Size(byte): " + file.length());
        }
        reader.close();
    }
}

package cn.bigmeng.homework_java.experiment.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileEqual {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter File_1 path:");
        String fileName_1 = sc.nextLine();
        System.out.println("please enter File_2 path:");
        String fileName_2 = sc.nextLine();
        boolean isEqual = isEqual(new File(fileName_1), new File(fileName_2));
        System.out.println("is Equal? : " + isEqual);
    }

    public static boolean isEqual(File f1, File f2) throws IOException {
        if (f1.length() != f2.length())
            return false;
        FileInputStream fin_1 = new FileInputStream(f1);
        FileInputStream fin_2 = new FileInputStream(f2);
        BufferedInputStream br_1 = new BufferedInputStream(fin_1);
        BufferedInputStream br_2 = new BufferedInputStream(fin_2);
        byte[] buf1 = new byte[1024 * 1024];
        byte[] buf2 = new byte[1024 * 1024];
        int i1;
        while (true) {
            if ((i1 = br_1.read(buf1)) == br_2.read(buf2)) {
                if (i1 == -1) {
                    return true;
                }
                if (!Arrays.equals(buf1, buf2))
                    return false;
            } else {
                return false;
            }
        }
    }
}

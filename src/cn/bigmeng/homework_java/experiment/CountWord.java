package cn.bigmeng.homework_java.experiment;

import java.util.Scanner;

/**
 * CountWord
 * @Author bigmeng
 */
public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String all = "";
        System.out.println("输入一段文字，单独一行\"EOF\"结束输入，程序将统计输入的单词数量：");
        for (String one = ""; !(one=sc.nextLine()).equals("EOF"); all += one+"\n")
            ;
        String[] arr = all.split("\\W+");
        System.out.println("总字符数：" + arr.length);
        for (String s : arr) {
            System.out.print(" | "+s);
        }
        System.out.println(" |");
    }
}
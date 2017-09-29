package cn.bigmeng.homework_java.cp_4;

import java.util.Scanner;

/**
 * 第十题：约分
 */
public class Reduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个分数：\n");
        int m = sc.nextInt();
        System.out.print("-\n");
        int n = sc.nextInt();

        int gcd = GCD.euclid(m, n);

        m /= gcd;
        n /= gcd;
        System.out.println("\n结果：\n\n" + m + (n == 1 ? "" : ("\n-\n" + n)));
    }
}

package cn.bigmeng.homework_java.cp_4;

import java.util.Scanner;

/**
 * 第十一题
 */
public class Last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        float i = sc.nextInt();
        float sum = 1f;
        for (int j = 1; j < i; j++) {
            float r = recursion(j);
            sum += j / r;
        }
        System.out.println("rst : " + sum);
    }

    /**
     * 求阶乘（递归法）
     *
     * @param n para
     * @return rst
     */
    private static int recursion(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * recursion(n - 1);
        }
    }
}

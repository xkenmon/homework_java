package cn.bigmeng.homework_java.cp_4;

/**
 * 第二题
 * 99乘法表
 */
public class MultiTable {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + "×" + i + "=" + (i * j) + "\t");
            System.out.println();
        }
    }
}

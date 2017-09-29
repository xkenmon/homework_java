package cn.bigmeng.homework_java.cp_1;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ":" + get(i));
        }
    }

    private static long get(int n) {
        long[] arr = new long[2];
        arr[0] = 0;
        arr[1] = 1;
        if (n <= 0)
            return arr[0];
        if (n < 3) {
            return arr[n - 1];
        }
        long rst = 0;
        for (int i = 3; i <= n; i++) {
            rst = arr[0] + arr[1];
            long temp = arr[0];
            arr[0] = arr[1];
            arr[1] += temp;
        }
        return rst;
    }
}

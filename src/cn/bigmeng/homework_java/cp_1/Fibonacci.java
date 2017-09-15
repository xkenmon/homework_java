package cn.bigmeng.homework_java.cp_1;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ":" + get(i));
        }
    }

    private static int get(int n) {
        int[] arr = new int[2];
        arr[0] = 0;
        arr[1] = 1;
        if (n <= 0)
            return arr[0];
        if (n < 3) {
            return arr[n - 1];
        }
        int rst = 0;
        for (int i = 3; i <= n; i++) {
            rst = arr[0] + arr[1];
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] += temp;
        }
        return rst;
    }
}

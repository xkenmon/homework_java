package cn.bigmeng.homework_java.cp_1;

import java.util.Random;

public class Average {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 10;
        int[] arr = new int[n];
        System.out.println("array:[");
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt();
            System.out.print(arr[i]);
            System.out.println(',');
        }
        System.out.println(']');
        float avg = getAverage(arr);
        System.out.println("avg = " + avg);
    }

    private static float getAverage(int[] arr) {
        float sum = 0;
        float avg;
        for (int temp : arr) {
            sum += temp;
        }
        avg = sum / arr.length;
        return avg;
    }
}

package cn.bigmeng.homework_java.cp_1;

import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        Random random = new Random();
        int len = 10;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt();
        }
        System.out.println("before sort:");
        printArr(arr);
        sort(arr);
        System.out.println("after sort:");
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        System.out.println("[");
        for (int temp : arr) {
            System.out.println(temp + ",");
        }
        System.out.println("]");
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
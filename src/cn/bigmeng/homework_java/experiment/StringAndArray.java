package cn.bigmeng.homework_java.experiment;

import java.util.Scanner;

public class StringAndArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        quickSort(arr, 0, arr.length-1);
        System.out.println("排序结果:");
        for (int i : arr) {
            System.out.print(i+"\t");
        }

    }

    /**
     * 快速排序算法
     * @param arr 需要排序的数组
     * @param start 排序开始的位置
     * @param end 若排序整个数组传入 arr.length-1
     */
    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end)
            return;
        int mid = arr[end];
        int left = start, right = end - 1;
        while (left < right) {
            while (arr[left] <= mid && left < right)
                left++;
            while (arr[right] >= mid && left < right)
                right--;
            //            swap(left, right);
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        if (arr[left] >= arr[end]) {
            //            swap(left, end);
            int temp = arr[left];
            arr[left] = arr[end];
            arr[end] = temp;
        } else
            left++;
        quickSort(arr, start, left - 1);
        quickSort(arr, left + 1, end);
    }
}

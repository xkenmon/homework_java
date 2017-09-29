package cn.bigmeng.homework_java.cp_4;

import cn.bigmeng.homework_java.cp_1.Sort;

import java.util.Scanner;

/**
 * 第一题
 */
public class SortInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        Sort.insertSort(arr);
        Sort.printArr(arr);
    }
}

package cn.bigmeng.homework_java.cp_1;

import java.util.Date;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        Random random = new Random();
        //五万条数据
        int len = 50000;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(100);
        }

        printArr(arr);
        speedTest(arr);
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int temp : arr) {
            System.out.print(temp + ",");
        }
        System.out.println("]");
    }

    //插入排序
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            for (; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
    }

    //冒泡排序
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //鸡尾酒排序(改进的冒泡排序)
    public static void 鸡尾酒排序(int arr[]) {
        int bottom = 0;
        int top = arr.length - 1;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = bottom; i < top; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            top--;
            for (int i = top; i > bottom; i--) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    swapped = true;
                }
            }
            bottom++;
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

    public static void speedTest(int[] arr) {

        System.out.println("数组大小： " + arr.length);

        Date start, end;

        System.out.println("快速排序:");
        start = new Date();
        quickSort(arr.clone(), 0, arr.length - 1);
        end = new Date();
        System.out.println("耗时：" + (end.getTime() - start.getTime()) + " ms");

        System.out.println("插入排序：");
        start = new Date();
        insertSort(arr.clone());
        end = new Date();
        System.out.println("耗时：" + (end.getTime() - start.getTime()) + " ms");

        System.out.println("鸡尾酒排序:");
        start = new Date();
        鸡尾酒排序(arr.clone());
        end = new Date();
        System.out.println("耗时：" + (end.getTime() - start.getTime()) + " ms");

        System.out.println("冒泡排序");
        start = new Date();
        bubbleSort(arr.clone());
        end = new Date();
        System.out.println("耗时：" + (end.getTime() - start.getTime()) + " ms");
    }
}
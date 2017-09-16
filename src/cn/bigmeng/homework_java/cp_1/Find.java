package cn.bigmeng.homework_java.cp_1;

public class Find {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 2, 6, 8, 2, 9, 3, 4};
        Sort.printArr(arr);
        int rst = 6;
        int num = search(arr, rst);
        System.out.println(rst + "@" + num);
    }

    //暴力搜索
    public static int search(int[] arr, int dst) {
        int i = 0;
        for (int temp : arr) {
            //从1开始计数
            i++;
            if (dst == temp)
                return i;
        }
        return -1;
    }

    //二分查找
    public static int binSearch(int[] arr, int dst) {
        Sort.quickSort(arr, 0, arr.length - 1);
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == dst)
                return mid;
            if (arr[mid] > dst)
                high = mid + 1;
            else low = mid + 1;
        }
        return -1;
    }
}
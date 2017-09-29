package cn.bigmeng.homework_java.cp_4;

import cn.bigmeng.homework_java.cp_1.Sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 第三题
 * 奇数和素数
 */
public class OddAndPrime {
    public static void main(String[] args) {
        ArrayList<Integer> odd = getOdd(50);
        ArrayList<Integer> pri = getPrime(50);
        System.out.println("50以内的奇数：");
        for (int v : odd) {
            System.out.println(v);
        }
        System.out.println("50以内的素数：");
        for (int v : pri) {
            System.out.println(v);
        }
    }

    /**
     * 获取指定范围的奇数（从零开始）
     *
     * @param range 指定的范围
     * @return 返回的奇数列表
     */
    private static ArrayList<Integer> getOdd(int range) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < range; i++) {
            if (i % 2 != 0) {
                list.add(i);
            }
        }
        return list;
    }

    /**
     * 获取指定范围的素数（从零开始）
     *
     * @param range 范围
     * @return 返回一个素数列表
     */
    public static ArrayList<Integer> getPrime(int range) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);

        for (int i = 5; i < range; i++) {
            boolean isP = true;
            for (int j = 2; j < range / 2 + 1; j++) {
                if (i == j)
                    continue;
                if (i % j == 0) {
                    isP = false;
                    break;
                }
            }
            if (isP)
                list.add(i);
        }
        return list;
    }
}

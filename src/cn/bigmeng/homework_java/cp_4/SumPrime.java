package cn.bigmeng.homework_java.cp_4;

import java.util.ArrayList;

/**
 * 第四题
 * 1-100内的素数和
 */
public class SumPrime {
    public static void main(String[] args) {
        ArrayList<Integer> list = OddAndPrime.getPrime(100);
        int sum=0;
        for(int v:list){
            sum+= v;
        }
        System.out.println("100以内的素数和:"+sum);
    }
}

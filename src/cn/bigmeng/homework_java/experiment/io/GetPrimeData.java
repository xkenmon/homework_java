package cn.bigmeng.homework_java.experiment.io;

import cn.bigmeng.homework_java.cp_4.OddAndPrime;

import java.io.*;
import java.util.ArrayList;

public class GetPrimeData {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> primeList = OddAndPrime.getPrime(100);

        File out = new File("prime.dat");
        if (out.exists()){
            System.out.println(out.getAbsolutePath()+" is exists. now override...");
        }
        FileOutputStream fout = new FileOutputStream(out);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fout));
        for (Integer i:primeList){
            bw.write(i.toString());
            bw.newLine();
        }
        bw.close();
        System.out.println("prime.dat is created at "+out.getAbsolutePath());
        System.out.println("now read prime.dat...");
        File in = new File("prime.dat");
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(in)));
        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        System.out.println("okay.");
    }
}

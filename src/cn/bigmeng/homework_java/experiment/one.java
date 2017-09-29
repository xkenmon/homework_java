package cn.bigmeng.homework_java.experiment;

public class one {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 0;i <= 100;i++){
            if (i % 2 == 0) {
                sum += i;
                System.out.println("sum += " + i);
            }
        }
        System.out.println("sum = " + sum);
    }
}

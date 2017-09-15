package cn.bigmeng.homework_java.cp_1;

public class MostValue {
    public static void main(String[] args) {
        int[] list = new int[]{10,54,54,155,23,5,0,7,6,-10};
        int[] rst = getMost(list);
        System.out.println("Min: "+rst[0]);
        System.out.println("Max: "+rst[1]);
    }

    private static int[] getMost(int[] array) {
        int max = array[0], min = array[0];
        for (int temp : array) {
            if (temp >= max)
                max = temp;
            else if (temp <= min){
                min = temp;
            }
        }
        return new int[]{min,max};
    }
}

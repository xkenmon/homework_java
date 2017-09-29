package cn.bigmeng.homework_java.cp_4;

/**
 * 第7题：判断“水仙花数”
 */
public class NarcissisticNumber {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (isNarNum(i)){
                System.out.println(i);
            }
        }
    }

    /**
     * 判断一个数是不是1000以内的水仙花数
     * 注意：这里的"水仙花数"是指一个3位数，其个位、十位、百位上的数字的立方和等于该数本身，例如371=33+73+13
     * @param n 需要判断的数
     * @return  返回是否为该类型的“水仙花数”
     */
    private static boolean isNarNum(int n) {
        if (n > 999 || n < 0)
            return false;
        int hun = n % 1000 / 100;
        int ten = n % 100 / 10;
        int low = n % 10;
//        System.out.println(hun + "|" + ten + "|" + low);
        return n == Math.pow(hun,3)+Math.pow(ten,3)+Math.pow(low,3);
    }
}

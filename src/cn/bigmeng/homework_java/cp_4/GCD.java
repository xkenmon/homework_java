package cn.bigmeng.homework_java.cp_4;

/**
 * 第九题：求解最大公约数
 */
public class GCD {
    public static void main(String[] args) {
        System.out.println(euclid(4, 6));
    }

    /**
     * Euclid算法求解最大公约数（gracefulness)
     *
     * @param m one
     * @param n anther
     * @return result
     */
    public static int euclid(int m, int n) {
        if (n == 0)
            return m;
        return euclid(n, m % n);
     }
}

package cn.bigmeng.homework_java.cp_4;

/**
 * 第八题。。
 */
public class BoredFunc {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("when x = "+i+", y = "+bFuck(i));
        }
    }

    /**
     * this is a bored function
     *
     * @param x para
     * @return rst
     */
    private static int bFuck(int x) {
        if (x < 1)
            return x;
        if (x < 10)
            return 3 * x - 1;
        return 4 * x;
    }
}

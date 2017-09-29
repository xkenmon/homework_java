package cn.bigmeng.homework_java.cp_4;

/**
 * 第五题：输出菱形
 *
 */
public class PrintStart {

    public static void main(String[] args) {
        printStart(33, false, "*");
    }

    /**
     * 输出菱形图案
     *
     * @param max      最大行的星星数目（尽量为奇数）
     * @param isHollow 是否为空心菱形
     * @param start    星星的样式
     */
    private static void printStart(int max, boolean isHollow, String start) {
        if (max % 2 == 0)
            System.out.println("输出的图案可能不规整，尽量输入奇数!");
        boolean change = false;
        for (int i = 1; i >= 0; ) {
            if (i >= max)
                change = true;
            for (int j = 0; j < (max - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (!isHollow)
                    System.out.print(start);
                else {
                    System.out.print(j == 1 || j == i ? start : " ");
                }
            }
            System.out.println();

            if (change)
                i -= 2;
            else
                i += 2;
        }
    }
}

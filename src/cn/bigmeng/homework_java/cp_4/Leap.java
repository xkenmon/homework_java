package cn.bigmeng.homework_java.cp_4;

import cn.bigmeng.homework_java.cp_1.LeapYear;

/**
 * 第六题：输出闰年
 */
public class Leap {
    public static void main(String[] args) {
        formatLeapYear(1900, 2100, 5);
    }

    /**
     * 按格式输出闰年
     *
     * @param start   开始年份
     * @param end     结束年份
     * @param lenFeed 每行容量
     */
    private static void formatLeapYear(int start, int end, int lenFeed) {
        for (int i = start, sum = 0; i <= end; i++) {
            if (LeapYear.getLeap(i)) {
                System.out.print(i + "\t");
                sum++;
                if (sum % lenFeed == 0) {
                    System.out.println();
                }
            }
        }
    }
}

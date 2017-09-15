package cn.bigmeng.homework_java.cp_1;

public class LeapYear {
    public static void main(String[] args) {
        long year = 2016;
        System.out.println(year + " is leap? " + getLeap(year));
    }

    private static boolean getLeap(long year) {
        boolean isLeap = false;
        if (year % 4 == 0) {
            isLeap = true;
            if (year % 100 == 0 && year % 400 != 0)
                isLeap = false;
            if (year % 3200 == 0)
                isLeap = false;
        }
        return isLeap;
    }
}

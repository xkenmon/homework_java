package cn.bigmeng.homework_java.cp_1;

public class LeapYear {
    public static void main(String[] args) {
        long[] years = new long[3000];
        for (int i = 0; i < years.length; i++)
            years[i] = i;
        for (long year : years)
            System.out.println("公元 "+year + " 年是 " + (getLeap(year)?"闰年":"平年"));
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

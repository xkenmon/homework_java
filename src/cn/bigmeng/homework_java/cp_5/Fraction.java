package cn.bigmeng.homework_java.cp_5;

import cn.bigmeng.homework_java.cp_4.GCD;

/**
 * 分数类
 */
public class Fraction {
    private int numerator, denominator;

    /**
     * 构造一个分数
     *
     * @param numerator   分子
     * @param denominator 分母
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction a) {
        int gcd = GCD.euclid(a.denominator, this.denominator);  //最大公约数
        int multiple = denominator * a.denominator / gcd;   //最小公倍数
        Fraction t1 = new Fraction(numerator*(multiple/denominator), multiple);
        Fraction t2 = new Fraction(a.numerator*(multiple/a.denominator),multiple);
        Fraction sum = new Fraction(t1.numerator + t2.numerator, gcd);
        return sum.reduct();
    }

    public Fraction reduce(Fraction a) {
        int gcd = GCD.euclid(a.denominator, this.denominator);  //最大公约数
        int multiple = denominator * a.denominator / gcd;   //最小公倍数
        Fraction t1 = new Fraction(numerator*(multiple/denominator), multiple);
        Fraction t2 = new Fraction(a.numerator*(multiple/a.denominator),multiple);
        Fraction sum = new Fraction(t1.numerator - t2.numerator, gcd);
        return sum.reduct();
    }

    public Fraction multiply(Fraction a) {
        return new Fraction(numerator*a.numerator,denominator*a.denominator).reduct();
    }

    public Fraction divide(Fraction a) {
        return this.multiply(new Fraction(a.denominator,a.numerator));
    }

    public void printFrac() {
        System.out.println(numerator + "/" + denominator);
    }

    public void printFloat() {
        System.out.println((float)numerator/(float)denominator);
    }

    private Fraction reduct() {
        int gcd = GCD.euclid(numerator, denominator);
        return new Fraction(numerator / gcd, denominator / gcd);
    }
}

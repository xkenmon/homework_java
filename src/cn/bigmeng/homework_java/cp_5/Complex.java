package cn.bigmeng.homework_java.cp_5;

public class Complex {
    private int real;
    private int imagine;

    public Complex(){
        real = 0;
        imagine = 0;
    }

    public Complex(int r,int i){
        this.imagine = i;
        this.real = r;
    }

    public Complex add(Complex complex){
        return new Complex(real+complex.real,imagine + complex.imagine);
    }

    @Override
    public String toString() {
        return real + " + " + imagine + "i";
    }
}

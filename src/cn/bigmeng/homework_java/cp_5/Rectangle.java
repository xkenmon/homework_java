package cn.bigmeng.homework_java.cp_5;

public class Rectangle {
    private int weight;
    private int height;

    public int circum() {
        return 2 * (weight + height);
    }
    public int area(){
        return weight*height;
    }
}

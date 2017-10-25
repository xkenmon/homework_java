package cn.bigmeng.homework_java.cp_5.Poker.enums;

public enum Num {
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    J("J"),
    Q("Q"),
    K("K"),
    A("A");
    private String num;

    public String getNum() {
        return num;
    }

    Num(String num) {
        this.num = num;
    }
}

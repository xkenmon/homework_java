package cn.bigmeng.homework_java.cp_5.Poker.enums;

public enum Type {
    //红桃
    HEART("♥"),
    //黑桃
    SPADE("♠"),
    //梅花
    CLUB("♣"),
    //方块
    DIAMOND("♦");

    private String c;

    private Type(String c) {
        this.c = c;
    }

    public String getC() {
        return c;
    }
}

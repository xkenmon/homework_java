package cn.bigmeng.homework_java.cp_5.Poker;

import cn.bigmeng.homework_java.cp_5.Poker.enums.Num;
import cn.bigmeng.homework_java.cp_5.Poker.enums.Type;

public class Poker {
    private Type type;
    private Num num;

    public Poker(Type type, Num num) {
        this.type = type;
        this.num = num;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Num getNum() {
        return num;
    }

    public void setNum(Num num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Poker{" +
                "type=" + type +
                ", num=" + num +
                '}';
    }
}

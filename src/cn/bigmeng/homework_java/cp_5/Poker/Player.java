package cn.bigmeng.homework_java.cp_5.Poker;

import java.util.ArrayList;

public class Player {
    private ArrayList<Poker> pokers;
    private String name;

    public Player() {
        pokers = new ArrayList<Poker>();
        name = "Undefine";
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(ArrayList<Poker> pokers, String name) {
        this.pokers = pokers;
        this.name = name;
    }

    public ArrayList getPokers() {
        return pokers;
    }

    public void setPokers(ArrayList<Poker> pokers) {
        this.pokers = pokers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPoker(Poker poker){
        pokers.add(poker);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n玩家名称：").append(name);
        stringBuilder.append("\n手牌数量：").append(pokers.size());
        stringBuilder.append("\n手牌：");
        for (Poker poker:pokers){
            stringBuilder.append(poker.getType().getC()).append(poker.getNum().getNum()).append("\t");
        }
        return stringBuilder.toString();
    }
}

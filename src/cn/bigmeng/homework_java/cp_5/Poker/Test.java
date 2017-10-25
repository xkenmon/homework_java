package cn.bigmeng.homework_java.cp_5.Poker;

import cn.bigmeng.homework_java.cp_5.Poker.enums.Num;
import cn.bigmeng.homework_java.cp_5.Poker.enums.Type;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

        Player[] players = new Player[4];
        for (int i = 0;i < players.length;i++){
            players[i] = new Player();
        }
        players[0].setName("东");
        players[1].setName("西");
        players[2].setName("南");
        players[3].setName("北");

        Random random = new Random();
        ArrayList<Poker> allPoker = new ArrayList<Poker>();
        for (Type type : Type.values()) {
            for (Num num : Num.values()) {
                allPoker.add(new Poker(type, num));
            }
        }
        ArrayList randomList = getRandomList(allPoker,allPoker.size());
        for (int i = 0; i < 52;) {
            for (int j = 0; j < 4; j++,i++) {
                players[j].addPoker((Poker) randomList.get(i));
            }
        }
        for (Player player:players){
            System.out.println(player.toString());
        }
    }
    /**
     * 从list中随机抽取若干不重复元素
     *
     * @param paramList:被抽取list
     * @param count:抽取元素的个数
     * @return 由抽取元素组成的新list
     */
    public static ArrayList getRandomList(ArrayList paramList,int count){
        if(paramList.size()<count){
            return paramList;
        }
        Random random=new Random();
        ArrayList<Integer> tempList=new ArrayList<Integer>();
        ArrayList<Object> newList=new ArrayList<Object>();
        int temp=0;
        for(int i=0;i<count;i++){
            temp=random.nextInt(paramList.size());//将产生的随机数作为被抽list的索引
            if(!tempList.contains(temp)){
                tempList.add(temp);
                newList.add(paramList.get(temp));
            }
            else{
                i--;
            }
        }
        return newList;
    }
}

package cn.bigmeng.homework_java.cp_5.Market;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GoodsMessage {
    private int count;
    private HashMap<String, ArrayList<Goods>> producerInfo;
    private HashMap<Integer, ArrayList<Goods>> priceInfo;

    public GoodsMessage(int count, HashMap<String, ArrayList<Goods>> producerInfo, HashMap<Integer, ArrayList<Goods>> priceInfo) {
        this.count = count;
        this.producerInfo = producerInfo;
        this.priceInfo = priceInfo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public HashMap<String, ArrayList<Goods>> getProducerInfo() {
        return producerInfo;
    }

    public void setProducerInfo(HashMap<String, ArrayList<Goods>> producerInfo) {
        this.producerInfo = producerInfo;
    }

    public HashMap<Integer, ArrayList<Goods>> getPriceInfo() {
        return priceInfo;
    }

    public void setPriceInfo(HashMap<Integer, ArrayList<Goods>> priceInfo) {
        this.priceInfo = priceInfo;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("所有商品信息如下:");
        stringBuilder.append("\n\t商品总数:").append(this.getCount());
        stringBuilder.append("\n\t产地信息：");
        for (Map.Entry<String, ArrayList<Goods>> entry : this.getProducerInfo().entrySet()) {
            stringBuilder.append("\n\t\t产地为 ").append(entry.getKey()).append(" 的商品数：").append(entry.getValue().size());
            for (Goods goods : entry.getValue()) {
                stringBuilder.append("\n\t\t\t").append(goods);
            }
        }
        stringBuilder.append("\n\t价格信息：");
        for (Map.Entry<Integer, ArrayList<Goods>> entry : this.getPriceInfo().entrySet()) {
            stringBuilder.append("\n\t\t价格为 ").append(entry.getKey()).append(" 的商品数:").append(entry.getValue().size());
            for (Goods goods : entry.getValue()) {
                stringBuilder.append("\n\t\t\t").append(goods);
            }
        }
        return stringBuilder.toString();
    }
}

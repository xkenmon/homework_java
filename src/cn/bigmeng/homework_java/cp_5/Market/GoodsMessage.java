package cn.bigmeng.homework_java.cp_5.Market;

import java.util.HashMap;

public class GoodsMessage {
    private int count;
    private HashMap<String,Integer> producerInfo;

    public GoodsMessage(int count, HashMap<String, Integer> producerInfo) {
        this.count = count;
        this.producerInfo = producerInfo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public HashMap<String, Integer> getProducerInfo() {
        return producerInfo;
    }

    public void setProducerInfo(HashMap<String, Integer> producerInfo) {
        this.producerInfo = producerInfo;
    }

    @Override
    public String toString() {
        return "GoodsMessage{" +
                "count=" + count +
                ", producerInfo=" + producerInfo +
                '}';
    }
}

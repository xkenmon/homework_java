package cn.bigmeng.homework_java.cp_5.Market;

import java.util.ArrayList;
import java.util.HashMap;

public class SupperMarket {
    private ArrayList<Goods> shelf;

    public Goods queryName(String goodsName) {
        for (Goods goods : shelf) {
            if (goods.getName().equals(goodsName)) {
                return goods;
            }
        }
        return null;
    }

    public ArrayList<Goods> queryProd(String prod) {
        ArrayList<Goods> goodsArrayList = new ArrayList<Goods>();
        for (Goods goods : shelf) {
            if (goods.getProducer().equals(prod)) {
                goodsArrayList.add(goods);
            }
        }
        return goodsArrayList;
    }

    public ArrayList<Goods> queryPrice(int price) {
        ArrayList<Goods> goodsArrayList = new ArrayList<Goods>();
        for (Goods goods : shelf) {
            if (goods.getPrice() == price) {
                goodsArrayList.add(goods);
            }
        }
        return goodsArrayList;
    }

    public GoodsMessage check() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (Goods goods : shelf) {
            if (map.containsKey(goods.getProducer())) {
                map.put(goods.getProducer(), map.get(goods.getProducer()) + 1);
            } else {
                map.put(goods.getProducer(), 0);
            }
        }
        return new GoodsMessage(shelf.size(), map);
    }

    public void add(Goods goods) {
        shelf.add(goods);
    }
}

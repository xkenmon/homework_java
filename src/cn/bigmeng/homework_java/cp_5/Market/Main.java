package cn.bigmeng.homework_java.cp_5.Market;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Goods> goodsArrayList = new ArrayList<Goods>();

        goodsArrayList.add(new Goods("orange", 2, "上海", 23));
        goodsArrayList.add(new Goods("apple", 2, "山西", 12));
        goodsArrayList.add(new Goods("phone", 1999, "北京", 1));
        goodsArrayList.add(new Goods("cup", 5, "上海", 4));
        goodsArrayList.add(new Goods("laptop", 2, "US", 6));

        SupperMarket market = new SupperMarket();
        //商品上架
        market.addAll(goodsArrayList);

        //按名称查询 phone
        System.out.println("按名称查询 phone:");
        System.out.println(market.queryName("phone") + "\n");

        //按价格查询 2
        System.out.println("按价格查询 2:");
        ArrayList<Goods> priceIsTwo = market.queryPrice(2);
        for (Goods goods : priceIsTwo) {
            System.out.println(goods);
        }
        System.out.println();

        //按产地查询 上海
        System.out.println("按产地查询 上海:");
        ArrayList<Goods> proIsShanghai = market.queryProd("上海");
        for (Goods goods : proIsShanghai) {
            System.out.println(goods);
        }
        System.out.println();

        //清点商品信息
        System.out.println(market.check());

        market.sale("phone",2000);
        market.sale("phone",2000);

        System.out.println(market.check());
    }
}

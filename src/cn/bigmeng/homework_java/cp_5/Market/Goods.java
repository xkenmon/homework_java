package cn.bigmeng.homework_java.cp_5.Market;

public class Goods {
    private String name;
    private int price;
    private String producer;

    public Goods(String name, int price, String producer) {
        this.name = name;
        this.price = price;
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "商品名称:" + name + "\t价格：" + price + "\t产地:" + producer;
    }

    @Override
    public boolean equals(Object obj) {
        if (Goods.class != obj.getClass()) {
            return false;
        }
        Goods goods = (Goods) obj;
        return goods.name.equals(name) && goods.getPrice() == price && goods.getProducer().equals(producer);
    }
}

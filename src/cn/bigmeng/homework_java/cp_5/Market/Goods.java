package cn.bigmeng.homework_java.cp_5.Market;

public class Goods {
    private String name;
    private int price;
    private String producer;
    private long count;

    public Goods(String name, int price, String producer, int count) {
        this.name = name;
        this.price = price;
        this.producer = producer;
        this.count = count;
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

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public void reduceCount() throws InsufficientFundsException {
        synchronized (this) {
            if (count < 1) {
                throw new InsufficientFundsException(this);
            } else {
                count--;
            }
        }
    }

    @Override
    public String toString() {
        return "商品名称:" + name + "\t价格：" + price + "\t产地:" + producer + "\t库存数量:" + count;
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

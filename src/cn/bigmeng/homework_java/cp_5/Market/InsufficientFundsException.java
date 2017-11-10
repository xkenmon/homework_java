package cn.bigmeng.homework_java.cp_5.Market;

public class InsufficientFundsException extends Exception {
    Goods goods;

    public InsufficientFundsException(Goods message) {
        this.goods = message;
    }

    @Override
    public String getMessage() {
        return goods.getName()+"库存不足!";
    }

}

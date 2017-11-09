package cn.bigmeng.homework_java.experiment;

public class Account {
    private int balance;

    //存款
    public void deposit(int m) {
        this.balance += m;
    }

    //取款
    public boolean withdraw(int m) {
        if (m > balance) {
            return false;
        } else {
            balance -= m;
        }
        return true;
    }

    //查询余额
    public int getBalance() {
        return balance;
    }
}

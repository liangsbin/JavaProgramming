package example1;

public class Bank {
    private double balance;
    private String account;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccount() {
        return account;
    }

    public Bank(double balance, String account) {
        this.balance = balance;
        this.account = account;
    }

    public void deposit(double amount){
        this.setBalance(this.getBalance()+amount);
        System.out.println("存款:" + account + "元, 当前余额:"+ this.getBalance() +"元");
    }

    public synchronized void withdrawal(double amount){
        if(this.getBalance() >= amount){
            this.setBalance(this.getBalance()-amount);
            System.out.println("取款:" + account + "元, 当前余额:"+ this.getBalance() +"元" );
        }
        else
        {
            System.out.println("余额不足!");

        }
    }
}

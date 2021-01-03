package example2;

public class Bank {
    private double balance;
    private String account;

    private boolean hasMoney = false;

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

    public synchronized void deposit(double amount) throws InterruptedException{
        if(hasMoney){
            wait();
        }
        else {
            this.setBalance(this.getBalance() + amount);
            System.out.println(Thread.currentThread().getName() + "存款:" + amount + "元, 当前余额:" + this.getBalance() + "元");
            hasMoney = true;
            notifyAll();
        }
    }

    public synchronized void withdrawal(double amount) throws InterruptedException{
        if(!hasMoney){
            wait();
        }
        else {
            if (this.getBalance() >= amount) {
                this.setBalance(this.getBalance() - amount);
                System.out.println(Thread.currentThread().getName() + "取款:" + amount + "元, 当前余额:" + this.getBalance() + "元");
            }
            else if(this.getBalance()<amount && this.getBalance()>=0){
                hasMoney = false;
                notify();
            }
            else {
                hasMoney = false;
                System.out.println("余额不足!");

            }
        }
    }
}

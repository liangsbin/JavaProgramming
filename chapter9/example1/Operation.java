package example1;

public class Operation implements Runnable{
    Bank bank ;
    double amount;
    public Operation(Bank bank, double amount){
        this.bank = bank;
        this.amount = amount;
    }

    public void run(){
        bank.withdrawal(amount);
    }
}

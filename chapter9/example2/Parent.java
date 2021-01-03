package example2;

public class Parent extends Thread {
    Bank bank;
    double amount;

    public Parent(String name,Bank bank,double amount){
        super(name);
        this.bank = bank;
        this.amount = amount;
    }

    public void run(){
        for(int j=0;j<100;j++){
            try{
                bank.deposit(amount);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

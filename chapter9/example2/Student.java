package example2;

public class Student extends Thread{
    Bank bank;
    double amount;

    public Student(String name,Bank bank,double amount){
        super(name);
        this.bank = bank;
        this.amount = amount;
    }

    public void run(){
        for(int i=0;i<100;i++){
            try {
                bank.withdrawal(amount);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

package example1;

public class Main {
    public static void main(String[] args) {
        Bank bank =  new Bank(2000.0,"Bank of China 0001");
        Operation operation = new Operation(bank,700);

        for(int i=1;i<5;i++){
            Thread  t = new Thread(operation,"A");
            t.start();
        }

    }
}

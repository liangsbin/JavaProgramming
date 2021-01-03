public class Yield {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt,"T1");
        Thread t2 = new Thread(mt,"T2");

        t1.start();
        t2.start();


        for(int j=1;j<10;j++){
            System.out.println("main Thread has run " + j + " times");
            if(j==5)
            {
                try {
                    t1.join();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}


class MyThread implements Runnable{
    public void run(){

        for(int i=1;i<11;i++){
            System.out.println( Thread.currentThread().getName() + " has run "  + i + " times");
            if(i==5)
            {
                System.out.println( Thread.currentThread().getName() + " yield...");
                Thread.currentThread().yield();

            }
        }
    }

}
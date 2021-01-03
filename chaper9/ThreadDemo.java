public class ThreadDemo {
    public static void main(String[] args) {

        MyThread mt = new MyThread();  //Runnable
        Thread a = new Thread(mt,"A");   //Thread(Runnable target,String name)
        Thread b  = new Thread(mt,"B");
        //b.setName("B");
        b.setPriority(Thread.MAX_PRIORITY);
        a.setPriority(Thread.MIN_PRIORITY);
        a.start();
        b.start();
    }
}

class MyThread implements  Runnable{
    public void run(){
        for(int i=1;i<=50;i++){
            System.out.println("Thread "+ Thread.currentThread().getName() + " executed " + i + "times.");
        }
    }



    public MyThread(){
        System.out.println("Thread Created.");
    }
}

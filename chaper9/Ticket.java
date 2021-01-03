public class Ticket {
    public static void main(String[] args) {
        //TicketSale ts = new TicketSale();
        for(int i=1;i<5;i++){
            //new Thread(ts,"窗口"+i).start();
            new TicketSale("窗口"+i).start();
        }
    }
}

/**
 * 模拟售票线程
 */
class TicketSale extends Thread{

    private static int  ticketNum = 100;
    public void run(){
        while(ticketNum > 0){
            System.out.println(Thread.currentThread().getName() + "售出了第" + ticketNum-- + "票。");
            try{
                Thread.currentThread().sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public TicketSale(String name){
        super(name);
    }
}

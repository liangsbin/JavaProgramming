import java.io.*;
//Persistence 持久化
public class SaveUser {
    public static void main(String[] args) {
        User zhangsan = new User("zhangsan","123","admin","jwc");

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream("d:/data.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(zhangsan);
            fos.close();
            oos.close();

        }catch (IOException e){
            e.printStackTrace();
        }

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream("d:/data.dat");
            ois = new ObjectInputStream(fis);
            User user = (User) ois.readObject();
            fis.close();
            ois.close();
            System.out.println(user);
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e1){
            e1.printStackTrace();
        }


    }
}

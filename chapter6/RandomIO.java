import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomIO {
    public static void main(String[] args) {
        RandomAccessFile raf = null;
        try{
            raf = new RandomAccessFile("d:/dest.java","rw");
            raf.seek(raf.length());//跳转到文件末尾
            raf.writeUTF("//这是追加的内容");

            raf.seek(0);
            String s = null;
            while ( (s=raf.readLine())!=null){
                s = new String(s.getBytes("iso-8859-1"),"utf-8");
                System.out.println(s);
            }
            raf.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

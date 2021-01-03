import java.io.*;

public class FileIO {

    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        InputStreamReader isr = null;
        try {

            fos = new FileOutputStream("d:/file.txt");
            String s = "你好，软件工程！java";
            byte[] b = s.getBytes();
            fos.write(b);
            fos.close();

            fis = new FileInputStream("d:/file.txt");
            isr = new InputStreamReader(fis,"utf-8");
            int data = 0;
            while( (data=isr.read())!=-1)
            {
                System.out.print((char)data);
            }

            fis.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

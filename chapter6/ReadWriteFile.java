import java.io.*;

// d:/doc/word/FileTest.java  --> e:data.txt
public class ReadWriteFile {
    public static void main(String[] args) {
        File source = new File("d:/doc/word/FileTest.java");
        File dest = new File("e:/data.txt");
        FileOutputStream os;  //write
        FileInputStream is;   //read
        BufferedInputStream bis;
        BufferedOutputStream bos;
        try{
            is = new FileInputStream(source);
            bis = new BufferedInputStream(is);
            int data = 0;
            StringBuffer str= new StringBuffer("");
            byte[] b2 = new byte[16];
            while( (data=bis.read(b2))!=-1){
                str.append(new String(b2));
            }
            os =new FileOutputStream(dest);
            bos = new BufferedOutputStream(os);
           String s = str.toString();
           byte[] b = s.getBytes();
           bos.write(b);
           bos.close();
           bis.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

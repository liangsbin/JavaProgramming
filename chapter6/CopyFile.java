import java.io.*;

/**
 * copy a file from source to dest
 * source: e:/doc/word/CreateFile.java
 * dest:d:/program/CreateFile.java
 */
public class CopyFile {
    public static void main(String[] args)  {
        String source = "e:/doc/word/CreateFile.java";
        String dest = "e:/program/";

        FileInputStream is;
        FileOutputStream os;

        BufferedInputStream bis;
        BufferedOutputStream bos;
        StringBuffer s = new StringBuffer("");
        File f3 = new File(source);
        try {
            File file = new File(dest);
            if(!file.exists())
                file.mkdir();

            is = new FileInputStream(source);
            bis = new BufferedInputStream(is);
            os = new FileOutputStream(file+"/data.java");
            bos = new BufferedOutputStream(os);
            int data = 0;
            byte[] b3 = new byte[(int)f3.length()];
            while((data = bis.read(b3))!=-1){
                String s1 = new String(b3);
                s.append(s1);
            }
            String str = s.toString();
            byte[] b = str.getBytes();
            bos.write(b);
            is.close();
            os.close();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}

import java.util.Enumeration;
import java.util.Properties;
import java.io.*;
public class PropertiesTest {
    public static void main(String[] args) {
        Properties p = new Properties();
//        p.setProperty("user","root");
//        p.setProperty("password","123");
//        p.setProperty("url","jdbc://mysql:localhost:3306/db");

        FileReader fr = null;
        try{
            fr = new FileReader("d:/db.properties");
            p.load(fr);
        }catch (IOException e){
            e.printStackTrace();
        }

        Enumeration en = p.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}

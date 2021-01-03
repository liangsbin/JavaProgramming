import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineReader {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        LineNumberReader lr = null;
        try{
            fr = new FileReader("c:/FileRW.java");
            fw = new FileWriter("d:/dest.java");
            lr = new LineNumberReader(fr);
            lr.setLineNumber(0);//设置起始行号，从1开始
            String line = "";
            while ( (line=lr.readLine())!= null){
                fw.write(lr.getLineNumber()+" "+line);
                fw.write("\r\n");
            }
            fr.close();
            fw.close();
            lr.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}


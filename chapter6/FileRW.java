import java.io.*;

public class FileRW {
    public static void main(String[] args) {
        String s = "你好！";
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        String str="";
        try{
            fw = new FileWriter("d:/f1.txt");
            fr = new FileReader("d:/dest.java");

            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);

            bw.write(s);
            int data=0;

            //while((data=fr.read())!=-1){
            while((s=br.readLine())!=null){

                str+= s+"\n";
            }
        System.out.println(str);
            fw.close();
            fr.close();
        }catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}

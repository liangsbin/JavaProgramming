import java.text.SimpleDateFormat;

public class RuntimeTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime(); //singleton
        try{
            Process process = runtime.exec("notepad.exe");

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String s = "2020-11-11 11:11:00";    //format()  Date-->String
            java.util.Date date = sdf.parse(s);  //parse()  String-->Date
            System.out.println(date);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

import java.io.IOException;

public class SystemIn {
    public static void main(String[] args) {
        int data = 0;
        StringBuffer s = new StringBuffer();
        System.out.println("Input Data, press q to quit:");
        try{
            while( (data=System.in.read()) !='q'){
                s.append((char)data);
            }
            System.out.println(s);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

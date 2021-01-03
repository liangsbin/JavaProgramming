import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {
        String regex = "[0123456789.]*";
        String s = "本月的话费账单：通话费：36.12，流量：23.16，短信：1.20";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        double total = 0.0;
        while(matcher.find()){
            String str = matcher.group();
            System.out.println(str);
            double d = Double.parseDouble(str);
            total+=d;
        }
        System.out.println("本月总花费：" + total);

    }
}

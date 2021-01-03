import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String,String> map = new LinkedHashMap<String,String>();
        map.put("one","zhangsan");
        map.put("two","lisi");
        map.put("three","wangwu");
        map.put("four","chengliu");
        map.put("five","liuqi");

        System.out.println(map);

        System.out.println(map.get("two"));

        Set set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            System.out.println(key + "-->" + map.get(key));
        }
//        for(int i=1;i<=map.size();i++){
//            System.out.println(i+"-->"+map.get(i));
//        }

    }
}

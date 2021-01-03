import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(100);
        c.add(2.3);
        c.add("Java");
        c.add(new Date());  //Object

        for(Object obj:c){
            System.out.print(obj + "  ");
        }

        System.out.println();
        System.out.println("===========");

        Iterator it = c.iterator();
        while(it.hasNext()){
            Object o = it.next();
            if(o instanceof  Double)
            {
                if ((Double)o == 2.4)
                    System.out.println(o);
            }
            //System.out.print(o + "  ");
        }



    }
}

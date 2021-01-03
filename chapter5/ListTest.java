import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        //Object obj = list.get(3);
        String s = list.get(3);

        list.add(2,"hello");

        System.out.println(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "  ");
        }
        System.out.println();
        System.out.println("==============");
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + "  ");
        }

        for(int i=0;i<list.size();i++){
            if(list.get(i)=="hello"){
                System.out.println(i);
            }
        }
    }
}

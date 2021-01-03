import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<Integer>();

        link.add(13);
        link.add(34);
        link.add(9);
        link.add(326);
        System.out.println(link);

        link.addFirst(100);
        link.addLast(1000);
        System.out.println(link);

        link.add(3,999);
        System.out.println(link);
    }
}

import java.util.Enumeration;
import java.util.TreeSet;
import java.util.Set;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Set<Student> link = new TreeSet<Student>();
        Student s1 = new Student("zhangsan",99);
        Student s2 = new Student("lisi",85);
        Student s3 = new Student("wangwu",55);
        Student s4 = new Student("liusi",76);
        Student s5 = new Student("asss",69);


        link.add(s1);
        link.add(s2);
        link.add(s3);
        link.add(s4);
        link.add(s5);

        System.out.println(link);
    }
}

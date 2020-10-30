/**
 * Person的测试类
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("zhangsan"); // new invoke constructor
        Person p2 = new Person("lisi");
        Person p3 = new Person();
        p1.age = 20;
        //p1.nationality = "other";
        p1.speak();  //object.member
        p2.speak();
    }
}

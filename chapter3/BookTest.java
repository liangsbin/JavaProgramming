/**
 * 练习：Book的测试类
 * @author 梁胜彬
 * 2020-10-16
 */
public class BookTest {
    public static void main(String[] args) {
        Book b1,b2;
        b1 = new Book("Java Programming",500);
        b2 = new Book("Operation System",300);
        b1.status = true;
        b1.borrow("Java Program");

        b2.setMark(300);
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book java;
        java = new Book("Java Programming",300);
        java.isbn="978-001-355-2-33";  //对象名.成员
        System.out.println(java.toString());

        java.setMark(200);

        java.find("978-001-355-2-33");
    }
}

package example2;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(0,"0001");
        Parent parent = new Parent("Parents",bank,2000);
        Student student = new Student("Student",bank,1200);
        parent.start();
        student.start();
    }
}

/**
 * 单例模式
 */
public class Singleton {
    public static void main(String[] args) {
        Student s1 = Student.getInstance();
        System.out.println(s1);
        Student s2 = Student.getInstance();
        System.out.println(s2);
        Student s3 = Student.getInstance();
        System.out.println(s3);
        System.out.println(s1.getName());
        System.out.println(s2.getName());
        System.out.println(s3.getName());
    }
}

/**
 * 单例模式的类
 */
class Student{
    private String sno;
    private String name;
    private String grade;

    private static Student instance
            = new Student("0001","zhangsan","2019");
    private Student(){}

    private Student(String sno, String name, String grade) {
        this.sno = sno;
        this.name = name;
        this.grade = grade;
    }

    public static Student getInstance(){
        return instance;
    }

    public String getName(){
        return this.name;
    }
}

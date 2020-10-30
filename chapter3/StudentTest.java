public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("201900035","lisi");
        Student.school = "beida";
        //s1.school = "henu";
        s1.name = "zhangsan";
        s1.sno = "20190001243";
        s1.major = "SE";
        System.out.println(s1.toString());
        System.out.println(s2.toString());

    }
}

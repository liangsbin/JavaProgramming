public class Student {  //Object
    String no;
    String name;
    String grade;

    public Student(){
        System.out.println("first Constructor");
    }

    public Student(String no, String name, String grade) {
        this.no = no;
        this.name = name;
        this.grade = grade;
        System.out.println("second constructor");
    }

    @Override
    public String toString() {
        return "Student{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

}

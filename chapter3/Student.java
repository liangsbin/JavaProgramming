/**
 * this的使用方法
 * static修饰成员变量，方法
 */
public class Student {
    //变量：成员变量，局部变量
    //成员变量:实例变量, 类变量(使用static修饰)
    //访问方式： 实例变量 对象.成员； 类变量  对象.成员 ； 类名.成员(推荐)
    String sno;   //实例变量
    String name;
    String major;
    static String school;  //类变量

    public Student(){}
    public Student(String s){
        sno = s;
    }
    //this代表本对象的成员, 方法，构造方法
    public Student(String sno,String name){
        this.sno = sno;
        this.name = name;
    }

    public Student(String sno,String name, String major){
       //this()必须放在方法的第一行
        this(sno,name);
        //调用本类的另外一个构造方法Student(String sno,String name)
//        this.sno = sno;
//        this.name = name;
        this.major = major;

    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
    //this在本类的方法，调用另外一个实例方法
    public void print(){
        System.out.println(this.toString());
    }
}

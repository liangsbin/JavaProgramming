/**
 * 职员类
 * @author 梁胜彬
 * 2020-10-15
 */
public class Employee {
    public String name;
    public int age;
    public double salary;

    public Employee(String n,int a,double s){
        name = n;
        age = a;
        salary = s;
        System.out.println("构造方法执行了");
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String newName){
        name = newName;
    }

    public void getSalary(){
        System.out.println(salary);
    }
}

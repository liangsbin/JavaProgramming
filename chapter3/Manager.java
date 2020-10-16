/**
 * 继承，面向对象的方法 模拟现实世界中两种事物之间的这种关系。
 * 继承还可以实现代码的复用，子类继承父类中特定的属性与方法。
 * @author 梁胜彬
 * 2020-10-16
 */
public class Manager extends Employee{
    public String position;

    public Manager(String name,int age,double salary,String position){
        super(name,age,salary);
        this.position = position;
    }

    public static void main(String[] args) {
        Manager wangwu = new Manager("wangwu",30,10000,"销售经理");
        wangwu.getSalary();
    }

}//pull 拉
 //push 推
 //commit 提交

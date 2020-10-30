/**
   Graduate 继承了Student类，Student类称为父类，超类
    Gradudate称为子类
    代码的复用
 */
public class Graduate extends Student {
    String research; //扩充了父类的成员

    public Graduate(String no,String name,String grade,String research){
        //通过super()调用父类的构造方法。
        // 1.super()必须放在构造方法体的第一行
        // 2.super()显式的指定调用父类哪个构造方法，如果没有指定，默认调用父类的无参构造方法
        //super(no,name,grade);
        this.research = research;
        System.out.println("执行带参数的子类构造方法");
    }
    public Graduate(){
        System.out.println("执行无参的子类构造方法");
    }
    public void doResearch(){
        System.out.println("research field:" + this.research);
    }
}

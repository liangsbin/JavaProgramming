/**
 * 泛化、关联、依赖，降低继承的层次
 * 方法的重写
 * super引用父类成员
 * 2020-10-27
 * @author 梁胜彬
 */

class A{
    String a = "A";
    public void t1(){
        System.out.println(a);
    }
}

class B{
    String b = "B";
     void t2(){
        System.out.println(b);
    }
    public void t4(){
        System.out.println("T4");
    }
}
//UML 泛化，
public class SubClass extends B{
    A a1;//关联: 一个成员变量的类型是另外一个类
    public void t3( A a1){ //依赖
        a1.t1();
    }
    String b = "subclass";
    //方法的重写(覆盖) Override：在子类中重新定义了父类的方法[方法名，参数列表，返回值与父类的方法完全一致]
    //覆盖后的方法访问权限：只能比父类更加宽松
    @Override //加上约束，必须重写父类的方法。
     void t2(){
        System.out.println("Hello");  //就近原则
    }

    public void test(){
        super.t2(); //调用父类中的成员
        System.out.println(b);
        System.out.println(super.b);
    }
    public static void main(String[] args) {
        SubClass sc = new SubClass();
        //sc.t2();
       // sc.t4();
        sc.test();
    }
}

//Student ,sno,name,mjaor

/**
 * 1 构造方法的调用
 * 2 构造方法重载
 * 3 成员的访问： 对象名.成员
 * 4 private访问修饰符，只在本类中可见
 * @author liang
 * 2020-10-19
 */
public class Person {
    String name;
    int age;
    // 声明并初始化,private表明该属性只在本类中可见
    private String nationality = "China";

    /**
     * 构造方法的定义：如不定义构造方法，编译器提供一个缺省构造方法：public Person(){}
     * 一旦定义构造方法，系统将不再提供缺省构造方法。
     * 作用：为对象在内存中分配空间/初始化成员变量，如没有显式的初始化，将提供默认值
     * @param n
     */

    public Person(String n){
        name = n;
    }
    //构造方法重载
    public Person(){

    }

    public void speak(){
        System.out.println("My name is " + name + " and my age is " + age +
                ", nationality is " + nationality );

    }
}

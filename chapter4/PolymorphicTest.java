/**
 * 多态
 * 2020-11-06
 * @author Liang Shenbin
 */
public class PolymorphicTest extends Object {
    public static void main(String[] args) {
        //多态:编译时，运行时
        Animal a1 = new Cat(); //向上转型
        a1.shout();
        //a1.eat();  //错误！

        Animal a2;
        a2 = new Dog();
        a2.shout();

        animalShout(a1);

    }
    public static void animalShout(Animal animal){
        if(animal instanceof Cat) {
            Cat c = (Cat) animal; //向下转型，不安全,异常
            c.shout();
            c.eat();
        }
    }
}

class Animal {
    public void shout(){
        System.out.println("animal shout");
    }
}

class Cat extends Animal{

    @Override
    public void shout() {
        System.out.println("miao ...");
    }

    public void eat(){
        System.out.println("the cat eat fishes");
    }
}

class Dog extends Animal{

    @Override
    public void shout() {
        System.out.println("wang ...");
    }
}
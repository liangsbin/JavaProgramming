/**
 * 参数的值传递&方法重载
 * @author 梁胜彬
 * 2020-10-13
 *
 */
public class PassValue {
    public static void main(String[] args) {
        int x,y;
        x=15;
        y=25;
        Point p1;
        p1 = new Point(x,y);  // new operator invoke constructor
        System.out.println("Before: x="+x + ",y="+y); //15 25
        p1.move(x,y);   //25,35
        System.out.println("After: x="+x + ",y="+y); //15 25

        p1.move(p1);
        System.out.println("After: x="+x + ",y="+y);

        p1.move(3.0,4);
    }
}

class Point{
    int x;
    int y;

    //constructor，构造方法，作用：为成员变量初始化，在内存中为对象分配空间
    public Point(int a,int b){
        x = a;
        y = b;
    }
    //overload  1
    public static void move(int x,int y){
        x += 10;
        y += 10;
        System.out.println("move:x="+x + ",y="+y);
    }
    //重载形式2
    public static void move(double x,int y){
    }

    //重载形式3
    public static void move(int x,double y){}
    //重载形式4
    public static void move (double x,double y){}
    //重载形式5
    public static void move(Point point){
        point.x = point.x + 10;
        point.y = point.y + 10;
        System.out.println("move point: x="+point.x + ",y="+point.y);
    }


}
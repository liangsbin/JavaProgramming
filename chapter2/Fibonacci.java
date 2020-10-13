/**
 * 斐波那契数列：1 1 2 5 8 13 21 34 55 ...
 * 如果设an为该数列的第n项，那么这句话可以写成如下形式：a(n)=a(n-1)+a(n-2)，显然这是一个线性递推数列。
 * @author 梁胜彬
 * 使用递归方法实现
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(f(4));
    }
    public static long f(int n){
        if(n>2){
            return f(n-1) + f(n-2);
        }
        else if(n==1 || n==2){
            return 1;
        }
        else
            return 0;
    }
}

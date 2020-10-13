/**
 * 可变长度的方法参数，相当于数组参数。
 * 请比较方法sum()与sum1()的区别
 * 注意为什么这里不能使用方法重载？
 * @author 梁胜彬
 * 2020-10-13
 *
 */
public class Parameter {

	/**
	 * 注意sum方法中使用 int ...y定义了一个可变长的参数，参数个数由实际调用时确定。第一个参数a是确定的。
	 */
	static int sum(int a,int ...y){
        int sum=0;
        //注意遍历可变长参数y的形式，等价于数组
        for(int i=0;i<y.length;i++){
            sum+=y[i];
        }
        sum+=a;
        return sum;
    }
	/**
	 * 使用数组形式实现
	 */
    static int sum1(int a,int[] y){
        int sum=0;
        for(int i=0;i<y.length;i++){
            sum+=y[i];
        }
        sum+=a;
        return sum;
    }
    public static void main(String[] args) {
        int []y={1,2,3};
        //调用sum1()的形式
        System.out.println(sum1(10,y));
        //调用sum()的形式
        System.out.println(sum(10,1,2,3));
    }
}

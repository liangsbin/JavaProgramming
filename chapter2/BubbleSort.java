import java.util.Arrays;
import java.util.Scanner;
/**
 * 冒泡排序的Java实现
 * @author 梁胜彬
 * 2020-10-12
 *
 */
public class BubbleSort {
    public static void main(String[] args) {
        //创建并动态初始化数组a
    	int a[] = new int[10];
        //为数组a赋值
    	input(a);
    	//排序
        sort(a);
        //同时，JDK也提供了Arrays类中有一个sort方法，也可以升序排序。
        //Arrays.sort(a);
        //折半查找
        //int index = Arrays.binarySearch(a,9);
        //打印数组中的元素
        print(a);
        //System.out.println("index:" + index);

    }

    /**
     * 为数组的各元素输入值
     * @param a
     */
    public static void input(int[] a){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input 10 numbers:");
        for(int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }
    }

    /**
     * 冒泡排序
     * @param a
     */
    public static void sort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<10-i-1;j++){
                int temp;
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    /**
     * 打印数组的元素
     * @param a
     */
    public static void print(int[] a){
        for(int i:a)
            System.out.print(i+"  ");
        System.out.println();
    }
}

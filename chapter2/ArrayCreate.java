import java.util.Scanner;
/**
 * 二维数组的创建的遍历
 * @author 梁胜彬
 * 2020-10-13
 *
 */
public class ArrayCreate {
    public static void main(String[] args) {
        /**
         * 动态初始化方式：创建一个二维数组a，有3行但每行列数不指明
         */
    	int [][]a = new int[3][];
    	//为每一行指定列数
        a[0] = new int[4];
        a[1] = new int[1];
        a[2] = new int[3];
        //静态初始化数组b，与a的维度相同
        int[][] b = {{1,2,3,4},{1},{3,6,7}};
        //为数组各元素赋值
        Scanner scanner = new Scanner(System.in);
        System.out.println("input data:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j] = scanner.nextInt();
            }
        }
        //遍历数组
        for(int[] i:a){
            for(int j:i){
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}
/*
3 2 36 3
2
23 3 6


 */
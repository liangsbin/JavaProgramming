/**
 * 二维数组的创建（每行列数相同）
 * 使用嵌套for循环遍历二维数组
 * 使用嵌套foreach遍历二维数组
 * @author 梁胜彬
 * 2020-10-13
 */
public class TwoDemensionArray {
    public static void main(String[] args) {
        int[][] a = {{33,2},{35,12},{9,10}};
        int[][] b = new int[3][2];
        //注意length属性的灵活使用
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
        
        //foreach遍历二维数组，注意二维数组的每一行是一个一维数组
        for(int[] i:a){
        	//遍历数组i
            for(int j:i){
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }

}

/**
 * 课后作业，求1000内的完全数。
 * 完全数，除了本身之外的所有因子之和等于本数
 * @author 梁胜彬
 * 2020-10-13
 *
 */
public class FullNumber {
    public static void main(String[] args) {
        for(int i=2;i<=1000;i++){
            int sum=0;
            //求数i的所有因子
            for(int j=1;j<i;j++){
                if(i%j==0)
                {
                    sum+=j;
                }
            }
            if(sum==i)
                System.out.println(i);
        }
    }
}
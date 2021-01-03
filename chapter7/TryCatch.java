public class TryCatch {

    public static void test(int x,int y){
        try {
            x = x / y;
            int[] a = {1,2,3};
            System.out.println(a[2]);
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e)
        {
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
        /*
        catch (ArrayIndexOutOfBoundsException e1){
            e1.printStackTrace();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (Exception e2){
            e2.printStackTrace();
        }
         //catch多个异常并且存在继承关系，应该先捕获子类异常，再捕获父类异常。
         */
    }

    public static void main(String[] args) {
        test(3,12);
    }
}

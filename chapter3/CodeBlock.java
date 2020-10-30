
/**
 * 1）声明成员变量,2）声明方法,3）构造方法 ,4）程序块code block
 */
public class CodeBlock {
    private String name;

    public CodeBlock(String name) {
        this.name = name;
        System.out.println("执行了构造方法1");
    }

    public CodeBlock(){
        System.out.println("执行了构造方法2");
    }
    //构造程序块，构造方法执行前调用，每调用一次构造方法，就执行一次
    {
        System.out.println("构造程序块");
    }
    //静态程序块，类加载时执行，而且仅执行一次
    static {
        System.out.println("静态程序块");
        //加载MYSQL JDBC驱动
        /*
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (Exception e){
            e.printStackTrace();
        }

         */
    }
    void print(){
        System.out.println("method");
    }

    public static void main(String[] args) {
        CodeBlock c = new CodeBlock();
        CodeBlock c1 = new CodeBlock("lisi");
    }
}

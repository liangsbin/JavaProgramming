/**
 * 重定父类Object类的方法
 * @author Liang Shengbin
 */
public class Computer {
    String CPU;
    int memory;
    String harddisk;

    public Computer(String CPU, int memory, String harddisk) {
        this.CPU = CPU;
        this.memory = memory;
        this.harddisk = harddisk;
    }
    /*
    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", memory=" + memory +
                ", harddisk='" + harddisk + '\'' +
                '}';
    }
    */

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Computer){
            if(this.CPU.equals(((Computer) obj).CPU) &&
                    this.harddisk.equals(((Computer) obj).harddisk) &&
                    this.memory == ((Computer) obj).memory)
                return true;
            return false;
        }
        return  false;
    }

    public static void main(String[] args) {
        Computer c = new Computer("Intel i7",16,"1TB");
        System.out.println("c:"+c.toString());
        System.out.println(Integer.toHexString(c.hashCode()));
        Computer c1 = new Computer("Intel i7",16,"1TB");
        System.out.println("c1:"+c1.toString());
        System.out.println(c==c1); //比较地址是否相等
        System.out.println(c.equals(c1));//比较地址是否相等

        String s = c.getClass().getName();
        System.out.println(s);
    }
}

/**
 * 接口的定义，使用interface定义
 * 接口弥补了类单继承机制的不足，接口可以同时继承多个父接口
 * 一个源文件中可以定义多个接口，但最多只能有一定为public类型
 * @author Liang Shengbin
 */
//UI  GUI
public interface DataInterface extends I1,I2{
	public abstract String[] sort(String[] data);
	//insert
	public abstract String[] insert(String[] data,int i);
	//save
	public abstract boolean save(String[] data);
	
	public void test();
}

interface I1{
	
	public void t1();
}

interface I2{
	//接口中定义的变量是常量，必须直接赋值。
	public int i = 10;
	public void t2();
}
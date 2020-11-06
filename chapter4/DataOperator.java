/**
*  抽象类的定义
 *  抽象类可以定义具体方法、抽象方法、构造方法和成员变量，但抽象方法不能实例化
 *  抽象类中可以有抽像方法，也可以有具体方法。
 * @author Liang Shengbin
 *
 */
public abstract class DataOperator {
	String[] data;
	//sort ，抽象方法，只有方法的声明，没有方法体，使用abstract修饰。
	public abstract String[] sort(String[] data);
	//insert
	public abstract String[] insert(String[] data,int i);
	//save
	public abstract boolean save(String[] data);
	
	public void test(){}
	
	public DataOperator(String[] data){
		this.data = data;
	}
}

/**
 * 类实现接口，implements关键字的使用
 * 一个类可以同时实现多个接口，并且把接口中的方法实现，否则该类必须声明为抽象类
 * @author  Liang Shengbin
 * @Date 2020-11-1
 */
public  class DataImpl implements DataInterface,I3{

	@Override
	public void t1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void t2() {
		//i = 100;
		System.out.println(i);
		
	}

	@Override
	public String[] sort(String[] data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] insert(String[] data, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(String[] data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void t3() {
		// TODO Auto-generated method stub
		
	}


	
}
/**
 * DataOp继承抽象类DataOperator,实现该类的抽象方法，否则该子类仍然也要定义为抽象类
 * @author Liang Shengbin
 * @Date 2020-10-30
 */

import java.io.*;

public class DataOp extends DataOperator {

	public DataOp(String[] data) {
		super(data);
		// TODO Auto-generated constructor stub
	}


	public String[] sort(String[] data) {
		// TODO Auto-generated method stub
		return null;
	}


	public String[] insert(String[] data, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean save(String[] data) {
		FileWriter fw = null;
		try{
			fw = new FileWriter("d:/data.txt");
			for(String i:data)
				fw.append(i + "  ");
			fw.close();
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public static void main(String[] args) {
		String[] s = {"one","two","three","four"};
		DataOp data = new DataOp(s);
		data.save(s);
	}
}

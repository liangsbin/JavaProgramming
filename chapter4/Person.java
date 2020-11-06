//final修饰类，表示该类为最终类，不能再被继承。
public  class Person {
	String name;
	int age;
	public Person(){}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("person constructor.");
	}
	//final修饰方法，最终方法，不能被重写
	public final void print(){
		System.out.println("name:" + this.name + ",age" + this.age);
	}
	
}

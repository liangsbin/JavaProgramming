/**
 * 一个接口的综合案例，接口中抽象出若干事物中共有的行为，定义的接口的方法。
 * @author Liang Shengbin
 * @Date 2020-11-1
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Simulator simulator = new Simulator();
		Dog d = new Dog();
		simulator.playSound(d);
		simulator.playSound(new Cat());
	}

}

class Dog implements Animal{

	@Override
	public void cry() {
		System.out.println("wangwang...");
		
	}

	@Override
	public String getAnimalName() {
		// TODO Auto-generated method stub
		return "Dog";
	}	
}

class Cat implements Animal{

	@Override
	public void cry() {
		System.out.println("miaomiao...");
	}

	@Override
	public String getAnimalName() {
		// TODO Auto-generated method stub
		return "Cat";
	}
}

class Simulator{
	public void playSound(Animal animal){
		System.out.println("The animal is " + animal.getAnimalName());
		animal.cry();
	}
}
import javax.swing.plaf.synth.SynthStyle;

/**
 * 第一个Java程序
 * @author 梁胜彬
 * 2020-09-14
 * 
 * 程序的编译：
 * javac HelloWorld.java
 * 程序的运行
 * java HelloWorld
 */
public class HelloWorld {

	/**
	 * main方法为程序的入口点，程序从这里开始执行。
	 * main方法的参数为字符串数组，该参数可以在运行时传递 参数，如java HelloWorld 参数1  参数2 ......
	 * @param args
	 */
	public static void main(String[] args) {
		// 打印Hello,World!
		System.out.println("Hello, World!");
		//打印main中的形参字符串数组元素args[0]
		if(args.length>0){
			System.out.println("args[0]:" + args[0]);
		}

	}

}

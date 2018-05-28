package highOOP;
/*interface可以被理解为一种特殊的类，是由全局常量以及以public修饰的方法组成的
在接口中定义的抽象方法必须是public定义的*/
interface AA{
	//由于接口的基本概念已经明确定义了接口是由全局常量和抽象方法组成的 ，所以
	String name = "周宇";      	//此处等价于public static final String name = 周宇
	void print();				//此处等价于public abstract void print();
	String getInfo();			//此处等价于public abstract String getInfo();
}
interface BB{
	void say();
}
abstract class XX{
	//此处定义一个抽象类
	public abstract void fun();
}
class CC extends XX implements AA, BB {		//先继承类抽象类XX，然后再使用implements关键字来实现接口 
	//一个子类实现了两个接口 那就必须重写这两个接口中全部的抽象方法
	public String getInfo() {
		return "Hello";
	}
	public void print() {
		System.out.println(getInfo());
	}
	public void say() {
		System.out.println("World!");
	}
	public void fun() {
		System.out.println("你一定可以考上的");
	}
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CC cc = new CC();
		System.out.println(cc.name);
		cc.print();
		cc.say();
		cc.fun();

	}

}

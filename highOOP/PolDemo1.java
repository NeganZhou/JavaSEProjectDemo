package highOOP;

//多态是面向对象的最重要的一个概念 主要有一下两种体现形式
//	1、方法的重载与重写  
// 方法的重载 方法名不同 方法的参数类型或者参数个数不相同 使用不同的方法参数来调用方法可以实现不同的功能的调用
// 方法的重写 方法名相同方法参数相同 子类重写的方法不能比父类被重写的方法定义更严格的权限 一般用在子类继承父类时完善父类的方法功能
//  2、对象的多态性
// 对象的多态性主要分为两种类型 
//（1） 向上转型  子类对象→父类对象 				（2）向下转型    父类对象→子类对象
class Pol1 {
	public void fun1() {
		System.out.println("Pol1中的fun1方法");
	}
	public void fun2() {
		this.fun1();
	}
}
class Pol2 extends Pol1 {
	public void fun1() {
		System.out.println("Pol2中的fun1方法");
	}
	public void fun3() {
		System.out.println("Pol2中的fun3方法");
	}
}
class Pol3 extends Pol1 {
	public void fun1() {
		System.out.println("Pol3中的fun1方法");
	}
	public void fun4() {
		System.out.println("Pol3中的fun4方法");
	}
}
public class PolDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pol2 p2 = new Pol2();	
		Pol1 p1 = p2;		//向上转型
		p1.fun1();			//此方法被子类重写过过
		p1.fun2();			//因为fun1方法被从写了此处fun2调用了pol2中的fun1方法
		p2.fun1();
		p2.fun2();
		
		
		System.out.println("=============================================");
		Pol1 pol1 = new Pol2();
		Pol2 pol2 = (Pol2)p1;		//向下转型
		p1.fun1();
		p1.fun2();
		pol2.fun1();
		pol2.fun2();
//		在子类对象中调用了由父类继承而来的fun2方法，fun2方法要调用fun1方法由于此时fun1方法已被子类重写 所以此时调用的时子类中的fun1方法
		
		
		
		System.out.println("=============================================");
		fun(new Pol2());				//传递Pol2实例产生向上转型
		fun(new Pol3());				//传递Pol3实例产生向上转型
		//因为一旦发生向上转型以后，调用的方法一定时子类被覆写过的方法
		
		
	}
	public static void fun(Pol1 P) {				//接受父类对象
		P.fun1();
	}


}

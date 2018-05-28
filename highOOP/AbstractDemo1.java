package highOOP;
/*
在Java中可以创建一种类专门用来当作父类，这种类叫做抽象类。抽象类的作用类似于模板
。其目的是想要设计者按照它的格式来修改创建新的类。但是不能由抽象类直接创建对象
，只能通过抽象类派生出新的类。再由它创建对象。
抽象类的定义和使用规则
1、一个子类只能继承一个抽象类
2、包含一个抽象方法的类必须是抽象类
3、抽象类和抽象方法都必须使用abstract关键字进行声明
4、抽象方法只需要声明而不需要实现
5、抽象类必须被子类继承，若继承抽象类的子类不是抽象类则必须重写抽象类中的方法*/
abstract class A{
	public static final String country = "CHINA";
	private String name = "Negan";
	public A() {
		System.out.println("抽象类中的构造方法");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void print();					//定义抽象方法
	//抽象方法不用加方法体
}
class B extends A {
	public void print() {
		System.out.println(this.country);
		System.out.println(this.getName());
	}
}
public class AbstractDemo1 {

	public static void main(String[] args) {
		B b = new B();		//实例化子类对象，抽象类是无法被实例化的
		//虽然此处实例化的是子类但是也是先调用的是抽象类中的构造方法
		b.print();			//调用被子类覆写过的方法
		
	}

}

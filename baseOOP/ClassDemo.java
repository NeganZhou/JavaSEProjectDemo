package baseOOP;
/*面向对象的程序有三种特性
 * 1.封装性
 * 把不需要让外界知道的信息隐藏起来，有些对象的属性及行为允许外界用户知道或使用
 * 但不允许更改，另一些属性或行为则不能让外界知道，或许只允许适用对象的功能，而尽可能隐蔽
 * 对象功能实现的细节
 * 封装机制在程序中表现为，把描述对象属性的变量及实现对象功能的方法结合在一起
 * 定义成为一个程序单位，并保证外界不能任意改变其内部的属性值
 * 也不能调用其内部的属性方法
 * 封装机制的另一个特点是，为封装在一个整体内的变量及方法设定不同级别的可见性或访问权限
 * 
 * 2.继承性
 * 首先拥有反应事物一般特性的类，然后在其基础上派生出反应特殊事物的类。
 * 被继承的类称为父类或超类，而经继承的类称为子类或者派生类
 * 3.多态性
 * 多态是语言中出现重名现象java语言中含有方法重载与对象多态两种形式的多态
 * ---方法重载，在一个类中，允许多个方法使用同一个名字，但方法的参数不同
 * 完成的功能也不相同
 * ---对象多态子类对象可与父类对象进行交换，而且根据其使用的子类不同
 * 完成的功能也不同*/
class Person{
	int age;
	String name;
	public void print() {
		System.out.println("姓名" + name + "年龄" + age);
	}
}
public class ClassDemo {
	public static void main(String[] args) {
//		Person per = new Person();//使用new开辟堆内存空间
//		per.name = "zhouyu";
//		per.age = 22;
//		per.print();
//		//创建多个对象
//		Person per1 = new Person();
//		per1.name = "wuxue";
//		per1.age = 21;
//		per1.print();
		//对象引用传递
//		Person per1 = new Person();
//		Person per2 = per1; //把per1的堆内存使用权限给到per2
//		per1.name = "zhouyu";
//		per1.age = 22;
//		per2.name = "wuxue";
//		Person per1 = new Person();
//		Person per2 = new Person();
//		per1.name = "zhouyu";
//		per2.name = "wuxue";
//		per1.age = 22;
//		per2.age = 21;
//		per1 = per2; //per1断开当前堆空间并指向了per2的堆空间
//		per1.print();
//		per2.print();
		
	}
}

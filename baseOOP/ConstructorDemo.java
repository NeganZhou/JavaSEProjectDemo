package baseOOP;

/*程序中只要出现了（）就表示调用了方法，
  那么这个方法就是实际上调用的构造方法
  构造方法的三点要求
  1、constructor的方法名必须与类名一致
  2、constructor的声明处不能有任何类型的返回值声明
  3、、不能再constructor中用return返回任何一个值
  
  *
   当java中没有声明一个constructor构造方法时在编译时就会产生一个
   无参数的什么都不做的构造方法
   如果在一个类中明确的声明了一个构造方法，那么程序在编译时就不会再生成
   构造方法了，即一个类中最少有一个构造方法*/
class Person2 {
	// public Person2 () {
	// System.out.println("一个新的Person的产生");
	// }

	// 通过构造方法为属性赋值
	private String name;
	private String gender;
	private int age;
	public Person2(String name,int age) {
		//这里要把构造方法的传递给set方法 因为再main里把实参的值传过来了
		this.setName(name);
		this.setAge(age);
	}
	//构造方法的重载
	public Person2(String name, String gender, int age) {
		this.setName(name);
		this.setAge(age);
		this.setGender(gender);
	}
	public void setGender(String g) {
		gender = g;
	}
	public void setName(String n) {
		name = n;
	}
	public void setAge(int a) {
		if(a >= 0 && a<= 150 ) {
			age = a;
		} else {
			System.out.println("年龄有误"); 
		}
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public void print1() {
		System.out.println("姓名" + getName() + ",年龄" + getAge());
	}
	public void print2() {
		System.out.println("姓名" + getName() + ",性别" + getGender() + ",年龄" + getAge());
	}
	

}

public class ConstructorDemo {
	public static void main(String args[]) {
		// Person2 per2 = null;
		// 声明对象使栈中创建per 声明对象不调用构造方法constructor
		// per2 = new Person2();
		// 开辟堆空间 并让per指向此空间 实例化对象 并调用constructor构造方法
		Person2 per2 = new Person2("zhouyu",22);
		per2.print1();
		Person2 per22 = new Person2("wuxue","woman",21);
		per22.print2();
		Person2 per23 = new Person2("zhouyu","man",22);
		per23.print2();
		//匿名对象
		new Person2("wuxue",21).print1();
		//这里只开辟了堆内存并没有被栈内存引用，所以一旦被使用完毕就会等待被垃圾回收机制回收
	}

}

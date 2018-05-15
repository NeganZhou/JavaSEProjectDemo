package baseOOP;

//this关键字
/*
1、表示本类中的属性
2、可以用this调用本类中的构造方法constructor
3、this表示当前对象  最重要*/
class ThisPerson1 {
//使用this表示当前属性
	private String name;
	private int age;
	
//	public ThisPerson() { //创建一个无参构造方法
//		System.out.println("使用this();调用构造方法测试");
//	}
	public String getInfo () {
		System.out.println("方法中的this------>" + this);
		//那个对象调用了此方法 这个this就表示哪个对象
		return null ;
	}
	
//	public ThisPerson(String name, int age) {
//		this();//使用this来调用构造方法
//		//构造方法是优先被调用的 所以this();调用的构造方法必须也只能放在构造方法的首行
//		//在main函数实例化时是调用的有参构造方法 这里使用有参构造方法调用无参构造方法
//		this.name = name; //通过构造方法中的name形参为name属性传值
//		this.age = age;  //同过构造方法中的age形参为age属性传值
//	}
	//注意 ！使用this();来调用构造方法时一定要留一个构造方法作为出口，若不留出口就会递归调用构造方法。
	public String Info() {
		return "姓名：" + this.name + ",年龄：" + age;
	}
	
}

public class ThisDemo01 {

	public static void main(String[] args) {
//	ThisPerson tp = new ThisPerson("张三", 22);
//	System.out.println(tp.Info());
//	System.out.println("++++++++++++++++++++++++++");
	ThisPerson1 tp1 = new ThisPerson1();
	ThisPerson1 tp2 = new ThisPerson1();
	System.out.println("tp1---->" + tp1);
	tp1.getInfo();
	System.out.println("tp1---->" + tp2);
	tp2.getInfo();
	}

}

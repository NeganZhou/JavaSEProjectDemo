package baseOOP;

/*
	如果声明的属性想被所有的对象共享，则必须将其声明为static属性，而且一个属性被static
关键字声明之后，可以直觉使用类名进行调用。如果一个类中的方法想由类引用，则可以声明成
static方法
*/
class Person4{
	private String name;
	private int age;
	private static String city = "A城";
	public Person4(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public static void setCity(String c) {//非static方法或属性可以调用static方法或属性
		city = c;
	}
	
	public static String getCity() {//非static方法或属性可以调用static方法或属性
		return city;
	}
	public String Info() {
		return "姓名："  + this.name + "，年龄：" + this.age + ",城市:" + this.city; 
	}
}
public class StaticDemo1 {
	// 如果在程序中使用static声明属性，则此属性成为全局属性/静态属性
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person4 per1 = new Person4("张三",20);
		Person4 per2 = new Person4("李四",22);
		Person4 per3 = new Person4("王五",30);
		System.out.println(per1.Info());
		System.out.println(per2.Info());
		System.out.println(per3.Info());
		per1.setCity("B城");  
		System.out.println("==========修改后=============");
		System.out.println(per1.Info());
		System.out.println(per2.Info());
		System.out.println(per3.Info());
		//这里只是修改了一个对象中的属性但是所有对象中的城市属性发生了变化
		//说明了static属性是所有对象共享的
		Person4.setCity("c城");  //去掉privat以后可以用类名调用
		System.out.println("==========修改后=============");
		System.out.println(per1.Info());
		System.out.println(per2.Info());
		System.out.println(per3.Info());
	}

}

package baseOOP;
//设计一个dog类，有名字、颜色、年龄等属性，定义构造方法来初始化这些属性，定义方法输出dog信息
//编写应用程序使用dog类
class Dog{
	private String name;
	private String color;
	private int age;
	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public String print() {
		return "姓名：" + name + "、颜色：" + "、年龄：" + age;
	}
	
}
public class Question4 {

	public static void main(String[] args) {
		Dog d1 = new Dog("旺财","屎黄",3);
		Dog d2 = new Dog("大黄","黑色",1);
		System.out.println(d1.print());
		System.out.println(d2.print());
		
	}

}

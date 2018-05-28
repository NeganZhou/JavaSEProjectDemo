package highOOP;
//一个动物类
//有猫有狗 
//属性为颜色 和腿
//猫吃鱼 狗吃骨头
//猫会带老鼠 狗会看家
class Animal {
	private String color;
	private int leg;
	public Animal(String color, int leg) {
		this.color = color;
		this.leg = leg;
	}
	void eat() {
		
	}
	void fun() {
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	
}
class Dog extends Animal{
	public Dog(String color, int leg) {
		super(color, leg);
	}
	void eat() {
		System.out.println("狗吃骨头");
	}
	void fun() {
		System.out.println("狗会看家");
	}
}
class Cat extends Animal{
	public Cat(String color, int leg) {
		super(color, leg);
	}
	void eat() {
		System.out.println("猫吃鱼");
	}
	void fun() {
		System.out.println("猫会捉老鼠");
	}
}
public class Test1 {


	public static void main(String[] args) {
		Dog dog = new Dog("黄色", 4);
		Cat cat = new Cat("黑白", 4);
		System.out.println(dog.getColor()+ dog.getLeg());
		dog.eat();
		dog.fun();
		System.out.println(cat.getColor() + cat.getLeg());
		cat.eat();
		cat.fun();
	}

}

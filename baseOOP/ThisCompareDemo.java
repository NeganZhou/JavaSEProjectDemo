package baseOOP;

class Person3 {
	private String name;
	private int age;
	public Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//传入两个对象 一个为this 一个为per 比较这两个对象的地址是否相同
	//分别判断两个两个属性是否相等
	public boolean compare(Person3 per3) {
		//这里per31调用的这个comper方法 那此对象就为this
		Person3 p1 = this; 	//表示调用方法的对象为p1
		Person3 p2 = per3;	//表示传入的对象为p2
		if(p1 == p2) {	//先比较地址是否相等
			return true;
		}
		//分别比较两个对象中的属性是否相等
		if(p1.name.equals(p2.name) && p1.age == p2.age) {
			return true;
		}else {
			return false;
		}
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
}

public class ThisCompareDemo {

	public static void main(String[] args) {
		Person3 per31 = new Person3("张三",20);
		Person3 per32 = new Person3("张三",20);
		if(per31.compare(per32)) {
			System.out.println("两个对象相等");
		} else {
			System.out.println("两个对象不相等");
		}
		
	}

}

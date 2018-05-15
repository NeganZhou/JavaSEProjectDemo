package highOOP;
//使用super关键字可以从子类中调用父类中的属性、构造方法、普通方法
//使用super调用父类中构造方法时与this调用要求一样都要放在子类构造方法的首行
// this是调用本类中的属性或方法，如果本类中没有就会从父类中寻找 。  super是直接从父类中寻找属性或方法。
//但是this和super无法同时存在 因为他们俩都要放在构造方法的首行
class Person2 {
	private String name;
	private int age;
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String toString() {
		return "姓名：" + getName() + "  年龄：" + getAge();
	}
}
class Student2 extends Person2{
	private String school;
	public void setSchool(String school) {
		this.school = school;
	}
	public String getSchool() {
		return this.school;
	}
	public Student2(String name, int age, String school) {			//这里直接使用了三参构造方便向super里传递参数
		super(name,age);
		this.school = school;
	}
	public String toString() {										//这里覆写了父类中的toString方法
		return super.toString() + "  学校：" + getSchool();
	}
}
public class SuperDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 stu2 = new Student2("张三", 21,"清华大学");
		System.out.println(stu2.toString());

	}

}

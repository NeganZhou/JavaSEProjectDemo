package highOOP;
/*假如有一个Person类和一个Student类有name和age两个属性及对应的getter和
setter方法，但是Person类和Student类本来就有分不开的关系，因为学生
本身也是一个人 所以现在希望可以不在Student类中重新声明getter和setter方法
这时就要考虑是不是可以将Person类中的内容继续保存到Student类中，也就引出了我
们的继承这一概念*/
class Person{
	private String name;
	private int age;
	public Person() {
		System.out.println("父类的构造方法");
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
}
class Student extends Person{
	//子类是不可以直接访问父类里的私有成员的，子类可以调用父类中的非私有方法
	//但是不可以直接调用父类中的私有成员
	public Student() {
		super();//super默认是调用父类中的无参构造方法   要写在子类的构造方法中
	}
	private String school;
	public void setSchool(String school) {
		this.school = school;
	}
	public String getSchool() {
		return this.school;
	}
}
public class ExtendsDemo {

	public static void main(String[] args) {
		//在子类实例化之前，必须先调用父类的构造方法才能继续调用子类的构造方法
		//就像是没有父亲就没有孩子 所以想实例化子类对象前要先把父类中的属性初始化
		Student stu = new Student();
		stu.setName("zhouyu");
		stu.setAge(22);
		stu.setSchool("qingdaodaxue");
		System.out.println(stu.getName());
		System.out.println(stu.getAge());
		System.out.println(stu.getSchool());
	}

}

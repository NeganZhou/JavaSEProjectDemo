package highOOP;
//���ó�������ָ�������Ĺ��췽��
abstract class Person3{
	private String name;
	private int age;
	public Person3(String name, int age) {
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
	public abstract void getInfo();
}
class Student3 extends Person3{
	private String school;
		public Student3(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
		public String getSchool() {
			return school;
		}
		public void setSchool(String school) {
			this.school = school;
		}	
		public void getInfo() {
			System.out.println(this.getName() + this.getAge() + this.school);
		}
}
public class AbstractDemo2 {

	public static void main(String[] args) {
		Student3 s = new Student3("zhangsan",22,"shandongdaxue");
		s.getInfo();

	}
//������ֻ�Ǳ���ͨ�����һ�����󷽷������˲���ֱ�ӽ��ж����ʵ����֮��û���κεĲ�ͬ
}

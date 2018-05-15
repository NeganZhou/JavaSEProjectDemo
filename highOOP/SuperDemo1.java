package highOOP;
//ʹ��super�ؼ��ֿ��Դ������е��ø����е����ԡ����췽������ͨ����
//ʹ��super���ø����й��췽��ʱ��this����Ҫ��һ����Ҫ�������๹�췽��������
// this�ǵ��ñ����е����Ի򷽷������������û�оͻ�Ӹ�����Ѱ�� ��  super��ֱ�ӴӸ�����Ѱ�����Ի򷽷���
//����this��super�޷�ͬʱ���� ��Ϊ��������Ҫ���ڹ��췽��������
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
		return "������" + getName() + "  ���䣺" + getAge();
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
	public Student2(String name, int age, String school) {			//����ֱ��ʹ�������ι��췽����super�ﴫ�ݲ���
		super(name,age);
		this.school = school;
	}
	public String toString() {										//���︲д�˸����е�toString����
		return super.toString() + "  ѧУ��" + getSchool();
	}
}
public class SuperDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 stu2 = new Student2("����", 21,"�廪��ѧ");
		System.out.println(stu2.toString());

	}

}

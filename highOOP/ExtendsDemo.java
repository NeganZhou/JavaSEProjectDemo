package highOOP;
/*������һ��Person���һ��Student����name��age�������Լ���Ӧ��getter��
setter����������Person���Student�౾�����зֲ����Ĺ�ϵ����Ϊѧ��
����Ҳ��һ���� ��������ϣ�����Բ���Student������������getter��setter����
��ʱ��Ҫ�����ǲ��ǿ��Խ�Person���е����ݼ������浽Student���У�Ҳ����������
�ǵļ̳���һ����*/
class Person{
	private String name;
	private int age;
	public Person() {
		System.out.println("����Ĺ��췽��");
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
	//�����ǲ�����ֱ�ӷ��ʸ������˽�г�Ա�ģ�������Ե��ø����еķ�˽�з���
	//���ǲ�����ֱ�ӵ��ø����е�˽�г�Ա
	public Student() {
		super();//superĬ���ǵ��ø����е��޲ι��췽��   Ҫд������Ĺ��췽����
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
		//������ʵ����֮ǰ�������ȵ��ø���Ĺ��췽�����ܼ�����������Ĺ��췽��
		//������û�и��׾�û�к��� ������ʵ�����������ǰҪ�ȰѸ����е����Գ�ʼ��
		Student stu = new Student();
		stu.setName("zhouyu");
		stu.setAge(22);
		stu.setSchool("qingdaodaxue");
		System.out.println(stu.getName());
		System.out.println(stu.getAge());
		System.out.println(stu.getSchool());
	}

}

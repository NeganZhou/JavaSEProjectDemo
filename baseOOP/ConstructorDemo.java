package baseOOP;

/*������ֻҪ�����ˣ����ͱ�ʾ�����˷�����
  ��ô�����������ʵ���ϵ��õĹ��췽��
  ���췽��������Ҫ��
  1��constructor�ķ���������������һ��
  2��constructor���������������κ����͵ķ���ֵ����
  3����������constructor����return�����κ�һ��ֵ
  
  *
   ��java��û������һ��constructor���췽��ʱ�ڱ���ʱ�ͻ����һ��
   �޲�����ʲô�������Ĺ��췽��
   �����һ��������ȷ��������һ�����췽������ô�����ڱ���ʱ�Ͳ���������
   ���췽���ˣ���һ������������һ�����췽��*/
class Person2 {
	// public Person2 () {
	// System.out.println("һ���µ�Person�Ĳ���");
	// }

	// ͨ�����췽��Ϊ���Ը�ֵ
	private String name;
	private String gender;
	private int age;
	public Person2(String name,int age) {
		//����Ҫ�ѹ��췽���Ĵ��ݸ�set���� ��Ϊ��main���ʵ�ε�ֵ��������
		this.setName(name);
		this.setAge(age);
	}
	//���췽��������
	public Person2(String name, String gender, int age) {
		this.setName(name);
		this.setAge(age);
		this.setGender(gender);
	}
	public void setGender(String g) {
		gender = g;
	}
	public void setName(String n) {
		name = n;
	}
	public void setAge(int a) {
		if(a >= 0 && a<= 150 ) {
			age = a;
		} else {
			System.out.println("��������"); 
		}
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public void print1() {
		System.out.println("����" + getName() + ",����" + getAge());
	}
	public void print2() {
		System.out.println("����" + getName() + ",�Ա�" + getGender() + ",����" + getAge());
	}
	

}

public class ConstructorDemo {
	public static void main(String args[]) {
		// Person2 per2 = null;
		// ��������ʹջ�д���per �������󲻵��ù��췽��constructor
		// per2 = new Person2();
		// ���ٶѿռ� ����perָ��˿ռ� ʵ�������� ������constructor���췽��
		Person2 per2 = new Person2("zhouyu",22);
		per2.print1();
		Person2 per22 = new Person2("wuxue","woman",21);
		per22.print2();
		Person2 per23 = new Person2("zhouyu","man",22);
		per23.print2();
		//��������
		new Person2("wuxue",21).print1();
		//����ֻ�����˶��ڴ沢û�б�ջ�ڴ����ã�����һ����ʹ����Ͼͻ�ȴ����������ջ��ƻ���
	}

}

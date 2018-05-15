package baseOOP;

class Person3 {
	private String name;
	private int age;
	public Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//������������ һ��Ϊthis һ��Ϊper �Ƚ�����������ĵ�ַ�Ƿ���ͬ
	//�ֱ��ж��������������Ƿ����
	public boolean compare(Person3 per3) {
		//����per31���õ����comper���� �Ǵ˶����Ϊthis
		Person3 p1 = this; 	//��ʾ���÷����Ķ���Ϊp1
		Person3 p2 = per3;	//��ʾ����Ķ���Ϊp2
		if(p1 == p2) {	//�ȱȽϵ�ַ�Ƿ����
			return true;
		}
		//�ֱ�Ƚ����������е������Ƿ����
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
		Person3 per31 = new Person3("����",20);
		Person3 per32 = new Person3("����",20);
		if(per31.compare(per32)) {
			System.out.println("�����������");
		} else {
			System.out.println("�����������");
		}
		
	}

}

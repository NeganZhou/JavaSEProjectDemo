package baseOOP;

class Person1 {
	private String name;
	private int age;
	public void setAge(int a) {
		//��set�����ϼ�����
		if(a>=0 && a<=150){
			age = a;
		}else {
			System.out.println("���������������");
		}
	}
	public int getAge() {
		return age;
	}
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void print() {
		System.out.println("����" + getName() + "����" + getAge());
	}
}

public class EncDemo {
	public static void main (String args[]) {
		Person1 per1 = new Person1();
		per1.setName("zhouyu");
		per1.setAge(22);
		per1.print();
	}
}
	


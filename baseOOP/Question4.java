package baseOOP;
//���һ��dog�࣬�����֡���ɫ����������ԣ����幹�췽������ʼ����Щ���ԣ����巽�����dog��Ϣ
//��дӦ�ó���ʹ��dog��
class Dog{
	private String name;
	private String color;
	private int age;
	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public String print() {
		return "������" + name + "����ɫ��" + "�����䣺" + age;
	}
	
}
public class Question4 {

	public static void main(String[] args) {
		Dog d1 = new Dog("����","ʺ��",3);
		Dog d2 = new Dog("���","��ɫ",1);
		System.out.println(d1.print());
		System.out.println(d2.print());
		
	}

}

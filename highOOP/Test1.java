package highOOP;
//һ��������
//��è�й� 
//����Ϊ��ɫ ����
//è���� ���Թ�ͷ
//è������� ���ῴ��
class Animal {
	private String color;
	private int leg;
	public Animal(String color, int leg) {
		this.color = color;
		this.leg = leg;
	}
	void eat() {
		
	}
	void fun() {
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	
}
class Dog extends Animal{
	public Dog(String color, int leg) {
		super(color, leg);
	}
	void eat() {
		System.out.println("���Թ�ͷ");
	}
	void fun() {
		System.out.println("���ῴ��");
	}
}
class Cat extends Animal{
	public Cat(String color, int leg) {
		super(color, leg);
	}
	void eat() {
		System.out.println("è����");
	}
	void fun() {
		System.out.println("è��׽����");
	}
}
public class Test1 {


	public static void main(String[] args) {
		Dog dog = new Dog("��ɫ", 4);
		Cat cat = new Cat("�ڰ�", 4);
		System.out.println(dog.getColor()+ dog.getLeg());
		dog.eat();
		dog.fun();
		System.out.println(cat.getColor() + cat.getLeg());
		cat.eat();
		cat.fun();
	}

}

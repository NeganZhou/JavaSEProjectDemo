package collection;

import java.util.TreeSet;
class Pig implements Comparable<Pig> {
	String name;
	int age;
	public Pig(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public int compareTo(Pig o) {
		/*���˷����з���0ϵͳ�ͻ���Ϊÿ�αȽϵĽṹ������ͬ�ĸ���Set�ӿڵ����Զ�����
		�ظ������ͬԪ�أ�������һ������ϵͳ�ͻᰴ�ն�������������Ԫ��
		������������ظ�����֪*/
		return  this.age - o.age == 0 ? this.name.compareTo(o.name) : this.age - o.age;
	}
	@Override
	public String toString() {
		return "Pig [name=" + name + ", age=" + age + "]";
	}
	
}
public class TreeSetDemo1 {

	public static void main(String[] args) {
		//TreeSet����Ԫ�����ʱ������������
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(1);
		ts1.add(20);
		ts1.add(4);
		ts1.add(9);
		System.out.println(ts1);
		
		//��TreeSet�������ֵ�ʱ��ʱ����Unicode���������
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("��");
		ts2.add("��");
		ts2.add("��");
		ts2.add("��");
		System.out.println(ts2);
		
		//����Զ������͵�TreeSet����
		TreeSet<Pig> ts3 = new TreeSet<Pig>();
		ts3.add(new Pig("С����", 3));
		ts3.add(new Pig("С����", 2));
		ts3.add(new Pig("С����", 1));
		System.out.println(ts3);
	}

}

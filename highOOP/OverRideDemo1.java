package highOOP;

/*��������д����д�� ��ָ���ඨ�����븸��ͬ���ķ���������Ҳ��ȫ��ͬ�������Ƿ�������дҪ����Ȩ��
��������д�˵ķ���Ȩ��һ�����ܱȸ�����ϸ�*/
class Person1 {
	String name = "С��";				//����һ������д������
	public void print() {
		System.out.println("Person1�е�print����");
	}
}

class Student1 extends Person1 {
	String name = "С��";				//��д�˸����е�����
//	private void print() {
//		System.out.println("Student1�е�print����");
//	}  			����ĸ�д���� ����ķ���Ȩ�ޱȸ��໹ҪҪ�ϸ�
	public void print() {
		super.print();					//���ø����е�print����
		System.out.println(super.name);//�˴����ø����е�����
		System.out.println("Student1�е�print����");
	}
}

public class OverRideDemo1 {
	public static void main(String[] args) {
		Student1 stu1 = new Student1();				
		stu1.print();					//�˴�ִ�б���д���ķ���
		System.out.println(stu1.name); 	//�˴������˱���д��������
	}

}

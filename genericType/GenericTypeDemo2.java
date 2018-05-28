package genericType;

import java.util.ArrayList;
//�ü��϶���һ��ѧ�� ѧ���е�Ԫ���ǰ༶ �༶֮����ѧ�� ����ѧ���������������
class Student{
	String name;
	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
}
public class GenericTypeDemo2 {

	public static void main(String[] args) {
		//��һ�����е���λѧ��
		Student s1 = new Student("����");
		Student s2 = new Student("����");
		//�ڶ������е���λѧ��
		Student s3 = new Student("����");
		Student s4 = new Student("����");
		
		
		//�����һ���༶
		ArrayList<Student> b1 = new ArrayList<Student>();
		//���ѧ��
		b1.add(s1);
		b1.add(s2);
		
		//����ڶ����༶
		ArrayList<Student> b2 = new ArrayList<Student>();
		//���ѧ��
		b2.add(s3);
		b2.add(s4);
		
		//����ѧ�Ƽ���
		//ѧ�Ƽ�����Ű༶����
		ArrayList<ArrayList<Student>> x1 = new ArrayList<ArrayList<Student>>();
		//��ѧ�Ƽ�������Ӱ༶
		x1.add(b1);
		x1.add(b2);
		
		//���ѧ��������foreach��
		for (ArrayList<Student> arrayList : x1) {
			//��һ���ѧ��������༶
			for (Student student : arrayList) {
				//�ڶ���Ӱ༶֮���������
				System.out.println(student.name);
			}
		}
		
		
	}

}

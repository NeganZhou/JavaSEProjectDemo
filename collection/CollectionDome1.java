package collection;

import java.util.ArrayList;
import java.util.Collection;

/*java�еļ�����
	���ĳ��ȿ��Ըı�
	�ܴ洢����Ķ���
	�������Ŷ�������Ӷ�����
����ͼ����������
	������Դ�Ż����������ͺ������������� ����ֻ�ܹ���������������� ������Ż�����������Ҳ���Զ�װ��ɰ�װ�ࣩ
	����֮��ֻ�ܴ�Ŷ���
	�����Ԫ���ǹ̶��� ���ϵĳ�������Ԫ�ص����Ӷ�����
ʲôʱ�������� ʲôʱ���ü�����
	1�����Ԫ�ع̶����Ƽ�ʹ������
	1�����Ԫ�ز��̶����Ƽ�ʹ�ü���*/

class Student{
	String name;
	int age;
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
public class CollectionDome1 {
@SuppressWarnings({ "rawtypes", "unchecked" })
	
	public static void main(String[] args) {
	int  a[] = {1,2,3,4,5};
	int  b[] = new int[3];
		Collection collection = new ArrayList();
		collection.add("abc");
		Student student = new Student();
		student.name = "����";
		student.age = 17;
		collection.add(student);
		System.out.println(collection);
		
		
		System.out.println("===================================");
		
		Collection c = new ArrayList();	//ʹ�ö�̬ ����ת��
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		c.addAll(collection);			//addAll�����ǽ�һ�����ϲ������
		System.out.println(c);
		//�Ӽ������Ƴ�һ��Ԫ��
		c.remove("a");
		System.out.println(c);
		//��ȡ���ϳ���
		System.out.println(c.size());
		
		//�жϼ����Ƿ�Ϊ��	Ϊ��true  ��Ϊ��false
		System.out.println(c.isEmpty());
		//��������е�����Ԫ��
		c.clear();
		
		//�жϼ����Ƿ�Ϊ��
		System.out.println(c.isEmpty());
		
		//��ȡ���ϳ���
		System.out.println(c.size());
	}
	

}

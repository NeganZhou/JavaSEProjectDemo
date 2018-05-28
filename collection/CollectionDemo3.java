package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
class Cat{
	String name;
	public Cat(String name) {
		this.name = name;
	}
	public String toString() {
		return "Cat [name=" + name + "]";
	}
	public String fun() {
		return "Cat [name=" + name + "]";
	}
	
}
public class CollectionDemo3 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ʹ�����鷽����������Ԫ��
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		Object object[] = c1.toArray();
		for (int i = 0; i < object.length; i++) {
			System.out.println(object[i]);
		}

		System.out.println("===================================");

		// ʹ�õ�������������Ԫ��
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		c2.add("e");
		Iterator i1 = c2.iterator();
//		System.out.println(i1.next());
//		
//		System.out.println(i1.next());   //ʹ����next���������Ժ�ָ���Զ�����ƶ�һλ
//		
//		
//		System.out.println(i1.hasNext());//hasnext���������жϺ�һλ�Ƿ���� �����ڷ���true �������ڷ���false
		
		//����õĵ����������ʽ
		while(i1.hasNext()) {
			System.out.println(i1.next());//ÿһ���������Ժ�ָ�붼�����һλ֪��Ϊ�շ���false�޷�����whileѭ��
		}
		
		
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Collection c3 = new ArrayList();
		c3.add(new Cat("mini"));
		c3.add(new Cat("miaomiao"));
		c3.add(new Cat("mimi"));
		Iterator i3 = c3.iterator(); //�˴���c3�е�Ԫ�ط���iterator�������� ���Զ�����ת��Ϊobject����
		while(i3.hasNext()) {
			//System.out.println(i2.next().toString());//���Դ�дobject�е�toString�����������
			//����object���в�û��fun���� ���Բ��ܵ��ý������  �Ǿ���Ҫ����ת��ʹ��Cat��������
			Cat cat = (Cat)i3.next();
			System.out.println(cat.fun());
		}
	}

}

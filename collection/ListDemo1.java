package collection;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo1 {
	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args) {
		List list  = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		//�����±������Ԫ��
		list.add(1, "1");
		list.add(3, "2");
		System.out.println(list);
		//�����Ԫ��ʱҪע����ӵ�λ�ò��ܳ�������ԭ�еĳ��� ���߾ͻᱨ��(�±�ʱ��0��ʼ��)
		
		
		//��ȡָ���±��Ԫ��
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list.get(4));
		System.out.println(list.get(6));
		
		
		//����ʹ��forѭ��������Ԫ��
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("================================");
		//�������� �����ּ�������Ϊ2���ַ� ��ɾ��
		List list2 = new ArrayList();
		list2.add("1");
		list2.add("2");
		list2.add("3");
		list2.add("4");
		list2.add("5");
		System.out.println(list2);
		Iterator i1 = list2.iterator();//����Ϊobject���� ��Ҫʹ���ַ������ͽ����޸� ��Ҫ����ת��
		while(i1.hasNext()) {
			String str = (String)i1.next();
			if (str.equals("2")) {
				//list2.remove("2");//ConcurrentModificationException();
				
				
				i1.remove();
				//ɾ�����ڵ�����Ԫ��
			}
			
		}
		System.out.println(list2);
		
		
		
		System.out.println("=========================================");
		
		
		
		
		
		//List��ר�еĵĵ�����ListIterator
		List list3 = new ArrayList();
		list3.add("1");
		list3.add("3");
		list3.add("4");
		list3.add("5");
		//���ڼ�����ȱ���ַ�����2����Ҫ��ӽ�ȥ
		ListIterator li1 = list3.listIterator();		//ʹ��list�����е�iterator�ķ���
		System.out.println(list3);
		while(li1.hasNext()) {
			//����li1�е�Ԫ�ػ���object���͵� ��Ҫת����String���ͽ��в���
			String str2 = (String)li1.next();
			if (str2.equals("1")) {
				li1.add("2");
			}
		}
		System.out.println(list3);
	}

}

package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo1 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList��ͬ��Ҳʵ����List�ӿ� ����Ҳ��ʹ��List���һЩ����
		LinkedList ld = new LinkedList();
		ld.add("a");
		ld.add("b");
		ld.add("c");
		ld.add("d");
		ld.add("e");
		ld.add("f");
		ld.add("g");
		System.out.println(ld);
		
		
		
		ld.addFirst("1");			//�ڼ����е�һ��λ�����Ԫ��
		System.out.println(ld);
		ld.addLast("2");			//�ڼ��������һ��λ�����Ԫ��
		System.out.println(ld);
		ld.removeFirst();			//�ڼ����е�һ��λ��ɾ��Ԫ��
		System.out.println(ld);
		ld.removeLast();			//�ڼ��������һ��λɾ����Ԫ��
		System.out.println(ld);
		ListIterator it = ld.listIterator();
		
		
	}

}

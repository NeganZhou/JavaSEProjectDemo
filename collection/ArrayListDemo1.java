package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	//��ȥ���ظ�����Ԫ�صĹ��ܽ��з�װ��һ������������е���
	//����һ��û���ظ�Ԫ�ص�һ������
	static  ArrayList getSingleEle(ArrayList list) {
		ArrayList a2 = new ArrayList();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			String str = (String)it.next();
			if (!a2.contains(str)) { //����a2�е�Ԫ�ز�����strԪ�ز��ܷ���true
				a2.add(str);
			}
		}
		return a2;
	}
	
	@SuppressWarnings({ "rawtypes", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//ȥ��ԭ�����е��ظ�Ԫ��
		ArrayList a1 = new ArrayList();
		a1.add("a");
		a1.add("a");
		a1.add("b");
		a1.add("b");
		a1.add("c");
		a1.add("c");
		System.out.println(a1);
		
		
		//���÷�������ȥ���ظ�Ԫ��
		ArrayList a2 = getSingleEle(a1);
		System.out.println(a2);
		
//		1������һ���µļ���
//		2���Ѽ����е�Ԫ�����η����µļ�����
//		3���ڷ����ʱ��Ƚ��¼������Ƿ������Ԫ��
//		4����Ԫ�ط����µļ��ϵ���
/*		ArrayList a2 = new ArrayList();
		Iterator it = a1.iterator();
		while(it.hasNext()) {
			String str = (String)it.next();
			if (!a2.contains(str)) { //����a2�е�Ԫ�ز�����strԪ�ز��ܷ���true
				a2.add(str);
			}
		}
		System.out.println(a2);
		
*/
	}

}
















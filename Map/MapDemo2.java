package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����map�������Ԫ��
		Map<String, Integer> m1 = new HashMap<String, Integer>();//����ת��
		m1.put("����", 11);
		m1.put("����", 12);
		m1.put("����", 13);
		m1.put("����", 14);
		m1.put("Ǯ��", 15);
		m1.put("���", 16);
		m1.put("�����", 17);
		
		
		//��ȡһ��Ԫ�� ���Ը���key���ҵ���Ӧ��value
		System.out.println(m1.get("����"));
		
		//map��û�е����� Ҳ����ʹ�ÿ��ٱ���foreachѭ��
		
		//ʹ��iterator���������б���
		//���԰�����key��ֵ�ó��� ����Set����������Set�д���iterator���б���
		Set<String> s1 = m1.keySet();
		Iterator<String> it = s1.iterator();
		while(it.hasNext()) {
			String str = it.next();
			int a = m1.get(str);
			System.out.println(str + " = " +  a);
		}
		
		
		
		System.out.println("======================");
		
		for (String s : s1) {
			System.out.println(s + "=" + m1.get(s));
		}
		
		
		
		//
		
		
	}

}

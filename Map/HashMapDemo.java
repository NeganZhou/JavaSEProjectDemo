package Map;

import java.util.HashMap;

public class HashMapDemo {
//Ҫ��ͳ���ַ������ַ����ֵĴ���
	
	public static void main(String[] args) {
		String str = "aaabbbcccddddd";
//		1�����Ƚ����ַ���ת���ַ�����
		char arr[] = str.toCharArray();
//		2������һ��hashmap�ļ���
		HashMap<Character, Integer> hs = new HashMap<>();
//		3���������ж����Ԫ���Ƿ���ֹ� ��û���򴴽�Ҫ����+1
		for (char c : arr) {
			if (hs.containsKey(c)) {
				hs.put(c, hs.get(c) + 1);
			}else {
				hs.put(c, 1);
			}
		}
		System.out.println(hs);
	}

}

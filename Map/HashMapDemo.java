package Map;

import java.util.HashMap;

public class HashMapDemo {
//要求统计字符串里字符出现的次数
	
	public static void main(String[] args) {
		String str = "aaabbbcccddddd";
//		1、首先进行字符串转成字符数组
		char arr[] = str.toCharArray();
//		2、创建一个hashmap的集合
		HashMap<Character, Integer> hs = new HashMap<>();
//		3、遍历来判断这个元素是否出现过 若没有则创建要有则+1
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

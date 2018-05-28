package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//遍历map集合里的元素
		Map<String, Integer> m1 = new HashMap<String, Integer>();//向上转型
		m1.put("张三", 11);
		m1.put("李四", 12);
		m1.put("王五", 13);
		m1.put("赵六", 14);
		m1.put("钱七", 15);
		m1.put("李八", 16);
		m1.put("公孙九", 17);
		
		
		//获取一个元素 可以根据key来找到对应的value
		System.out.println(m1.get("张三"));
		
		//map中没有迭代器 也不能使用快速遍历foreach循环
		
		//使用iterator迭代器进行遍历
		//可以把里面key的值拿出来 放入Set集合中利用Set中带有iterator进行遍历
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

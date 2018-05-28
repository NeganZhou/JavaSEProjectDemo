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
		
		//根据下表来添加元素
		list.add(1, "1");
		list.add(3, "2");
		System.out.println(list);
		//再添加元素时要注意添加的位置不能超过集合原有的长度 否者就会报错(下标时从0开始的)
		
		
		//获取指定下表的元素
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list.get(4));
		System.out.println(list.get(6));
		
		
		//可以使用for循环来遍历元素
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("================================");
		//遍历集合 若发现集合里有为2的字符 就删除
		List list2 = new ArrayList();
		list2.add("1");
		list2.add("2");
		list2.add("3");
		list2.add("4");
		list2.add("5");
		System.out.println(list2);
		Iterator i1 = list2.iterator();//现在为object类型 若要使用字符串类型进行修改 需要向下转型
		while(i1.hasNext()) {
			String str = (String)i1.next();
			if (str.equals("2")) {
				//list2.remove("2");//ConcurrentModificationException();
				
				
				i1.remove();
				//删除正在迭代的元素
			}
			
		}
		System.out.println(list2);
		
		
		
		System.out.println("=========================================");
		
		
		
		
		
		//List里专有的的迭代器ListIterator
		List list3 = new ArrayList();
		list3.add("1");
		list3.add("3");
		list3.add("4");
		list3.add("5");
		//现在集合中缺少字符串“2”需要添加进去
		ListIterator li1 = list3.listIterator();		//使用list中特有的iterator的方法
		System.out.println(list3);
		while(li1.hasNext()) {
			//现在li1中的元素还是object类型的 需要转换成String类型进行操作
			String str2 = (String)li1.next();
			if (str2.equals("1")) {
				li1.add("2");
			}
		}
		System.out.println(list3);
	}

}

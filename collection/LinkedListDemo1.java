package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo1 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList类同样也实现了List接口 所以也能使用List里的一些方法
		LinkedList ld = new LinkedList();
		ld.add("a");
		ld.add("b");
		ld.add("c");
		ld.add("d");
		ld.add("e");
		ld.add("f");
		ld.add("g");
		System.out.println(ld);
		
		
		
		ld.addFirst("1");			//在集合中第一个位置添加元素
		System.out.println(ld);
		ld.addLast("2");			//在集合中最后一个位置添加元素
		System.out.println(ld);
		ld.removeFirst();			//在集合中第一个位置删除元素
		System.out.println(ld);
		ld.removeLast();			//在集合中最后一个位删除加元素
		System.out.println(ld);
		ListIterator it = ld.listIterator();
		
		
	}

}

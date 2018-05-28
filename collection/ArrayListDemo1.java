package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	//把去除重复集合元素的功能进行封装成一个方法方便进行调用
	//返回一个没有重复元素的一个集合
	static  ArrayList getSingleEle(ArrayList list) {
		ArrayList a2 = new ArrayList();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			String str = (String)it.next();
			if (!a2.contains(str)) { //集合a2中的元素不包含str元素才能返回true
				a2.add(str);
			}
		}
		return a2;
	}
	
	@SuppressWarnings({ "rawtypes", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//去除原集合中的重复元素
		ArrayList a1 = new ArrayList();
		a1.add("a");
		a1.add("a");
		a1.add("b");
		a1.add("b");
		a1.add("c");
		a1.add("c");
		System.out.println(a1);
		
		
		//调用方法进行去除重复元素
		ArrayList a2 = getSingleEle(a1);
		System.out.println(a2);
		
//		1、创建一个新的集合
//		2、把集合中的元素依次放入新的集合中
//		3、在放入的时候比较新集合中是否包含此元素
//		4、把元素放入新的集合当中
/*		ArrayList a2 = new ArrayList();
		Iterator it = a1.iterator();
		while(it.hasNext()) {
			String str = (String)it.next();
			if (!a2.contains(str)) { //集合a2中的元素不包含str元素才能返回true
				a2.add(str);
			}
		}
		System.out.println(a2);
		
*/
	}

}
















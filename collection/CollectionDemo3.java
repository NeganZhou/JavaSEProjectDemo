package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
class Cat{
	String name;
	public Cat(String name) {
		this.name = name;
	}
	public String toString() {
		return "Cat [name=" + name + "]";
	}
	public String fun() {
		return "Cat [name=" + name + "]";
	}
	
}
public class CollectionDemo3 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 使用数组方法遍历集合元素
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		Object object[] = c1.toArray();
		for (int i = 0; i < object.length; i++) {
			System.out.println(object[i]);
		}

		System.out.println("===================================");

		// 使用迭代器遍历集合元素
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		c2.add("e");
		Iterator i1 = c2.iterator();
//		System.out.println(i1.next());
//		
//		System.out.println(i1.next());   //使用完next（）方法以后指针自动向后移动一位
//		
//		
//		System.out.println(i1.hasNext());//hasnext（）方法判断后一位是否存在 若存在返回true 若不存在返回false
		
		//最常用用的迭代器输出方式
		while(i1.hasNext()) {
			System.out.println(i1.next());//每一次输出完成以后指针都会后移一位知道为空返回false无法进入while循环
		}
		
		
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Collection c3 = new ArrayList();
		c3.add(new Cat("mini"));
		c3.add(new Cat("miaomiao"));
		c3.add(new Cat("mimi"));
		Iterator i3 = c3.iterator(); //此处把c3中的元素放入iterator容器里面 并自动向上转型为object类型
		while(i3.hasNext()) {
			//System.out.println(i2.next().toString());//可以从写object中的toString方法进行输出
			//由于object类中并没有fun方法 所以不能调用进行输出  那就需要向下转型使用Cat类进行输出
			Cat cat = (Cat)i3.next();
			System.out.println(cat.fun());
		}
	}

}

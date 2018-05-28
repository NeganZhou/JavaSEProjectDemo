package collection;

import java.util.ArrayList;
import java.util.Collection;

/*遍历集合
1、先把集合转成数组  遍历数组  集合对象使用toArray（）方法 然后再给object 类*/
class Dog{
	private String name;

	public String getName() {
		return name;
	}
	public Dog(String name) {
		this.name = name;
	}
}

public class CollectionDemo2 {

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		Object o1[] = c1.toArray();
		for (int i = 0; i < o1.length; i++) {
			System.out.println(o1[i]);
		}
		Collection c2 = new ArrayList();
		c2.add(new Dog("xiangqiang"));
		c2.add(new Dog("wangcai"));
		c2.add(new Dog("xiaowangba"));
		
		Object o2[] = c2.toArray();
		for (int i = 0; i < o2.length; i++){
			
			Dog d1 = (Dog)o2[i];				//向下转型
			
			
			System.out.println(d1.getName());
		}
		
		System.out.println("================================================");
		
		Collection c3 = new ArrayList();
		c3.add("a");
		c3.add("b");
		c3.add("c");
		c3.add("d");
		
		Collection c4 = new ArrayList();
		c4.add("a");
		c4.add("c");
		c4.add("d");
		c3.add("e");
		c3.add("f");
		//对于一个集合对象来说（可能包含许多元素） add方法是往里添加对象，addAll方法是吧里面的元素合并到一个集合对象当中
//		c3.add(c4);
//		System.out.println(c3);//此处是吧c4对象添加了进来
		
//		c3.addAll(c4);			
//		System.out.println(c3);//此处是把c4对象合并了进来
		
		
//		c3.removeAll(c4);
//		System.out.println(c3);//把c3中和c4中相同的元素进行删除
		
//		boolean b1 = c3.contains(c4);
//	
//		System.out.println(c3);		//判断调用集合c3是否完全包含被调用的集合c4 若全部包含返回ture若没有包含返回false
//		System.out.println(b1);		//并添加未拥有元素
//		
		boolean b2 = c3.retainAll(c4);//取交集。并把交集的结果返回给调用者 
		System.out.println(c3);			//若调用对象发生改变返回true 若没有发生改变返回false
		System.out.println(b2);
	}

}

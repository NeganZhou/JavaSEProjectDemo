package collection;

import java.util.ArrayList;
import java.util.Collection;

/*java中的集合类
	它的长度可以改变
	能存储任意的对象
	长度随着对象的增加而增加
数组和集合类的区别
	数组可以存放基本数据类型和引用数据类型 集合只能够存放引用数据类型 （若存放基本数据类型也会自动装箱成包装类）
	集合之中只能存放对象
	数组的元素是固定的 集合的长度随着元素的增加而增加
什么时候用数组 什么时候用集合类
	1、如果元素固定就推荐使用数组
	1、如果元素不固定就推荐使用集合*/

class Student{
	String name;
	int age;
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
public class CollectionDome1 {
@SuppressWarnings({ "rawtypes", "unchecked" })
	
	public static void main(String[] args) {
	int  a[] = {1,2,3,4,5};
	int  b[] = new int[3];
		Collection collection = new ArrayList();
		collection.add("abc");
		Student student = new Student();
		student.name = "张三";
		student.age = 17;
		collection.add(student);
		System.out.println(collection);
		
		
		System.out.println("===================================");
		
		Collection c = new ArrayList();	//使用多态 向上转型
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		c.addAll(collection);			//addAll方法是将一个集合插入进来
		System.out.println(c);
		//从集合中移除一个元素
		c.remove("a");
		System.out.println(c);
		//获取集合长度
		System.out.println(c.size());
		
		//判断集合是否为空	为空true  不为空false
		System.out.println(c.isEmpty());
		//清除集合中的所有元素
		c.clear();
		
		//判断集合是否为空
		System.out.println(c.isEmpty());
		
		//获取集合长度
		System.out.println(c.size());
	}
	

}

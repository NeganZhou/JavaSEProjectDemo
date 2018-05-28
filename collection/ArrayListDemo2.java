package collection;

import java.util.ArrayList;
import java.util.Iterator;

class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return " [name=" + name + ", age=" + age + "]";
	}
/*	@Override
	public boolean equals(Object obj) {
		Person per = (Person)obj;
		
		return this.name.equals(per.name) && this.age == per.age;
	}*/
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class ArrayListDemo2 {

	static ArrayList getSingleEle(ArrayList list) {
		ArrayList a2 = new ArrayList();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object obj = (Object) it.next();
			if (!a2.contains(obj)) { // 集合a2中的元素不包含str元素才能返回true
				a2.add(obj);
			}
		}
		return a2;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(new Person("张三", 22));
		a1.add(new Person("张三", 22));
		a1.add(new Person("王五", 20));
		a1.add(new Person("王五", 20));
		a1.add(new Person("李四", 18));
		System.out.println(a1);
		
		
		//如果不从写equals方法的话contains方法是调用的object类中的方法 默认比较的是地址
		//每新建一个对象的地址都会不一样 所以若不从写equals方法的话此处是不会把重复类给去掉的
		ArrayList a2 = getSingleEle(a1); 
		System.out.println(a2);
	}

}

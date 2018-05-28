package collection;

import java.util.HashSet;
import java.util.Set;
class man {
	String name;
	int age;
	public man(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		man other = (man) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "man [name=" + name + ", age=" + age + "]";
	}
	
}
public class SetDemo1 {

	public static void main(String[] args) {
		//和List一样Set接口不可以直接实例化 需要使用HashSet或者TreeSet类进行向上转型实例化
		//Set中是无序的 并且是不可重复的
		
		
		
		
		

		//想要在Set中自定义对象并且去重 因为对象比较的是地址 每次创建一个对象地址都会不同即使属性是相同的
		//在这里和List接口中的去重有所不同单纯的覆盖equals方法是不可以的
		//覆盖equals方法
		//覆盖hashset方法
		Set<man> set = new HashSet<man>();
		set.add(new man("张三", 22));
		set.add(new man("张三", 22));
		set.add(new man("李四", 20));
		set.add(new man("李四", 20));
		set.add(new man("王五", 23));
		System.out.println(set);
	}

}

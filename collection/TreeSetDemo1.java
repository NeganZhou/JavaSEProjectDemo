package collection;

import java.util.TreeSet;
class Pig implements Comparable<Pig> {
	String name;
	int age;
	public Pig(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public int compareTo(Pig o) {
		/*若此方法中返回0系统就会以为每次比较的结构都是相同的根据Set接口的特性而不会
		重复输出相同元素，若返回一个正数系统就会按照二叉树方法进行元素
		存放排序若返回负数反知*/
		return  this.age - o.age == 0 ? this.name.compareTo(o.name) : this.age - o.age;
	}
	@Override
	public String toString() {
		return "Pig [name=" + name + ", age=" + age + "]";
	}
	
}
public class TreeSetDemo1 {

	public static void main(String[] args) {
		//TreeSet集合元素输出时会进行排序输出
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(1);
		ts1.add(20);
		ts1.add(4);
		ts1.add(9);
		System.out.println(ts1);
		
		//在TreeSet中排序汉字的时候时按照Unicode码来排序的
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("加");
		ts2.add("油");
		ts2.add("干");
		ts2.add("啊");
		System.out.println(ts2);
		
		//添加自定义类型到TreeSet当中
		TreeSet<Pig> ts3 = new TreeSet<Pig>();
		ts3.add(new Pig("小白猪", 3));
		ts3.add(new Pig("小黑猪", 2));
		ts3.add(new Pig("小花猪", 1));
		System.out.println(ts3);
	}

}

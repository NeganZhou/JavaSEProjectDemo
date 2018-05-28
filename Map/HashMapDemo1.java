package Map;

import java.util.HashMap;
class Student{
	private String name;
	private int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
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
		Student other = (Student) obj;
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
public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm1 = new HashMap<>();
		hm1.put("a", 1);
		hm1.put("a",2);
		System.out.println(hm1);
		
		
		
		HashMap<Student, String> hs2 = new HashMap<>();
		hs2.put(new Student("张三", 21), "北京");
		hs2.put(new Student("张三", 21), "乌鲁木齐");
		hs2.put(new Student("李四", 28), "上海");
		hs2.put(new Student("王五", 28), "天津");
		System.out.println(hs2);
		
	}
}

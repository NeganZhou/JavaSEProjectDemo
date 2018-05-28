package genericType;

import java.util.ArrayList;
//用集合定义一个学科 学科中的元素是班级 班级之中有学生 最后把学生的姓名输出出来
class Student{
	String name;
	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
}
public class GenericTypeDemo2 {

	public static void main(String[] args) {
		//第一个班中的两位学生
		Student s1 = new Student("张三");
		Student s2 = new Student("李四");
		//第二个班中的两位学生
		Student s3 = new Student("王五");
		Student s4 = new Student("赵六");
		
		
		//定义第一个班级
		ArrayList<Student> b1 = new ArrayList<Student>();
		//添加学生
		b1.add(s1);
		b1.add(s2);
		
		//定义第二个班级
		ArrayList<Student> b2 = new ArrayList<Student>();
		//添加学生
		b2.add(s3);
		b2.add(s4);
		
		//创建学科集合
		//学科集合里放班级集合
		ArrayList<ArrayList<Student>> x1 = new ArrayList<ArrayList<Student>>();
		//向学科集合里添加班级
		x1.add(b1);
		x1.add(b2);
		
		//输出学生姓名（foreach）
		for (ArrayList<Student> arrayList : x1) {
			//第一层从学科里输出班级
			for (Student student : arrayList) {
				//第二层从班级之中输出姓名
				System.out.println(student.name);
			}
		}
		
		
	}

}

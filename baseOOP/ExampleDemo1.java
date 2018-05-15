package baseOOP;

class Student {
	private String name;
	private int age;
	private int stuno;
	private int math;
	private int english;
	private int computer;


//	public  Student() {// 无参构造函数，一会把这个注掉看看还能调用计算方法不
//
//	}

	public  Student(String name, int age, int stuno, int math, int english, int computer) {
		this.name = name;
		this.age = age;
		this.stuno = stuno;
		this.math = math;
		this.english = english;
		this.computer = computer;
	}

	public void setName(String n) {
		this.name = n;
	}

	public void setStuno(int s) {
		this.stuno = s;
	}

	public void setMath(int m) {
		this.math = m;
	}

	public void setEnglish(int e) {
		this.english = e;
	}

	public void setComputer(int c) {
		this.computer = c;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getStuno() {
		return stuno;
	}

	public int getMath() {
		return math;
	}

	public int getEnglish() {
		return english;
	}

	public int getComputer() {
		return computer;
	}

	public void print() {
		System.out.println("姓名" + getName() + ",年龄" + getAge() + ",学号" + getStuno() + ",数学成绩" + getMath() + ",英语成绩"
				+ getEnglish() + ",计算机成绩" + getComputer());
	}

	public int sum() {
		int sum;
		sum = getMath() + getEnglish() + getComputer();
		return sum;
	}
	public int avg() {
		int avg;
		avg = this.sum() / 3;
		return avg;
	}

	public int max() {
		int max;
		max = getMath() > getEnglish() ? getMath() : getEnglish();
		max = max > getComputer() ? max : getComputer();
		return max;
	}
	public int min() {
		int min;
		min = getMath() < getEnglish() ? getMath() : getEnglish();
		min = min < getComputer() ? min : getComputer();
		return min;
	}
}

public class ExampleDemo1 {
	public static void main(String args[]) {
		Student stu = new Student("zhouyu",22,2015,57,34,83);
		stu.print();
		System.out.println("最高成绩" + stu.max());
		System.out.println("最低成绩" + stu.min());
		System.out.println("平均成绩" + stu.avg());
	}

}

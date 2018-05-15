package baseOOP;

class Student {
	private String name;
	private int age;
	private int stuno;
	private int math;
	private int english;
	private int computer;


//	public  Student() {// �޲ι��캯����һ������ע���������ܵ��ü��㷽����
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
		System.out.println("����" + getName() + ",����" + getAge() + ",ѧ��" + getStuno() + ",��ѧ�ɼ�" + getMath() + ",Ӣ��ɼ�"
				+ getEnglish() + ",������ɼ�" + getComputer());
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
		System.out.println("��߳ɼ�" + stu.max());
		System.out.println("��ͳɼ�" + stu.min());
		System.out.println("ƽ���ɼ�" + stu.avg());
	}

}

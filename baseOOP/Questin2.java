package baseOOP;

//�������һ������Ա����employee�࣬������š�����������нˮ��нˮ�����������нˮ������Ĺ����ܶ��������
class Employee {
	private int ID = 007;
	private String name = "ղķ˹���";
	private double salary = 8848.99;
	private double risesalary = 0.01;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getRisesalary() {
		return risesalary;
	}
	public void setRisesalary(double risesalary) {
		this.risesalary = risesalary;
	}
	public double fun() {
		return salary + risesalary;
	}

}
public class Questin2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		System.out.println(e.fun());
	}

}

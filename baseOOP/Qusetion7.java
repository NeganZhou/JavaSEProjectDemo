package baseOOP;

/*
 编写一个公司员工类
数据成员：员工号、姓名、薪水、部门
方法
单参：只传递员工号，则员工姓名：无名氏、薪水：0、部门：未定
双参：传递员工号，姓名，则员工薪水为1000，部门：后勤
4参：传递员工号、姓名、部门、薪水
无参：均为空值
显示信息*/
class Employeee {
	private long ID;
	private String name;
	private double salary;
	private String department;

	public Employeee() {
	}

	public Employeee(long ID) {
		this.ID = ID;
	}

	public Employeee(long iD, String name) {
		this.ID = iD;
		this.name = name;
	}

	public Employeee(long iD, String name, double salary, String department) {
		ID = iD;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public String toString() {
		return "Employeee [ID=" + ID + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

public class Qusetion7 {

	public static void main(String[] args) {
		Employeee e1 = new Employeee();
		System.out.println(e1.toString());
		Employeee e2 = new Employeee(700);
		System.out.println(e2.toString());
		Employeee e3 = new Employeee(800, "黄三");
		e3.setSalary(1000);
		System.out.println(e3.toString());
		Employeee e4 = new Employeee(900, "王五", 8000.01, "manager");
		System.out.println(e4.toString());

	}

}

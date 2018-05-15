package baseOOP;

/*
 ��дһ����˾Ա����
���ݳ�Ա��Ա���š�������нˮ������
����
���Σ�ֻ����Ա���ţ���Ա�������������ϡ�нˮ��0�����ţ�δ��
˫�Σ�����Ա���ţ���������Ա��нˮΪ1000�����ţ�����
4�Σ�����Ա���š����������š�нˮ
�޲Σ���Ϊ��ֵ
��ʾ��Ϣ*/
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
		Employeee e3 = new Employeee(800, "����");
		e3.setSalary(1000);
		System.out.println(e3.toString());
		Employeee e4 = new Employeee(900, "����", 8000.01, "manager");
		System.out.println(e4.toString());

	}

}

package highOOP;
/*
��Java�п��Դ���һ����ר�������������࣬��������������ࡣ�����������������ģ��
����Ŀ������Ҫ����߰������ĸ�ʽ���޸Ĵ����µ��ࡣ���ǲ����ɳ�����ֱ�Ӵ�������
��ֻ��ͨ���������������µ��ࡣ��������������
������Ķ����ʹ�ù���
1��һ������ֻ�ܼ̳�һ��������
2������һ�����󷽷���������ǳ�����
3��������ͳ��󷽷�������ʹ��abstract�ؼ��ֽ�������
4�����󷽷�ֻ��Ҫ����������Ҫʵ��
5����������뱻����̳У����̳г���������಻�ǳ������������д�������еķ���*/
abstract class A{
	public static final String country = "CHINA";
	private String name = "Negan";
	public A() {
		System.out.println("�������еĹ��췽��");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void print();					//������󷽷�
	//���󷽷����üӷ�����
}
class B extends A {
	public void print() {
		System.out.println(this.country);
		System.out.println(this.getName());
	}
}
public class AbstractDemo1 {

	public static void main(String[] args) {
		B b = new B();		//ʵ����������󣬳��������޷���ʵ������
		//��Ȼ�˴�ʵ�����������൫��Ҳ���ȵ��õ��ǳ������еĹ��췽��
		b.print();			//���ñ����าд���ķ���
		
	}

}

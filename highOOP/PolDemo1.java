package highOOP;

//��̬��������������Ҫ��һ������ ��Ҫ��һ������������ʽ
//	1����������������д  
// ���������� ��������ͬ �����Ĳ������ͻ��߲�����������ͬ ʹ�ò�ͬ�ķ������������÷�������ʵ�ֲ�ͬ�Ĺ��ܵĵ���
// ��������д ��������ͬ����������ͬ ������д�ķ������ܱȸ��౻��д�ķ���������ϸ��Ȩ�� һ����������̳и���ʱ���Ƹ���ķ�������
//  2������Ķ�̬��
// ����Ķ�̬����Ҫ��Ϊ�������� 
//��1�� ����ת��  ��������������� 				��2������ת��    ���������������
class Pol1 {
	public void fun1() {
		System.out.println("Pol1�е�fun1����");
	}
	public void fun2() {
		this.fun1();
	}
}
class Pol2 extends Pol1 {
	public void fun1() {
		System.out.println("Pol2�е�fun1����");
	}
	public void fun3() {
		System.out.println("Pol2�е�fun3����");
	}
}
class Pol3 extends Pol1 {
	public void fun1() {
		System.out.println("Pol3�е�fun1����");
	}
	public void fun4() {
		System.out.println("Pol3�е�fun4����");
	}
}
public class PolDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pol2 p2 = new Pol2();	
		Pol1 p1 = p2;		//����ת��
		p1.fun1();			//�˷�����������д����
		p1.fun2();			//��Ϊfun1��������д�˴˴�fun2������pol2�е�fun1����
		p2.fun1();
		p2.fun2();
		
		
		System.out.println("=============================================");
		Pol1 pol1 = new Pol2();
		Pol2 pol2 = (Pol2)p1;		//����ת��
		p1.fun1();
		p1.fun2();
		pol2.fun1();
		pol2.fun2();
//		����������е������ɸ���̳ж�����fun2������fun2����Ҫ����fun1�������ڴ�ʱfun1�����ѱ�������д ���Դ�ʱ���õ�ʱ�����е�fun1����
		
		
		
		System.out.println("=============================================");
		fun(new Pol2());				//����Pol2ʵ����������ת��
		fun(new Pol3());				//����Pol3ʵ����������ת��
		//��Ϊһ����������ת���Ժ󣬵��õķ���һ��ʱ���౻��д���ķ���
		
		
	}
	public static void fun(Pol1 P) {				//���ܸ������
		P.fun1();
	}


}

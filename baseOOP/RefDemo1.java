package baseOOP;

//���ô���
//���ô��ݾ���ָ���ڴ�Ŀռ�ʹ��Ȩ�޽������ջ�ڴ�ռ�
class Demo {
	int temp = 100;
	
	
	
	
	private int num = 30;
	public void fun3(Demo d2) {
		d2.num = 50;
	}
	public void setNum(int n) {
		num = n;
	}
	public int getNum() {
		return num;
	}
}

public class RefDemo1 {

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.temp);
		demo.temp = 1000;
		System.out.println(demo.temp);
		System.out.println(fun1(demo.temp));
		//���Ϊ10000
		System.out.println(demo.temp);
		//���Ϊ1000˵��fun����ֻ��ֻ�ǿ�����һ�����ݲ������ı�
		//����һ�����ݺ�ԭ�������temp��˵��
		fun2(demo);
		System.out.println(demo.temp);
		
		
		
		
		System.out.println("====================");
		System.out.println(demo.getNum());
		demo.fun3(demo);  //�˴���Demo�Ķ��󴫻ص��Լ�������
		System.out.println(demo.getNum());
	}

	public static int fun1(int a) {
		a = 10000;
		return a;
	}
	public static void fun2(Demo d) {
		d.temp = 10000;
	}//�˷���������Demo�����demo����temp�����Խ������޸�
	
	
	
	
	
}

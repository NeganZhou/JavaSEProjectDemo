package JavaBasisDesign;

class Demo{
	private int age = 20;
	public int getAge() {    
		return age;
	}
	/* 1��get����ֻ�Ǽ򵥵Ļ�ȡ����
	 * 2������������Ļ�ֻ�ǰѱ�����ֵ���ݳ�ȥ��
	 * ����Ҫ�ѻ�ȡ������ֵ���ݳ�ȥ���Բ��ܴ��շ���ֵvoid����
	 * 3������ֻ�ǻ�ȡ����ֵ�������Բ��ô��β� 
	 * */
	public void setAge(int a) {	
		age = a;
	}
	/* 1��set����ֻ����������ֵ ��û�д����� �����Ǹ��շ�������void
	 * 2��set����Ҫ�����ͲΣ��Ա�����������ʵ�δ��ݹ���
	 * 3.����ʵ�����Ժ� �ڵ���setter��������ֵ�ͻᷢ���ı�
	 * */
}

public class TestGetterAndSetterMethods {
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println("age=" + demo.getAge());
		int age = 21;
		demo.setAge(age);
		System.out.println("age=" + demo.getAge());
		
	}

}

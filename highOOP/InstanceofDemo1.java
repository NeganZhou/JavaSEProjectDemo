package highOOP;
/*��Java�п���ʹ��instanceof�ؼ������ж�һ�����󵽵�����һ�����ʵ��
				��ʽ  			����  instanceof ��   ����>����boolean����*/
class  Ins1{
	public void fun1() {
		System.out.println("In1���е�fun1����");
	}
	public void fun2() {
		this.fun1();
	}
}
class Ins2 extends Ins1{
	public void fun1() {
		System.out.println("In2���е�fun1����");
	}
	public void fun3() {
		System.out.println("In2���е�fun3����");
	}
}
public class InstanceofDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ins1 ins1 = new Ins2();									//����ת��
		System.out.println("ins1 == Ins1" + (ins1 instanceof Ins1));
		System.out.println("ins1 == Ins2" + (ins1 instanceof Ins2));
		Ins1 ins = new Ins1();									//ͨ��Ins1�Ĺ��췽����ʵ����Ins1��
		System.out.println("ins1 == Ins1" + (ins instanceof Ins1));
		System.out.println("ins1 == Ins2" + (ins instanceof Ins2));
//		���п��Է��֣�ͨ������ʵ�����Ķ���ͬʱ���Ǹ���������ʵ�������Կ���ֱ�����ϻ�������ת�ͣ�����ͨ������ʵ�����Ķ��󣬾Ͳ�������ת���ˣ���Ϊ���಻֪��˭��
//		��������
		fun(new Ins2());
	}
	//ʹ��instanceof������ת��ǰ������֤
	public static void fun(Ins1 ins1) {
		if(ins1 instanceof Ins2) {
			Ins2 ins = (Ins2) ins1;			//����ת��
			ins.fun1();
		}
	}

}

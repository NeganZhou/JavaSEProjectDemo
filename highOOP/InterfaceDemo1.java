package highOOP;
/*interface���Ա����Ϊһ��������࣬����ȫ�ֳ����Լ���public���εķ�����ɵ�
�ڽӿ��ж���ĳ��󷽷�������public�����*/
interface AA{
	//���ڽӿڵĻ��������Ѿ���ȷ�����˽ӿ�����ȫ�ֳ����ͳ��󷽷���ɵ� ������
	String name = "����";      	//�˴��ȼ���public static final String name = ����
	void print();				//�˴��ȼ���public abstract void print();
	String getInfo();			//�˴��ȼ���public abstract String getInfo();
}
interface BB{
	void say();
}
abstract class XX{
	//�˴�����һ��������
	public abstract void fun();
}
class CC extends XX implements AA, BB {		//�ȼ̳��������XX��Ȼ����ʹ��implements�ؼ�����ʵ�ֽӿ� 
	//һ������ʵ���������ӿ� �Ǿͱ�����д�������ӿ���ȫ���ĳ��󷽷�
	public String getInfo() {
		return "Hello";
	}
	public void print() {
		System.out.println(getInfo());
	}
	public void say() {
		System.out.println("World!");
	}
	public void fun() {
		System.out.println("��һ�����Կ��ϵ�");
	}
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CC cc = new CC();
		System.out.println(cc.name);
		cc.print();
		cc.say();
		cc.fun();

	}

}

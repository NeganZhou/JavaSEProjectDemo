package highOOP;
//���˺�����̸����

//Ҫ���˵���̬ȥ̸
//����׹¥��
//���˱���ȥ����
class Man{
	public void fun() {
		System.out.println("̸����");
	}
}
class SuperMan extends Man{
	public void fly() {
		System.out.println("��ȥ����");
	}
}
public class Test2 {
	public static void main(String[] args) {
		//SuperMan superMan = new SuperMan();
		//superMan.fun();		��Ӧ���ó��˵���̬ȥ̸���� ��ѱ������ߵ�
		Man man = new SuperMan();
		man.fun();
		//ͻȻ����׹¥��
		//����
		SuperMan superMan = (SuperMan)man;
		superMan.fly();
	}
}

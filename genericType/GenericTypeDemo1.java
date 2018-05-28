package genericType;
/**
 * ʲô�Ƿ��ͣ�
 * ���;��ǹ㷺ͨ�õ�����   ��һ��ʼ��ȷ����ʲô���ͣ���ʹ�õ�ʱ�����ȷ����ʲô���ͣ�
 * ����ģ�������Ͳ�ȷ����˭�����˸öδ��룬˭�Ϳ�����ָ���������
 * @author Negan
 *
 */
//���Ϳ��Խ��

/*
 * 1������Ӽ�����ȡ������ֵ����Ҫǿ��ת��������Ҫ���� ����Ϊobject����
 * 2��û��Լ�����ϵ���ֻ��ĳһ�����ͣ���������ת�ͣ�
 * 3�����Խ��ж��崫�ݶ�������*/

class Point<T>{                  //������
	//�������ַ�������  �����ǰ�װ�� 
	//������㶨��ɷ���
	T x;
	T y;


	//���ͷ���        ʹ�÷��ͷ�������Ҫ�в�����������
	<T> void fun(T x) {
		System.out.println(x);
	}
	static <T> void fun2(T name) {
		System.out.println(name);
	}
	static <T> T fun3(T age) {		
		return age;				//�˴����ص�������һ����װ��							
	}
}
public class GenericTypeDemo1 {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		//�˴�����ָ�����͵ĵ������� Ĭ��Ϊobject����
		 Point p1 = new Point();
		 p1.x = 10;
		 p1.y = "20";
		 p1.fun2("����");
		 p1.fun2(12);
		 Integer in = p1.fun3(20);
		 System.out.println(in);
		 Point<String> p2 = new Point<String>();
		 p2.x = "10";
		 p2.y = "20";
		 
		 //����ֻ�ܲ��������������� ����ʹ�û�����������
		 Point<Integer> p3 = new Point<Integer>();
		 p3.x = 10;
		 p3.y = 20;
		 
		 Point<Double> p4 = new Point<Double>();
		 p4.x = 10.2;
		 p4.y = 21.3;
	}

}

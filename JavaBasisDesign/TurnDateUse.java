package JavaBasisDesign;
/*
 * ������������
 * 1������ byte short int long
 * 2�������� float double
 * 3���ַ��� char
 * 4�������� boolean
 * ������������
 * 1������
 * 2����
 * 3���ӿ�
*/
public class TurnDateUse {
	public static void main(String[] args) {
		//����ת�������ɵ͵���ת��
		//����ת��ֻ�����Ƹ���� ����Ӱ��ԭ�ȶ������������
		int a = 10;
		float b = 3.3f;
		System.out.println("a/b= "+(a/b));
		//�����int������ת��Ϊfloat��Ϊ3.030303
		System.out.println("10/3.3= "+(10/3.3));
		//С����Ĭ������Ϊdouble�� �����int������ת��Ϊdouble��Ϊ3.0303030303030303
		System.out.println("----------------------------------");
		//�κ����Ͷ�������String��ת��
		String str = "zhouyu";
		System.out.println(str + 21);
		//�κ��������͵ı������߳�������String��������Stringת��
		System.out.println("-----------------=====================");
		int m = 1;
		int n = 2;
		System.out.println("m + n= " + m + n);
		/*������+��ֻ�Ǳ�����ַ�������������
		 * �����������ֵ�����������ϣ�������*/
		
		
		
		//�������͵�ǿ��ת��
		//��Ҫת�������ͣ���������;
		float f = 3.3f;
		int x;
		f = (int) f;
		x = (int) f;
		System.out.println(f);
		System.out.println(x);
		
		
		x = -30;
		System.out.println(+x);
//		ʹ�����������ֵ �����ܸı���Ϊ����
	}
}

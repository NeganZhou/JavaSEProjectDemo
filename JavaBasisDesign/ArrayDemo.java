package JavaBasisDesign;

public class ArrayDemo {
	public static void main(String[] args) {
		//arm 1��learn static array 2��learn dynamic array 3��learn for each
		//for each only traverse�������� both array and object������
//		int arr[] = new int[9];
/*		int arr[] = null;	//statment one dimension array
		arr = new int[9];	//distribution memory to array
*/
		//1 static array
		int a[] = {1,5,3,4};//��̬��������ʱ���ƺ����[]�ﲻ��д����
		for (int i : a) {
			System.out.println(i);
		}
		//i of forech is values of array  foreach�б�������ʱʹ�õ�i���������ֵ ����ʹ��
		System.out.println("++++++++++++++++++++++++++++++++++");
		//2 dynamic array
		int b[] = new int [5]; 
		for (int i = 0; i < b.length; i++) {
			b[i] = i * 2;
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println("b["+ i + "] = " + b[i]);
		}
		System.out.println("array b is " +b.length);
		//.length �����������˵�� ������һ��int�͵���������ʾ����ĳ����Ǵ�1��ʼ��
		//.length()�Ƕ��ַ�����˵��һ������ ��������ַ����ĳ���
		//.size()����Է��ͼ�����˵�ģ����뿴������ͼ����ж���Ԫ�ؾͿ��Ե��ô˷���
	}
}

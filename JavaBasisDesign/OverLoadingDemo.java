package JavaBasisDesign;

//����������overloading 
public class OverLoadingDemo {
	public static int add(int a, int b, int c) {
		int temp = 0;
		temp = a + b + c;
		return temp;
	}

	public static int add(int a, int b) {
		int temp = 0;
		temp = a + b;
		return temp;
	}
	/*���������
	 * public static float add(int a, int b) { ����float �͵������ĸ���������һ��
	 * float temp = 0;
	 * temp = a + b;
	 * return temp;
	 * }
	 * public static int add(int x, int y) { ����int�ͣ������������ͼ�����һ��
	 * int temp = 0;
	 * temp = x + y;
	 * return temp;
	 * }*/
	public static void main(String[] args) {
		int n = 5, m = 6, k = 7;
		int a = add(n, m);
		int b = add(m, n, k);
		System.out.println("a+b = "+ a);
		System.out.println("a+b+c = "+ b);
		//���� System.out.println();Ҳ�Ǹ����ط���
		//����������Ρ������͡��ַ��������͵�
		//��ν���������ؾ��Ƿ�������ͬ�����������͡����������Ĳ�ͬ��ͨ�����ݲ����ĸ��������͵Ĳ�ͬ����ɷ����ĵ��á�
		
	}

}

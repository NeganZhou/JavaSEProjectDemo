package JavaBasisDesign;
import java.util.Arrays;

//��������ô���
public class ArrayRefDemo {
	public static void main(String[] args) {
		int x[] = { 1, 2, 3, 4, 5, 6 };
		fun(x);
		for (int i : x) {
			System.out.print(i);
		}
		System.out.println();
		int temp[] = arr(); // �����ε����������մ�����������
		print(temp);
		sort(x);
		print(x);
		System.out.println("=========================");
		int a[] = {2,23,1,4,6,9,8};
		int b[] = {9,8,7,6,5,4,3,2,1};
		sort(a);
		print(a);
		System.out.println("\n================");
		sort(b);
		print(b);
		//ʹ��java�����ֱ���������
		int c[] = {132,654,13,643,321,856};
		Arrays.sort(c);
		print(c);

	}

	public static void fun(int a[]) {
		a[0] = 6;
	}

	// ʹ�÷�����������
	public static void print(int a[]) {
		for (int i : a) {
			System.out.print(i+"��");
		}
	}

	public static int[] arr() { // ֻ����������ķ�����
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		return a; // ���ش�����
	}

	// ����������д��һ������������
	public static int[] sort(int a[]) {
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			if (min != i) {
				temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			
			}
		}
		return a;
	}
}

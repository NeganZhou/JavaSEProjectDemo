package JavaBasisDesign;
import java.util.Arrays;

//数组的引用传递
public class ArrayRefDemo {
	public static void main(String[] args) {
		int x[] = { 1, 2, 3, 4, 5, 6 };
		fun(x);
		for (int i : x) {
			System.out.print(i);
		}
		System.out.println();
		int temp[] = arr(); // 用整形的数组来接收传过来的数组
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
		//使用java类库来直接完成排序
		int c[] = {132,654,13,643,321,856};
		Arrays.sort(c);
		print(c);

	}

	public static void fun(int a[]) {
		a[0] = 6;
	}

	// 使用方法返回数组
	public static void print(int a[]) {
		for (int i : a) {
			System.out.print(i+"、");
		}
	}

	public static int[] arr() { // 只是整形数组的方法！
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		return a; // 返回此数组
	}

	// 将数组排序写成一个方法来调用
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

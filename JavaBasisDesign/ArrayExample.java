package JavaBasisDesign;

public class ArrayExample {
	public static void main(String[] args) {
		// request array max and min
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		fun(arr);
		int array[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		bubleOrder(array);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		selectOrder(array);
	}

	public static void fun(int x[]) {
		int min = 0;
		int max = 0;
		max = min = x[0];
		for (int i = 0; i < x.length; i++) {
			if (max < x[i]) {
				max = x[i];
			}
			if (min > x[i]) {
				min = x[i];
			}
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}

	public static void bubleOrder(int a[]) {
		int temp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i; j < a.length - 1; j++) {
				if (a[j] > a[j++]) {
					temp = a[j];
					a[j] = a[j++];
					a[j++] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}

	public static void selectOrder(int a[]) {
		int min, temp;
		for (int i = 0; i < a.length - 1; i++) {
			min = i;
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			if (min != i) {
				temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
		for (int i : a) {
			System.out.print(i + "\t");
		}
	}
}

package JavaBasisDesign;

import java.util.Scanner;

public class WorkTest1 {
	public static void fun1() {
		// long a = 1, temp = 1;
		// long sum = 0;
		// while(a <= 20) {
		// temp = temp * a;
		// System.out.println(temp +"*" + a);
		// sum = sum + temp;
		// System.out.println(sum);
		// a++;
		// }
		// System.out.println(sum);
		long m = 1, sum = 0;
		for (int i = 1; i <= 20; i++) {
			for (int j = 1; j <= i; j++) {
				m = m * j;
				sum = sum + m;
			}
		}
		System.out.println(sum);

	}

	public static void number(int a[]) {
		int j = 0, o = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				o++;
			} else {
				j++;
			}
		}
		System.out.println("寄函数有" + j + "偶函数有" + o);

	}

	// 有两个个数组 把old数组中的0去掉以后 把不为零的数组传入new数组
	public static void array() {
		int oldarray[] = { 1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5 };
		int newarray[] = new int[20];
		int x = 0;
		for (int i = 0; i < oldarray.length; i++) {
			if (oldarray[i] != 0) {
				newarray[x] = oldarray[i];
				x++;
			}
		}
		for (int i : newarray) {
			if (i == 0) {
				return;
			}
			System.out.print(i + "、");
		}
	}

	// 定义一个整形数组 求出数组元素的和、数组元素的最大值最小值，并输出所求结果
	public static void fun2(int a[]) {
		int sum = 0, max = 1, min = 1;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("和为" + sum + "最大值为" + max + "最小值为" + min);

	}

	// 给出10个整数 然后输入一个数字查询是不是在这个数组内
	public static void fun3(int a[]) {
		Scanner sca = new Scanner(System.in);
		int x;
		x = sca.nextInt();
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (x == a[i]) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("在数组中");
		}
		if (flag == false) {
			System.out.println("不在数组中");
		}

	}

	// 给出10个老师的打分，对10个老师的打分找到最高分
	public static void fun4() {
		int a[] = new int[10];
		int max = 0;
		Scanner sca = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = sca.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("最高分为" + max);
	}

	// 有10个0-9之间的数字 分别计算0-9这10个数字出现了多少次
	public static void fun5() {
		Scanner sca = new Scanner(System.in);
		int zero = 0, one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0;
		int a[] = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = sca.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				zero++;
			} else if (a[i] == 1) {
				one++;
			} else if (a[i] == 2) {
				two++;
			} else if (a[i] == 3) {
				three++;
			} else if (a[i] == 4) {
				four++;
			} else if (a[i] == 5) {
				five++;
			} else if (a[i] == 6) {
				six++;
			} else if (a[i] == 7) {
				seven++;
			} else if (a[i] == 8) {
				eight++;
			} else if (a[i] == 9) {
				nine++;
			}
		}
		System.out.println("0出现了" + zero + "次" + "1出现了" + one + "次" + "2出现了" + two + "次" + "3出现了" + three + "次" + "4出现了"
				+ four + "次" + "5出现了" + five + "次" + "6出现了" + six + "次" + "7出现了" + seven + "次" + "8出现了" + eight + "次"
				+ "9出现了" + nine + "次");
	}

	// 定义一个整形数组，保存10个数据，利用程序完成将最大值保存在数组第一个元素的位置
	public static void fun6(int a[]) {
		int max = 0;
		int length = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
				length = i;
			}
			System.arraycopy(a, length, a, 0, 1);
		}
	}
	//在排好的数组中插入一个数字，将数字添加到合适的位置
	public static void fun7(int a[]) {
		int index = 0;
		Scanner sca = new Scanner(System.in);
		int num = sca.nextInt();
		int x[] = new int[a.length+1];
		for (int i = 0; i < x.length; i++) {
			if (num <= a[i]) {
				index = i;
				break;
			}
		}
			for (int j = 0; j < a.length; j++) {
				x[j] = a[j];	
			}
			for (int i = x.length - 2; i >= index ; i--) {//因为第一个元素的下标为0 所以减一再减一=-2
				x[i+1] = x[i];	
			}
			x[index] = num;
			for (int i = 0; i < x.length; i++) {
				System.out.print(x[i]+"、");
			}
		
	}
	public static void main(String[] args) {
		fun1();
		System.out.println("============================");
		int a[] = { 1, 2, 3, 4, 6, 7, 8, 9 };
		// number(a);
		// array();
		// System.out.println("\n============================");
		// fun2(a);
		// fun3(a);
		// fun4();
		// fun5();
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + "、");
//		}
//		fun6(a);
//		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ "、");	
		}
		System.out.println();
		fun7(a);
	}

}

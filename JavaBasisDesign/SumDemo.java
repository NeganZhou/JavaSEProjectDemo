package JavaBasisDesign;

public class SumDemo {

	public static void main(String[] args) {
		// 用 for do while while 循环求出100~200的和
		// int sum = 0;
		// for (int i = 100; i <= 200; i++) {
		// sum = sum + i;
		// }
		// System.out.println(sum);
		// int a = 100;
		// do {
		// sum += a;
		// a ++;
		// } while (a <= 200);
		// System.out.println(sum);
		// int a = 100;
		// while (a <= 200) {
		// sum += a;
		// a++;
		// }
		// System.out.println(sum);

		// determine13-23+33-43+53....-1003 of to sum
		// int x = 13;
		// int flag = -1;
		// for (int num = 23; num <= 1003; num += 10) {
		// x += num * flag;
		// flag *= -1;
		// }
		// System.out.println(x);
		// int sum = 13;
		// for (int i = 23; i <= 1003; i += 10) {
		// if (i / 10 % 2 == 0) {
		// sum -= i;
		// } else {
		// sum += i;
		// }
		// System.out.println(sum);
		// }
		// int a = 10, b = 20, c = 30, d = 0;
		// d = (a > b ? a : b) > c ? d : c;
		// System.out.println(d);
		// System.out.println("============");
		// determine 1! + 2! + 3! +........+_ 20! of to sum
		long sum = 0;
		for (int i = 1; i < 21; i++) {
			sum += fun(i);
		}
		System.out.println(sum);

	}

	public static int fun(int x) {
		int sum = 1;
		for (int i = 1; i <= x; i++) {
			sum *= i;
		}
		return sum;
	}
}

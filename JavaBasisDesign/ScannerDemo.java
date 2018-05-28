package JavaBasisDesign;

import java.util.Scanner;

class ScannerDemo {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
//		int score;
//		while(true) {
//			score = sca.nextInt();
//			if (score <= 100 && score >= 0 ) {
//				System.out.println("成绩录入成功");
//				System.exit(1);
//			}else {
//				System.out.println("成绩录入失败请重新输入");
//			}
//		}
		
		//用三目运算符求最大最小值
		int a , b , max , min;
		System.out.println("请输入a的值");
		a = sca.nextInt();
		System.out.println("请输入b的值");
		b = sca.nextInt();
//		max = a > b ? a:b;
//		min = a < b ? a:b;
		if (a > b) {
			System.out.println("The max is a");
			System.out.println("The mini is b");
		} else {
			System.out.println("The max is b");
			System.out.println("The mini is a");
		}
		

	}
}
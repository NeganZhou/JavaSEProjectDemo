package JavaBasisDesign;

import java.util.Scanner;

class ScannerDemo {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
//		int score;
//		while(true) {
//			score = sca.nextInt();
//			if (score <= 100 && score >= 0 ) {
//				System.out.println("�ɼ�¼��ɹ�");
//				System.exit(1);
//			}else {
//				System.out.println("�ɼ�¼��ʧ������������");
//			}
//		}
		
		//����Ŀ������������Сֵ
		int a , b , max , min;
		System.out.println("������a��ֵ");
		a = sca.nextInt();
		System.out.println("������b��ֵ");
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
package JavaBasisDesign;

import java.util.Scanner;

public class StarDemo {

	public static void main(String[] args) {
		// print
		/*
		 * * * * * * * * * * * * * *
		 */
		// for (int i = 0; i < 3; i++) {
		// for (int j = 1; j <= 4 / 2 - i; j++) {
		// System.out.print(" ");
		// }
		// for (int j = 1; j <= i * 2 + 1; j++) {
		// System.out.print("*");
		// }
		// System.out.println();
		// }
		// for (int i = 1; i <= 2; i++) {
		// for (int j = 1; j < i + 1 ; j++) {
		// System.out.print(" ");
		// }
		// for (int j = 1; j <= 4 / i - 1; j++) {
		// System.out.print("*");
		// }
		// System.out.println();
		// }
		Scanner sca = new Scanner(System.in);
		int x = 0;
		x = sca.nextInt();
		while (true) {
			if (x / 2 == 0) {
				System.out.println("please again inter a odd number");
				
			} else {
				x = sca.nextInt();
				print(x);
				System.exit(1);
			}
		}
	}

	public static void print(int x) {
		// ��������������ֻ��������
		// ��ô�����ż����ʱ��ֻ�ܸ�����һ�»��߼�һ�»����Ƴ�
		// ����������ż��ʱ������ʾ��������Ϊ��
		for (int i = 1; i <= x / 2 + 1; i++) {
			for (int j = x / 2 + 1; j > x / 2 - 1; j++) {
				System.out.print(" ");
			}	
			for (int j = 1; j < 2 * i - 1; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		for (int i = 1; i < x / 2; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < x / 2 -i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}
}

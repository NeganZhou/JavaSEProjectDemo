package JavaBasisDesign;

public class NarcissisticNumber {

	public static void main(String[] args) {
		//水仙花数是一个3位数 其各位数的立方和等于它本身
		int a , b , c;
		System.out.print("水仙花数有：");
		for (int i = 0; i < 1000; i++) {
			a = i / 100;				//hundred place
			b = i % 100 / 10;			//tens place
			c = i % 100 % 10;			//ones place
			if ((a * a * a + b * b * b + c * c * c) == i) {
				System.out.print(i + "\t");
			}
		}
	}

}

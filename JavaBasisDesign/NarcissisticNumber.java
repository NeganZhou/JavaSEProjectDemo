package JavaBasisDesign;

public class NarcissisticNumber {

	public static void main(String[] args) {
		//ˮ�ɻ�����һ��3λ�� ���λ���������͵���������
		int a , b , c;
		System.out.print("ˮ�ɻ����У�");
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

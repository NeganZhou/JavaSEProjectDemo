package JavaBasisDesign;

public class MultiplicationTable {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = i; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + (i * j));
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}

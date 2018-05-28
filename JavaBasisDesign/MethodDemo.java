package JavaBasisDesign;

public class MethodDemo { 
	public static void print() {
		char str[] = {'Z', 'h', 'o', 'u', 'Y', 'u'};
		for(char i : str) {
			System.out.print(i);
		}
	}
	public static void main(String[] args) {
		System.out.print("Hello");
		print();
	}
}

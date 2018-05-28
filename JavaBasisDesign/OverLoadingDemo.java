package JavaBasisDesign;

//方法的重载overloading 
public class OverLoadingDemo {
	public static int add(int a, int b, int c) {
		int temp = 0;
		temp = a + b + c;
		return temp;
	}

	public static int add(int a, int b) {
		int temp = 0;
		temp = a + b;
		return temp;
	}
	/*错误的重载
	 * public static float add(int a, int b) { 返回float 型但参数的个数及数量一致
	 * float temp = 0;
	 * temp = a + b;
	 * return temp;
	 * }
	 * public static int add(int x, int y) { 返回int型，但参数的类型及个数一致
	 * int temp = 0;
	 * temp = x + y;
	 * return temp;
	 * }*/
	public static void main(String[] args) {
		int n = 5, m = 6, k = 7;
		int a = add(n, m);
		int b = add(m, n, k);
		System.out.println("a+b = "+ a);
		System.out.println("a+b+c = "+ b);
		//另外 System.out.println();也是个重载方法
		//可以输出整形、浮点型、字符、布尔型等
		//所谓方法的重载就是方法名相同，但参数类型、参数个数的不同，通过传递参数的个数和类型的不同以完成方法的调用。
		
	}

}

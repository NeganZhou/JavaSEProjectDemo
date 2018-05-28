package JavaBasisDesign;
/*
 * 基本数据类型
 * 1、整形 byte short int long
 * 2、浮点型 float double
 * 3、字符型 char
 * 4、布尔型 boolean
 * 引用数据类型
 * 1、数组
 * 2、类
 * 3、接口
*/
public class TurnDateUse {
	public static void main(String[] args) {
		//数据转换必须由低到高转换
		//类型转换只能限制该语句 不能影响原先定义的数据类型
		int a = 10;
		float b = 3.3f;
		System.out.println("a/b= "+(a/b));
		//结果由int型向上转化为float型为3.030303
		System.out.println("10/3.3= "+(10/3.3));
		//小数的默认类型为double型 结果由int型向上转化为double型为3.0303030303030303
		System.out.println("----------------------------------");
		//任何类型都会向着String型转换
		String str = "zhouyu";
		System.out.println(str + 21);
		//任何数据类型的变量或者常量碰到String都会向着String转换
		System.out.println("-----------------=====================");
		int m = 1;
		int n = 2;
		System.out.println("m + n= " + m + n);
		/*单纯的+号只是表达了字符串的链接问题
		 * 若想表达关于数值的运算必须加上（）才行*/
		
		
		
		//数据类型的强制转换
		//（要转换的类型）变量类型;
		float f = 3.3f;
		int x;
		f = (int) f;
		x = (int) f;
		System.out.println(f);
		System.out.println(x);
		
		
		x = -30;
		System.out.println(+x);
//		使用正号输出负值 并不能改变其为正数
	}
}

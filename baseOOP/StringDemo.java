package baseOOP;
//在定义String时开头首字母需要大写，所以本身也是一个类本类

public class StringDemo {
	public static void main(String args[]) {
		// 对于String可采用直接赋值的的方法
		String name1 = "zhouyu";
		System.out.println(name1);
		// 直接调用String中的构造方法
		String name2 = new String("wuxue");
		System.out.println(name2);
		// String类型的比较
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = str2;
		System.out.println("str1 == str2 = " + (str1 == str2));
		System.out.println("str3 == str1 = " + (str3 == str1));
		System.out.println("str2 == str3 = " + (str2 == str3));
		// 虽然String里的内容都时一样的但是比较的结果不相同
		// 这样就可以清楚的发现 == 是进行地址比较的

		System.out.println("+++++++++++++++++++++++++++++++++");

		// public boolean equals(String str)
		// 使用equals方法对String内容进行比较
		System.out.println("str1 equals str2 = " + (str1.equals(str2)));
		System.out.println("str3 equals str1 = " + (str3.equals(str1)));
		System.out.println("str2 equals str3 = " + (str2.equals(str3)));
		// 因为equals方法是进行内容比较，所以返回的结果都是true

		// String 两种实例化方式的区别
		// 其实一个字符串就是String类的一个匿名对象，匿名对象就是已经开辟了堆空间并可以直接使用的对象
		System.out.println("Hello equals Hello = " + ("Hello".equals("Hello")));
		// 字符串直接调用了String类中的方法

		String str4 = "hello";
		String str5 = "hello";
		String str6 = "hello";
		System.out.println("str4 == str5 = " + (str4 == str5));
		System.out.println("str6 == str4 = " + (str6 == str4));
		System.out.println("str5 == str6 = " + (str5 == str6));
		// 如果一个字符串被一个名称所引用，则以后再有相同的字符串声明时，就不会重新
		// 开辟空间，而继续使用已经开辟好的堆空间 数字同理'
		
		
		/*对于String的以上操作，在java中称为共享设计，这种设计的思路是，在java
		 * 中形成一个对象池，在这个对象池中保存多个对象，新的实例化对象若是在对
		 * 象池中已经定义，就不再重新定义，而在池中取出直接使用*/
	}
}

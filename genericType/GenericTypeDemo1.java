package genericType;
/**
 * 什么是泛型？
 * 泛型就是广泛通用的类型   （一开始不确定是什么类型，在使用的时候才能确定是什么类型）
 * 代码模板中类型不确定，谁调用了该段代码，谁就可以来指明这个类型
 * @author Negan
 *
 */
//泛型可以解决

/*
 * 1、解决从集合中取出来的值必须要强制转换成我需要的类 否者为object类型
 * 2、没法约束集合当中只存某一种类型（进行向下转型）
 * 3、可以进行定义传递多种类型*/

class Point<T>{                  //泛型类
	//可以是字符串类型  可以是包装类 
	//把这个点定义成泛型
	T x;
	T y;


	//泛型方法        使用泛型方法必须要有参数才有意义
	<T> void fun(T x) {
		System.out.println(x);
	}
	static <T> void fun2(T name) {
		System.out.println(name);
	}
	static <T> T fun3(T age) {		
		return age;				//此处返回的类型是一个包装类							
	}
}
public class GenericTypeDemo1 {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		//此处若不指明泛型的调用类型 默认为object类型
		 Point p1 = new Point();
		 p1.x = 10;
		 p1.y = "20";
		 p1.fun2("张三");
		 p1.fun2(12);
		 Integer in = p1.fun3(20);
		 System.out.println(in);
		 Point<String> p2 = new Point<String>();
		 p2.x = "10";
		 p2.y = "20";
		 
		 //泛型只能采用引用数据类型 不能使用基本数据类型
		 Point<Integer> p3 = new Point<Integer>();
		 p3.x = 10;
		 p3.y = 20;
		 
		 Point<Double> p4 = new Point<Double>();
		 p4.x = 10.2;
		 p4.y = 21.3;
	}

}

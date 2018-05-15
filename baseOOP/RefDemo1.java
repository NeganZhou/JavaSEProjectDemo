package baseOOP;

//引用传递
//引用传递就是指堆内存的空间使用权限交给多个栈内存空间
class Demo {
	int temp = 100;
	
	
	
	
	private int num = 30;
	public void fun3(Demo d2) {
		d2.num = 50;
	}
	public void setNum(int n) {
		num = n;
	}
	public int getNum() {
		return num;
	}
}

public class RefDemo1 {

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.temp);
		demo.temp = 1000;
		System.out.println(demo.temp);
		System.out.println(fun1(demo.temp));
		//结果为10000
		System.out.println(demo.temp);
		//结果为1000说明fun方法只是只是拷贝了一份数据并把它改变
		//但这一份数据和原来定义的temp不说话
		fun2(demo);
		System.out.println(demo.temp);
		
		
		
		
		System.out.println("====================");
		System.out.println(demo.getNum());
		demo.fun3(demo);  //此处把Demo的对象传回到自己的类中
		System.out.println(demo.getNum());
	}

	public static int fun1(int a) {
		a = 10000;
		return a;
	}
	public static void fun2(Demo d) {
		d.temp = 10000;
	}//此方法接受了Demo类对象demo并将temp的属性进行了修改
	
	
	
	
	
}

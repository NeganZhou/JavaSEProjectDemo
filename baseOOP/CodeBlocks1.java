package baseOOP;

//用{}阔起来的叫代码块
//代码块分为  1、普通代码块 2、构造块3、静态代码块 4、同步代码块  
class CBDemo {
	// 构造代码块
	{
		System.out.println("构造块");
	}
	static {
		System.out.println("静态代码块");
	}

	public CBDemo() {
		System.out.println("构造方法");
	}
}

public class CodeBlocks1 {
	static {
		System.out.println("主方法中的静态代码块");
	}

	public static void main(String[] args) {
		// 普通代码块
		{
			System.out.println("普通代码块之中");
		}

		System.out.println("代码块之外");
		new CBDemo();
	}

}

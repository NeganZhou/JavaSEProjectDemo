package baseOOP;
//public： 表示此方法可以被外部类调用
//static：表示此方法可以直接由类名引用
//void：主方法是程序的起点不需要任何的返回值
//main：系统规定好的默认方法的名称，执行时默认找到main方法的名称
//String args[]：表示程序运行时传递的参数
public class KnowledgeMain {
//在编译的时候输入参数
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 3) {
			System.out.println("输入的参数不足三个程序退出");
			System.exit(1);
		}
		for(int x = 0; x < args.length; x++) {
			System.out.println("第" + (x  + 1) + "个参数" + args[x]);
		}
	}

}

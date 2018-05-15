package baseOOP;
	class DemoS {
		private String name;
		private static int count;//所有对象共享此属性
		public DemoS() {
			count ++;			//若有调用无参构造count就会自增
			this.name = "ZY-" + this.count;
		}
		public DemoS(String name) {
			this.name = name;
		}
		public String getName() {
			return this.name;
		}
	}
public class StaticDemo2 {
	public static void main (String args[]) {
		System.out.println(new DemoS().getName());
		System.out.println(new DemoS("demo1").getName());
		System.out.println(new DemoS().getName());
		System.out.println(new DemoS("demo2").getName());
		System.out.println(new DemoS().getName());
		System.out.println(new DemoS("demo3").getName());
		
	}
}

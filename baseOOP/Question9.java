package baseOOP;
/*声明一个图书类
数据成员为：书名、编号（利用静态成员自动实现编号）、书价，并拥有静态数据成员册数
记录图书的总数，在构造方法中利用此静态变量为对象的编号赋值、在主方法中定义对象
数组、并求出总册数*/
class Bookk {
	private String bookName;
	private int ID;
	private double price;
	static private int count = 0;
	public Bookk(String bookName, int ID, double price) {
		super();
		count += 1;
		this.bookName = bookName;
		this.ID = ID;
		this.price = price;
	}
		public static int getCount() {
		return count;
	}
		@Override
	public String toString() {
		return "Bookk [bookName=" + bookName + ", ID=" + ID + ", price=" + price + "]";
	}

	
}
public class Question9 {

	public static void main(String[] args) {
		Bookk[] bb = new Bookk[100];
		bb[0] = new Bookk("think in java",1457,100.01);
		bb[1] = new Bookk("javascript",8546,45.6);
		System.out.println(bb[0].toString());
		System.out.println(bb[1].toString());
		System.out.println("一共有" + Bookk.getCount() + "本书");
	}

}

package highOOP;
//继承的应用
//定义一个整形的数组类，包含构造方法，增加数据及输出数据成员方法，并利用数组实现动态内存分配
//包含子类 1、排序类 实现排序。2、反转类 实现数据反向存放
class Array {										//定义父类  数组操作类
	private int temp[];
	private int foot;								//定义数组添加时的下表
	public Array(int len) {							//数组的长度时由外部决定的
		if(len > 0) {
			this.temp = new int[len];
		} else {
			this.temp = new int[1];					//确保数组至少开辟了一块空间
		}
	}
	
	public boolean add(int i) {						//判断数组是否已经满了
		if(this.foot < this.temp.length) {
			this.temp[foot] = i;					//没满继续添加
			foot ++;
			return true;
		} else {
			return false;
		}
	}
	public int[] getArray() {
		return temp;
	}
}
class ReverseArray extends Array {					//定义子类	反转类
	public ReverseArray(int len) {					//调用父类构造方法
		super(len);
	}
	public int[] getArray() {
		int t[] = new int[super.getArray().length];	//获取父类中数组的长度
		int count = t.length - 1;
		for (int i =0; i < t.length; i++) {
			t[count] = super.getArray()[i];			//将数组反转
			count --;
		}
		return t;
	}
}
class SortArray extends Array{						//定义子类   排序类
	public SortArray(int len) {
		super(len);
	}
	public int[] getArray() {
		java.util.Arrays.sort(getArray());
		return super.getArray();
	}
}
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseArray ra = new ReverseArray(5);
		SortArray sa = new SortArray(5);
		ra.add(1);
		ra.add(2);
		ra.add(3);
		ra.add(9);
		System.out.println(ra.add(4));
		System.out.println(ra.add(5));				//添加失败
		print(ra.getArray());
		System.out.println("\n==============================");
		sa.add(1);
		sa.add(2);
		sa.add(3);
		sa.add(9);
		print(sa.getArray());
	}
	public static void print(int a[]) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "、");
		}
	}

}

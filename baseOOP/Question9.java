package baseOOP;
/*����һ��ͼ����
���ݳ�ԱΪ����������ţ����þ�̬��Ա�Զ�ʵ�ֱ�ţ�����ۣ���ӵ�о�̬���ݳ�Ա����
��¼ͼ����������ڹ��췽�������ô˾�̬����Ϊ����ı�Ÿ�ֵ�����������ж������
���顢������ܲ���*/
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
		System.out.println("һ����" + Bookk.getCount() + "����");
	}

}

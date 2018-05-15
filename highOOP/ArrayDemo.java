package highOOP;
//�̳е�Ӧ��
//����һ�����ε������࣬�������췽�����������ݼ�������ݳ�Ա����������������ʵ�ֶ�̬�ڴ����
//�������� 1�������� ʵ������2����ת�� ʵ�����ݷ�����
class Array {										//���常��  ���������
	private int temp[];
	private int foot;								//�����������ʱ���±�
	public Array(int len) {							//����ĳ���ʱ���ⲿ������
		if(len > 0) {
			this.temp = new int[len];
		} else {
			this.temp = new int[1];					//ȷ���������ٿ�����һ��ռ�
		}
	}
	
	public boolean add(int i) {						//�ж������Ƿ��Ѿ�����
		if(this.foot < this.temp.length) {
			this.temp[foot] = i;					//û���������
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
class ReverseArray extends Array {					//��������	��ת��
	public ReverseArray(int len) {					//���ø��๹�췽��
		super(len);
	}
	public int[] getArray() {
		int t[] = new int[super.getArray().length];	//��ȡ����������ĳ���
		int count = t.length - 1;
		for (int i =0; i < t.length; i++) {
			t[count] = super.getArray()[i];			//�����鷴ת
			count --;
		}
		return t;
	}
}
class SortArray extends Array{						//��������   ������
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
		System.out.println(ra.add(5));				//���ʧ��
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
			System.out.print(a[i] + "��");
		}
	}

}

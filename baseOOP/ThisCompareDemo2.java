package baseOOP;
class Car{
	private String brand;//brand�̱�
	private int price;
	public Car(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	public boolean compare(Car car) {
		Car c1 = this;
		Car c2 = car;
		//�ȱȽ���������ĵ�ַ�Ƿ���ͬ
		if(c1 == c2) {
			return true;
		}
		//�Ƚ����������е�����ֵ�Ƿ����
		if(c1.brand.equals(c2.brand) && c1.price == c2.price) {
			return true;
		}else {
			return false;
		}
	}
}
public class ThisCompareDemo2 {

	public static void main(String[] args) {
		Car car1 = new Car("BMW",200000);
		Car car2 = new Car("audi",150000);
		if(car1.compare(car2)) {
			System.out.println("��������һ����");
		}else {
			System.out.println("��������һ��");
		}
	}

}

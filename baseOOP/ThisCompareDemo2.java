package baseOOP;
class Car{
	private String brand;//brand商标
	private int price;
	public Car(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	public boolean compare(Car car) {
		Car c1 = this;
		Car c2 = car;
		//先比较两个对象的地址是否相同
		if(c1 == c2) {
			return true;
		}
		//比较两个对象中的属性值是否相等
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
			System.out.println("两个车是一样的");
		}else {
			System.out.println("两个车不一样");
		}
	}

}

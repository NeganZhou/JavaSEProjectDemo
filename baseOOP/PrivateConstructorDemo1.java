package baseOOP;
 class Singleton {
	 private static Singleton instance = new Singleton();
	 private Singleton() {
	 }
	 public void print() {
		 System.out.println("1111");
	 }
	 public static Singleton getInstance() {
		 return instance;
	 }
 }
public class PrivateConstructorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s = Singleton.getInstance();
		s.print();
	}

}

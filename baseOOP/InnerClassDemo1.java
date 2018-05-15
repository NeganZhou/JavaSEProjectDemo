package baseOOP;
class Outer {
	private String Info = "HelloWould";
	class Inter {
		public void print() {
			System.out.println(Info);
		}
	}

}
public class InnerClassDemo1 {
	public static void main(String args[]) {
		Outer out = new Outer();
		Outer.Inter in = out.new Inter(); 
		in.print();
	}
}

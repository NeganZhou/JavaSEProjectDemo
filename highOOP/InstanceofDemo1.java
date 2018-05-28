package highOOP;
/*在Java中可以使用instanceof关键字来判断一个对象到底是哪一个类的实例
				格式  			对象  instanceof 类   ——>返回boolean类型*/
class  Ins1{
	public void fun1() {
		System.out.println("In1类中的fun1方法");
	}
	public void fun2() {
		this.fun1();
	}
}
class Ins2 extends Ins1{
	public void fun1() {
		System.out.println("In2类中的fun1方法");
	}
	public void fun3() {
		System.out.println("In2类中的fun3方法");
	}
}
public class InstanceofDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ins1 ins1 = new Ins2();									//向上转型
		System.out.println("ins1 == Ins1" + (ins1 instanceof Ins1));
		System.out.println("ins1 == Ins2" + (ins1 instanceof Ins2));
		Ins1 ins = new Ins1();									//通过Ins1的构造方法来实例化Ins1类
		System.out.println("ins1 == Ins1" + (ins instanceof Ins1));
		System.out.println("ins1 == Ins2" + (ins instanceof Ins2));
//		从中可以发现，通过子类实例化的对象，同时都是父类和子类的实例，所以可以直接向上或者向下转型，但是通过父类实例话的对象，就不能向下转型了，因为父类不知道谁是
//		他的子类
		fun(new Ins2());
	}
	//使用instanceof在向下转型前进行验证
	public static void fun(Ins1 ins1) {
		if(ins1 instanceof Ins2) {
			Ins2 ins = (Ins2) ins1;			//向下转型
			ins.fun1();
		}
	}

}

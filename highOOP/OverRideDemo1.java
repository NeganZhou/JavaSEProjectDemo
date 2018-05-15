package highOOP;

/*方法的重写（覆写） 是指子类定义了与父类同名的方法（参数也完全相同），但是方法的重写要考虑权限
即子类重写了的方法权限一定不能比父类更严格*/
class Person1 {
	String name = "小黄";				//定义一个可重写的属性
	public void print() {
		System.out.println("Person1中的print方法");
	}
}

class Student1 extends Person1 {
	String name = "小绿";				//重写了父类中的属性
//	private void print() {
//		System.out.println("Student1中的print方法");
//	}  			错误的覆写方法 子类的方法权限比父类还要要严格
	public void print() {
		super.print();					//调用父类中的print方法
		System.out.println(super.name);//此处调用父类中的属性
		System.out.println("Student1中的print方法");
	}
}

public class OverRideDemo1 {
	public static void main(String[] args) {
		Student1 stu1 = new Student1();				
		stu1.print();					//此处执行被重写过的方法
		System.out.println(stu1.name); 	//此处调用了被重写过的属性
	}

}

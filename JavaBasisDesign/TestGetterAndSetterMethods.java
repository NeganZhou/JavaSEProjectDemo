package JavaBasisDesign;

class Demo{
	private int age = 20;
	public int getAge() {    
		return age;
	}
	/* 1、get方法只是简单的获取变量
	 * 2、如果调用它的话只是把变量的值传递出去，
	 * 他需要把获取的属性值传递出去所以不能带空返回值void方法
	 * 3、由于只是获取属性值作用所以不用带形参 
	 * */
	public void setAge(int a) {	
		age = a;
	}
	/* 1、set方法只是设置属性值 并没有传递它 所以是个空返回类型void
	 * 2、set方法要带上型参，以便从主函数里把实参传递过来
	 * 3.当类实例化以后 在调用setter方法属性值就会发生改变
	 * */
}

public class TestGetterAndSetterMethods {
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println("age=" + demo.getAge());
		int age = 21;
		demo.setAge(age);
		System.out.println("age=" + demo.getAge());
		
	}

}

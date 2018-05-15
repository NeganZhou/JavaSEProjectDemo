package baseOOP;
//对象数组
class Person5{
	private String name;
	public Person5(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
public class ObjectArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//动态初始化
		Person5 per5[] = new Person5[3];
		per5[0] = new Person5("张三");
		per5[1] = new Person5("李四");
		per5[2] = new Person5("王五");
		for(int i = 0; i < 3; i ++) {
			System.out.println("姓名：" + per5[i].getName());
		}
		//静态初始化
		Person5 per[] = {new Person5("张五"), new Person5("李三"), new Person5("王四")};
		for(int i = 0; i < 3; i ++) {
			System.out.println("姓名：" + per[i].getName());
		}
	}

}

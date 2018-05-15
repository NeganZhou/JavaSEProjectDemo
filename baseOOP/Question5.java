package baseOOP;
//定义一个用户的user类，类中的变量有用户名、口令和记录用户个数的变量，定义
//类的三个构造方法(无参构造、为用户名赋值、为用户名和口令赋值)、获取和设置口令
//的方法和返回类信息的方法
class User {
	private String username;
	private int password;
	private static int count;
	public User() {		//无参构造
		count ++;
	}
	public User(String username) {				//为用户名赋值
		count ++;
		this.username = username;
	}
	public User(String username,int password) {	//为用户名和口令赋值
		count ++;
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void print() {
		System.out.println("用户个数为" + count);
		System.out.println("User [username=" + username + ", password=" + password + "]");
	}
	
	
	
}
public class Question5 {
	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User("张三");
		User u3 = new User("李四",123456);
		u1.print();
		u2.print();
		u3.print();
	}

}

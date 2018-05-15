package baseOOP;
import java.util.Scanner;
public class LoginDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username;
		long password;
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入用户名");
		username = sca.next();
		System.out.println("请输入密码");
		password = sca.nextLong();
		if(username.equals("zhouyu") && password == 19961128) {
			System.out.println("欢迎光临");
		}else {
			System.out.println("账号或密码有误程序退出");
		}
		
	}

}

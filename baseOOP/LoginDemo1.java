package baseOOP;
import java.util.Scanner;
public class LoginDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username;
		long password;
		Scanner sca = new Scanner(System.in);
		System.out.println("�������û���");
		username = sca.next();
		System.out.println("����������");
		password = sca.nextLong();
		if(username.equals("zhouyu") && password == 19961128) {
			System.out.println("��ӭ����");
		}else {
			System.out.println("�˺Ż�������������˳�");
		}
		
	}

}

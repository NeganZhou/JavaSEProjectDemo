package baseOOP;
//����һ���û���user�࣬���еı������û���������ͼ�¼�û������ı���������
//����������췽��(�޲ι��졢Ϊ�û�����ֵ��Ϊ�û����Ϳ��ֵ)����ȡ�����ÿ���
//�ķ����ͷ�������Ϣ�ķ���
class User {
	private String username;
	private int password;
	private static int count;
	public User() {		//�޲ι���
		count ++;
	}
	public User(String username) {				//Ϊ�û�����ֵ
		count ++;
		this.username = username;
	}
	public User(String username,int password) {	//Ϊ�û����Ϳ��ֵ
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
		System.out.println("�û�����Ϊ" + count);
		System.out.println("User [username=" + username + ", password=" + password + "]");
	}
	
	
	
}
public class Question5 {
	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User("����");
		User u3 = new User("����",123456);
		u1.print();
		u2.print();
		u3.print();
	}

}

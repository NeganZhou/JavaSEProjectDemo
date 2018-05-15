package baseOOP;
class Check{
	public boolean compare(String username, String password) {
		if(username.equals("zhouyu") && password.equals("19961128")) {
			return true;
		} else {
			return false;
		}
	}
}
class Operate{
	private String info[];
	public Operate(String info[]) {
		this.info = info;
	}
	public String login() {
		Check check = new Check();
		String name = this.info[0];
		String password = this.info[1];
		String str = null;
		if(check.compare(name,password)) {
			str = "欢迎" + name + "光临";
		} else {
			str = "您输入的信息有误";
		}
		return str;
	}
}
public class LoginDemo2 {

	public static void main(String[] args) {
		String info[] = {"zhouyu","19961128"};
		Operate oper = new Operate(info);
		System.out.println(oper.login());
	}

}

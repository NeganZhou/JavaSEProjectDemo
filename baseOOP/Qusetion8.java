package baseOOP;
/*构造一个银行账户类
数据成员的账户名称、用的账户余额
方法
开户(设置账户名称和余额)，利用构造方法完成
查询余额*/
class Account{
	private String accountName;
	private double accountBalance;
	public Account(String accountName, double accountBalance) {
		super();
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	
}
public class Qusetion8 {

	public static void main(String[] args) {
		Account a1 = new Account("Negan",50000000.01);
		System.out.println(a1.getAccountBalance());
	}

}

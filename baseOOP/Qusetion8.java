package baseOOP;
/*����һ�������˻���
���ݳ�Ա���˻����ơ��õ��˻����
����
����(�����˻����ƺ����)�����ù��췽�����
��ѯ���*/
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

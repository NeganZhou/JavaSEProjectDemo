package baseOOP;
//ͳ�Ƴ��ַ��� ��want you to konw one thing�� ��ĸn����ĸo�ĳ��ִ���
public class Question {
	 static int  countN = 0, countO = 0;
	//��indexof()�����ǵó��ַ����ڵ�������
	//�������Ǵ�0��ʼ�ġ�1...2...3...4...һֱ��length-1
	public static void fun(char a[]) {
		for (int i = 0; i < a.length; i++) {
			if(a[i] == 'n') {
				countN += 1;
			}else if(a[i] == 'o') {
				countO += 1;
			}
		}
	}
	public static void main(String[] args) {
		String str = "want you to konw one thing";
		char c[] = str.toCharArray();
		fun(c);
		System.out.println("n�У�" + countN + "����o�У�" + countO + "��");
	}

}

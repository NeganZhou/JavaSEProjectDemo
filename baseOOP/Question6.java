package baseOOP;

//1�����ַ�����Java����ѧϰ20180505������ȡ����
//2������NeganJava���ַ����еġ�Java���滻�ɡ�J2EE��
//3��ȡ����Java����ѧϰ20180505���ڰ˸��ַ�
//4�������Java����ѧϰ20180505���е�����0
//5���Ӹ��������֤��������ȡ���˵�������� 
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java����ѧϰ20180505";
		char c1[] = str.toCharArray();
		String str1 = new String(c1, 8, 8);// ��ȡ���ַ�����c�е�8����ʼ ����8��
		System.out.println("���ַ�����Java����ѧϰ20180505������ȡ����Ϊ" + str1);
		
		String str2 = "NeganJava";
		String str3 = str2.replaceAll("Java", "J2EE");
		System.out.println("����NeganJava���ַ����еġ�Java���滻�ɡ�J2EE��" + str3);
		
		String str4 = new String(c1, 8, 1);
		System.out.println("���ַ�����Java����ѧϰ20180505������ȡ�ڰ˸��ַ�Ϊ" + str4);
		
		System.out.println("�����Java����ѧϰ20180505���е�����0");
		for(int i = 0; i < c1.length; i ++) {
			if(c1[i] != '0') {  //�ַ���'0'������������������������
				System.out.print(c1[i]);
			}
		}
		
		String str5 = "37088219961128041";
		char c2[] = str5.toCharArray();
		String str6 = new String(c2,6,4);
		String str7 = new String(c2,10,2);
		String str8 = new String(c2,12,2);
		System.out.println("�Ӹ��������֤��������ȡ���˵��������   " + str6 + "��" + str7 + "��" + str8+ "��");
	}

}

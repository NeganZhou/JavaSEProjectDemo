package baseOOP;
//�ڶ���Stringʱ��ͷ����ĸ��Ҫ��д�����Ա���Ҳ��һ���౾��

public class StringDemo {
	public static void main(String args[]) {
		// ����String�ɲ���ֱ�Ӹ�ֵ�ĵķ���
		String name1 = "zhouyu";
		System.out.println(name1);
		// ֱ�ӵ���String�еĹ��췽��
		String name2 = new String("wuxue");
		System.out.println(name2);
		// String���͵ıȽ�
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = str2;
		System.out.println("str1 == str2 = " + (str1 == str2));
		System.out.println("str3 == str1 = " + (str3 == str1));
		System.out.println("str2 == str3 = " + (str2 == str3));
		// ��ȻString������ݶ�ʱһ���ĵ��ǱȽϵĽ������ͬ
		// �����Ϳ�������ķ��� == �ǽ��е�ַ�Ƚϵ�

		System.out.println("+++++++++++++++++++++++++++++++++");

		// public boolean equals(String str)
		// ʹ��equals������String���ݽ��бȽ�
		System.out.println("str1 equals str2 = " + (str1.equals(str2)));
		System.out.println("str3 equals str1 = " + (str3.equals(str1)));
		System.out.println("str2 equals str3 = " + (str2.equals(str3)));
		// ��Ϊequals�����ǽ������ݱȽϣ����Է��صĽ������true

		// String ����ʵ������ʽ������
		// ��ʵһ���ַ�������String���һ����������������������Ѿ������˶ѿռ䲢����ֱ��ʹ�õĶ���
		System.out.println("Hello equals Hello = " + ("Hello".equals("Hello")));
		// �ַ���ֱ�ӵ�����String���еķ���

		String str4 = "hello";
		String str5 = "hello";
		String str6 = "hello";
		System.out.println("str4 == str5 = " + (str4 == str5));
		System.out.println("str6 == str4 = " + (str6 == str4));
		System.out.println("str5 == str6 = " + (str5 == str6));
		// ���һ���ַ�����һ�����������ã����Ժ�������ͬ���ַ�������ʱ���Ͳ�������
		// ���ٿռ䣬������ʹ���Ѿ����ٺõĶѿռ� ����ͬ��'
		
		
		/*����String�����ϲ�������java�г�Ϊ������ƣ�������Ƶ�˼·�ǣ���java
		 * ���γ�һ������أ������������б����������µ�ʵ�������������ڶ�
		 * ������Ѿ����壬�Ͳ������¶��壬���ڳ���ȡ��ֱ��ʹ��*/
	}
}

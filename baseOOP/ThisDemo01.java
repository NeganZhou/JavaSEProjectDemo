package baseOOP;

//this�ؼ���
/*
1����ʾ�����е�����
2��������this���ñ����еĹ��췽��constructor
3��this��ʾ��ǰ����  ����Ҫ*/
class ThisPerson1 {
//ʹ��this��ʾ��ǰ����
	private String name;
	private int age;
	
//	public ThisPerson() { //����һ���޲ι��췽��
//		System.out.println("ʹ��this();���ù��췽������");
//	}
	public String getInfo () {
		System.out.println("�����е�this------>" + this);
		//�Ǹ���������˴˷��� ���this�ͱ�ʾ�ĸ�����
		return null ;
	}
	
//	public ThisPerson(String name, int age) {
//		this();//ʹ��this�����ù��췽��
//		//���췽�������ȱ����õ� ����this();���õĹ��췽������Ҳֻ�ܷ��ڹ��췽��������
//		//��main����ʵ����ʱ�ǵ��õ��вι��췽�� ����ʹ���вι��췽�������޲ι��췽��
//		this.name = name; //ͨ�����췽���е�name�β�Ϊname���Դ�ֵ
//		this.age = age;  //ͬ�����췽���е�age�β�Ϊage���Դ�ֵ
//	}
	//ע�� ��ʹ��this();�����ù��췽��ʱһ��Ҫ��һ�����췽����Ϊ���ڣ����������ھͻ�ݹ���ù��췽����
	public String Info() {
		return "������" + this.name + ",���䣺" + age;
	}
	
}

public class ThisDemo01 {

	public static void main(String[] args) {
//	ThisPerson tp = new ThisPerson("����", 22);
//	System.out.println(tp.Info());
//	System.out.println("++++++++++++++++++++++++++");
	ThisPerson1 tp1 = new ThisPerson1();
	ThisPerson1 tp2 = new ThisPerson1();
	System.out.println("tp1---->" + tp1);
	tp1.getInfo();
	System.out.println("tp1---->" + tp2);
	tp2.getInfo();
	}

}

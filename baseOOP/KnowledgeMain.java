package baseOOP;
//public�� ��ʾ�˷������Ա��ⲿ�����
//static����ʾ�˷�������ֱ������������
//void���������ǳ������㲻��Ҫ�κεķ���ֵ
//main��ϵͳ�涨�õ�Ĭ�Ϸ��������ƣ�ִ��ʱĬ���ҵ�main����������
//String args[]����ʾ��������ʱ���ݵĲ���
public class KnowledgeMain {
//�ڱ����ʱ���������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 3) {
			System.out.println("����Ĳ����������������˳�");
			System.exit(1);
		}
		for(int x = 0; x < args.length; x++) {
			System.out.println("��" + (x  + 1) + "������" + args[x]);
		}
	}

}

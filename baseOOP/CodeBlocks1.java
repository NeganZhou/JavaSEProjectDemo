package baseOOP;

//��{}�������Ľд����
//������Ϊ  1����ͨ����� 2�������3����̬����� 4��ͬ�������  
class CBDemo {
	// ��������
	{
		System.out.println("�����");
	}
	static {
		System.out.println("��̬�����");
	}

	public CBDemo() {
		System.out.println("���췽��");
	}
}

public class CodeBlocks1 {
	static {
		System.out.println("�������еľ�̬�����");
	}

	public static void main(String[] args) {
		// ��ͨ�����
		{
			System.out.println("��ͨ�����֮��");
		}

		System.out.println("�����֮��");
		new CBDemo();
	}

}

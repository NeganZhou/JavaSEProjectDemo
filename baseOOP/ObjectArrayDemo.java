package baseOOP;
//��������
class Person5{
	private String name;
	public Person5(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
public class ObjectArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��̬��ʼ��
		Person5 per5[] = new Person5[3];
		per5[0] = new Person5("����");
		per5[1] = new Person5("����");
		per5[2] = new Person5("����");
		for(int i = 0; i < 3; i ++) {
			System.out.println("������" + per5[i].getName());
		}
		//��̬��ʼ��
		Person5 per[] = {new Person5("����"), new Person5("����"), new Person5("����")};
		for(int i = 0; i < 3; i ++) {
			System.out.println("������" + per[i].getName());
		}
	}

}

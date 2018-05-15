package baseOOP;

/*
	��������������뱻���еĶ���������뽫������Ϊstatic���ԣ�����һ�����Ա�static
�ؼ�������֮�󣬿���ֱ��ʹ���������е��á����һ�����еķ������������ã������������
static����
*/
class Person4{
	private String name;
	private int age;
	private static String city = "A��";
	public Person4(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public static void setCity(String c) {//��static���������Կ��Ե���static����������
		city = c;
	}
	
	public static String getCity() {//��static���������Կ��Ե���static����������
		return city;
	}
	public String Info() {
		return "������"  + this.name + "�����䣺" + this.age + ",����:" + this.city; 
	}
}
public class StaticDemo1 {
	// ����ڳ�����ʹ��static�������ԣ�������Գ�Ϊȫ������/��̬����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person4 per1 = new Person4("����",20);
		Person4 per2 = new Person4("����",22);
		Person4 per3 = new Person4("����",30);
		System.out.println(per1.Info());
		System.out.println(per2.Info());
		System.out.println(per3.Info());
		per1.setCity("B��");  
		System.out.println("==========�޸ĺ�=============");
		System.out.println(per1.Info());
		System.out.println(per2.Info());
		System.out.println(per3.Info());
		//����ֻ���޸���һ�������е����Ե������ж����еĳ������Է����˱仯
		//˵����static���������ж������
		Person4.setCity("c��");  //ȥ��privat�Ժ��������������
		System.out.println("==========�޸ĺ�=============");
		System.out.println(per1.Info());
		System.out.println(per2.Info());
		System.out.println(per3.Info());
	}

}

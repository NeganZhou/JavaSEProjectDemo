package baseOOP;
//��дһ��Address�࣬��ַ�ɹ��ҡ�ʡ�ݡ����С��ֵ����ʱࡢ��ɣ������Է��������ĵ�ַ��Ϣ
class Address{
	String country = "china";
	String province = "shandong";
	String city = "yanzhou";
	String street = "longqiao";
	int postcode = 272100;
	public String fun() {
		return "country:" + country + "\tprovince:" + province + "\tcity:" + city + "\tstreet:" + street + "\tpostcode��" + postcode;
	}
}
public class Question1 {
	
	public static void main(String[] args) {
		//��ֻ���ö�����úߺ�
		Address a = new Address();
		System.out.println(a.fun());

	}

}

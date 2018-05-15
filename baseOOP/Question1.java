package baseOOP;
//编写一个Address类，地址由国家、省份、城市、街道、邮编、组成，并可以返回完整的地址信息
class Address{
	String country = "china";
	String province = "shandong";
	String city = "yanzhou";
	String street = "longqiao";
	int postcode = 272100;
	public String fun() {
		return "country:" + country + "\tprovince:" + province + "\tcity:" + city + "\tstreet:" + street + "\tpostcode：" + postcode;
	}
}
public class Question1 {
	
	public static void main(String[] args) {
		//类只能用对象调用哼哼
		Address a = new Address();
		System.out.println(a.fun());

	}

}

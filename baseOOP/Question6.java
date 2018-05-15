package baseOOP;

//1、从字符串“Java技术学习20180505”中提取日期
//2、将“NeganJava”字符串中的“Java”替换成“J2EE”
//3、取出“Java技术学习20180505”第八个字符
//4、清除“Java技术学习20180505”中的所有0
//5、从给定的身份证号码中提取此人的身份日期 
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java技术学习20180505";
		char c1[] = str.toCharArray();
		String str1 = new String(c1, 8, 8);// 提取从字符数组c中第8个开始 到第8个
		System.out.println("从字符串“Java技术学习20180505”中提取日期为" + str1);
		
		String str2 = "NeganJava";
		String str3 = str2.replaceAll("Java", "J2EE");
		System.out.println("将“NeganJava”字符串中的“Java”替换成“J2EE”" + str3);
		
		String str4 = new String(c1, 8, 1);
		System.out.println("从字符串“Java技术学习20180505”中提取第八个字符为" + str4);
		
		System.out.println("清除“Java技术学习20180505”中的所有0");
		for(int i = 0; i < c1.length; i ++) {
			if(c1[i] != '0') {  //字符串'0'。。。。。。。。。。。。
				System.out.print(c1[i]);
			}
		}
		
		String str5 = "37088219961128041";
		char c2[] = str5.toCharArray();
		String str6 = new String(c2,6,4);
		String str7 = new String(c2,10,2);
		String str8 = new String(c2,12,2);
		System.out.println("从给定的身份证号码中提取此人的身份日期   " + str6 + "年" + str7 + "月" + str8+ "日");
	}

}

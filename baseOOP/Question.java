package baseOOP;
//统计出字符串 “want you to konw one thing” 字母n和字母o的出现次数
public class Question {
	 static int  countN = 0, countO = 0;
	//而indexof()方法是得出字符所在的索引的
	//而索引是从0开始的…1...2...3...4...一直到length-1
	public static void fun(char a[]) {
		for (int i = 0; i < a.length; i++) {
			if(a[i] == 'n') {
				countN += 1;
			}else if(a[i] == 'o') {
				countO += 1;
			}
		}
	}
	public static void main(String[] args) {
		String str = "want you to konw one thing";
		char c[] = str.toCharArray();
		fun(c);
		System.out.println("n有：" + countN + "个、o有：" + countO + "个");
	}

}

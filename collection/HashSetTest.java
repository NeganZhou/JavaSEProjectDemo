package collection;

import java.util.HashSet;
import java.util.Random;

/**
 * 1、获取1到20之间的随机数
 * 2、随机获取其中10个元素
 * 3、不可以重复
 * @author Negan
 */
public class HashSetTest {

	public static void main(String[] args) {
		//生成随机数用random类
		Random ra = new Random();
		//存放生成结果使用hashSet 因为hashSet比LinkedHashSet性能更佳而且也更符合题意
		HashSet<Integer> hs = new HashSet<Integer>();
		//使用while循环来生成10个随机数
		while(hs.size() < 10) {
			//向HashSet里添加元素 因为是从0开始的所以每次要加一
			hs.add(ra.nextInt(20) + 1);
		}
		System.out.println(hs);
	}
}

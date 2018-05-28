package collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * 从键盘获取一串字符 然后去掉重复元素 最后原样输出
 * @author Negan
 *
 */
public class LinkedHashSetTest {

	public static void main(String[] args) {
		//接受一个字符串
		System.out.println("请输入一个字符串");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//要把字符串转成字符方便操作
		char arr[] = str.toCharArray();
		//System.out.println(Arrays.toString(arr));
		
		
		//声明一个可以去除重复元素的容器 就是LInkedHashSet
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		for(int i = 0; i < arr.length; i++) {
			//吧每一个字符数组中的元素存入集合当中
			lhs.add(arr[i]);
		}
		System.out.println(lhs);
	}

}

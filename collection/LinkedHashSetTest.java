package collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * �Ӽ��̻�ȡһ���ַ� Ȼ��ȥ���ظ�Ԫ�� ���ԭ�����
 * @author Negan
 *
 */
public class LinkedHashSetTest {

	public static void main(String[] args) {
		//����һ���ַ���
		System.out.println("������һ���ַ���");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//Ҫ���ַ���ת���ַ��������
		char arr[] = str.toCharArray();
		//System.out.println(Arrays.toString(arr));
		
		
		//����һ������ȥ���ظ�Ԫ�ص����� ����LInkedHashSet
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		for(int i = 0; i < arr.length; i++) {
			//��ÿһ���ַ������е�Ԫ�ش��뼯�ϵ���
			lhs.add(arr[i]);
		}
		System.out.println(lhs);
	}

}

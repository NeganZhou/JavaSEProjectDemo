package collection;

import java.util.HashSet;
import java.util.Random;

/**
 * 1����ȡ1��20֮��������
 * 2�������ȡ����10��Ԫ��
 * 3���������ظ�
 * @author Negan
 */
public class HashSetTest {

	public static void main(String[] args) {
		//�����������random��
		Random ra = new Random();
		//������ɽ��ʹ��hashSet ��ΪhashSet��LinkedHashSet���ܸ��Ѷ���Ҳ����������
		HashSet<Integer> hs = new HashSet<Integer>();
		//ʹ��whileѭ��������10�������
		while(hs.size() < 10) {
			//��HashSet�����Ԫ�� ��Ϊ�Ǵ�0��ʼ������ÿ��Ҫ��һ
			hs.add(ra.nextInt(20) + 1);
		}
		System.out.println(hs);
	}
}

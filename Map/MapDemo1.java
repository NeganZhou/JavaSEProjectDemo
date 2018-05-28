package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * map������һ��ӳ���ϵ
 * map �������������� ����һ�����ϵ�Ԫ�ز������ظ���Ϊkey��Set�ӿڣ� ����һ����֮���Ӧ�ļ���
 * ���������Ԫ���ǿ����ظ��ĳ�Ϊvalue ��List�ӿڣ�
 * key-value������ʽ��Ϊ��ֵ�� �ֳ�Ϊentry
 * ÿһ��value���Ǹ�����key��  ��Ϊkey�����������mapҲ�������
 * @author Negan
 *
 */
public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//��map�����Ԫ�� ʹ��put��������
		map.put("����", 11);
		map.put("����", 12);
		map.put("����", 13);
		map.put("����", 14);
		map.put("Ǯ��", 15);
		map.put("���", 16);
		map.put("�����", 17);
		System.out.println(map);
		//ȡ��key��ֵ
		Set<String> keys = map.keySet();
		System.out.println(keys);
		//ȡ��value��ֵ
		Collection<Integer> values= map.values();
		System.out.println(values);
		
		
		
		
		//���ظ����һ��Ԫ�� ���������Ԫ�ص�ֵ
		map.put("����", 14);
		System.out.println(map);//�������Ϊ14��
		//ע�� ÿһ����Ӷ�����һ������ֵ ���ǵ�һ�����ĳ��Ԫ�� �ͻ᷵��null
		//�����ǵ�һ�����ĳ��Ԫ�� �ͻ�Ѹı�֮ǰ��ֵ���س���
		System.out.println("============================");
		//��ѯ���ȹ���
		System.out.println(map.size());
		
		//ѡ��ɾ������  ���Ը���key��Ԫ������������ֵ��
		map.remove("����");
		System.out.println(map);
		
		//���map���е�����key-value
		map.clear();
		System.out.println(map);
		//��ѯmap�е�Ԫ������
		System.out.println(map.size());
		
	}

}

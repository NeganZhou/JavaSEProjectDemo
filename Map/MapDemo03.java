package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo03 {

	public static void main(String[] args) {
		
		//ʹ��entrySet����Set����
		Map<String, Integer> mm = new HashMap<>();
		mm.put("����", 11);
		mm.put("����", 12);
		mm.put("����", 13);
		mm.put("����", 14);
		mm.put("Ǯ��", 15);
		mm.put("���", 16);
		mm.put("�����", 17);
		
		//��ȡ���е�entry����
		//entry�Ƕ�����map�е�һ���ӿ�
		Set<Map.Entry<String, Integer>> entrySet = mm.entrySet();
		
		Iterator<Entry<String, Integer>> ii = entrySet.iterator();
		while(ii.hasNext()) {
			//ȡ��ÿһ��entry����
			Entry<String, Integer> en = ii.next();
			//ȡ��entry�����е�key
			String key = en.getKey();
			//ȡ��entry�����ֵ
			Integer value = en.getValue();
			System.out.println(key + "=" + value);
		}
		System.out.println("====================================");
		for (Entry<String, Integer> entry : entrySet) {
			Integer i = entry.getValue();
			String s = entry.getKey();
			System.out.println(s + "=" + i);
		}
		
	}

}

package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo03 {

	public static void main(String[] args) {
		
		//使用entrySet遍历Set集合
		Map<String, Integer> mm = new HashMap<>();
		mm.put("张三", 11);
		mm.put("李四", 12);
		mm.put("王五", 13);
		mm.put("赵六", 14);
		mm.put("钱七", 15);
		mm.put("李八", 16);
		mm.put("公孙九", 17);
		
		//获取所有的entry对象
		//entry是定义在map中的一个接口
		Set<Map.Entry<String, Integer>> entrySet = mm.entrySet();
		
		Iterator<Entry<String, Integer>> ii = entrySet.iterator();
		while(ii.hasNext()) {
			//取出每一个entry对象
			Entry<String, Integer> en = ii.next();
			//取出entry对象中的key
			String key = en.getKey();
			//取出entry对象的值
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

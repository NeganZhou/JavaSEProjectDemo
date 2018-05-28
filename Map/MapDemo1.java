package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * map集合是一组映射关系
 * map 当中有两个集合 其中一个集合的元素不可以重复称为key（Set接口） 还有一个与之相对应的集合
 * 但是里面的元素是可以重复的称为value （List接口）
 * key-value这种形式称为键值对 又称为entry
 * 每一个value都是跟随着key的  因为key是无序的所以map也是无序的
 * @author Negan
 *
 */
public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//向map中添加元素 使用put（）方法
		map.put("张三", 11);
		map.put("李四", 12);
		map.put("王五", 13);
		map.put("赵六", 14);
		map.put("钱七", 15);
		map.put("李八", 16);
		map.put("公孙九", 17);
		System.out.println(map);
		//取出key的值
		Set<String> keys = map.keySet();
		System.out.println(keys);
		//取出value的值
		Collection<Integer> values= map.values();
		System.out.println(values);
		
		
		
		
		//若重复添加一个元素 则会更新这个元素的值
		map.put("张三", 14);
		System.out.println(map);//张三变更为14岁
		//注意 每一次添加都会有一个返回值 若是第一次添加某个元素 就会返回null
		//若不是第一次添加某个元素 就会把改变之前的值返回出来
		System.out.println("============================");
		//查询长度功能
		System.out.println(map.size());
		
		//选择删除功能  可以根据key的元素来把整个键值对
		map.remove("张三");
		System.out.println(map);
		
		//清空map当中的所有key-value
		map.clear();
		System.out.println(map);
		//查询map中的元素数量
		System.out.println(map.size());
		
	}

}

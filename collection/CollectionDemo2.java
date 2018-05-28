package collection;

import java.util.ArrayList;
import java.util.Collection;

/*��������
1���ȰѼ���ת������  ��������  ���϶���ʹ��toArray�������� Ȼ���ٸ�object ��*/
class Dog{
	private String name;

	public String getName() {
		return name;
	}
	public Dog(String name) {
		this.name = name;
	}
}

public class CollectionDemo2 {

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		Object o1[] = c1.toArray();
		for (int i = 0; i < o1.length; i++) {
			System.out.println(o1[i]);
		}
		Collection c2 = new ArrayList();
		c2.add(new Dog("xiangqiang"));
		c2.add(new Dog("wangcai"));
		c2.add(new Dog("xiaowangba"));
		
		Object o2[] = c2.toArray();
		for (int i = 0; i < o2.length; i++){
			
			Dog d1 = (Dog)o2[i];				//����ת��
			
			
			System.out.println(d1.getName());
		}
		
		System.out.println("================================================");
		
		Collection c3 = new ArrayList();
		c3.add("a");
		c3.add("b");
		c3.add("c");
		c3.add("d");
		
		Collection c4 = new ArrayList();
		c4.add("a");
		c4.add("c");
		c4.add("d");
		c3.add("e");
		c3.add("f");
		//����һ�����϶�����˵�����ܰ������Ԫ�أ� add������������Ӷ���addAll�����ǰ������Ԫ�غϲ���һ�����϶�����
//		c3.add(c4);
//		System.out.println(c3);//�˴��ǰ�c4��������˽���
		
//		c3.addAll(c4);			
//		System.out.println(c3);//�˴��ǰ�c4����ϲ��˽���
		
		
//		c3.removeAll(c4);
//		System.out.println(c3);//��c3�к�c4����ͬ��Ԫ�ؽ���ɾ��
		
//		boolean b1 = c3.contains(c4);
//	
//		System.out.println(c3);		//�жϵ��ü���c3�Ƿ���ȫ���������õļ���c4 ��ȫ����������ture��û�а�������false
//		System.out.println(b1);		//�����δӵ��Ԫ��
//		
		boolean b2 = c3.retainAll(c4);//ȡ���������ѽ����Ľ�����ظ������� 
		System.out.println(c3);			//�����ö������ı䷵��true ��û�з����ı䷵��false
		System.out.println(b2);
	}

}

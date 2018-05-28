package collection;

import java.util.HashSet;
import java.util.Set;
class man {
	String name;
	int age;
	public man(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		man other = (man) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "man [name=" + name + ", age=" + age + "]";
	}
	
}
public class SetDemo1 {

	public static void main(String[] args) {
		//��Listһ��Set�ӿڲ�����ֱ��ʵ���� ��Ҫʹ��HashSet����TreeSet���������ת��ʵ����
		//Set��������� �����ǲ����ظ���
		
		
		
		
		

		//��Ҫ��Set���Զ��������ȥ�� ��Ϊ����Ƚϵ��ǵ�ַ ÿ�δ���һ�������ַ���᲻ͬ��ʹ��������ͬ��
		//�������List�ӿ��е�ȥ��������ͬ�����ĸ���equals�����ǲ����Ե�
		//����equals����
		//����hashset����
		Set<man> set = new HashSet<man>();
		set.add(new man("����", 22));
		set.add(new man("����", 22));
		set.add(new man("����", 20));
		set.add(new man("����", 20));
		set.add(new man("����", 23));
		System.out.println(set);
	}

}

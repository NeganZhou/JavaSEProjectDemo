package baseOOP;

class People {
	private Books books;
	
	private People child;
	private String name;
	private int age;
	private String role; // ��ɫ

	public People(String name, int age, String role) {
		this.name = name;
		this.age = age;
		this.role = role;
	}

	public void setBooks(Books b) {
		this.books = b;
	}

	public void setPeople(People c) {
		this.child = c;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void setAge(int a) {
		this.age = a;
	}
	
	public void setRole(String r) {
		this.role = r;
	}
	
	public Books getBooks() {
		return books;
	}
	
	public People getChild() {
		return child;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getRole() {
		return role;
	}
	public String getInfo() {
		return "->����:" + this.name + ",���䣺" + this.age + ",��ɫ��" + this.role;
	}
	
}

class Books {
	private People people;
	private People child;
	private String name;
	private int price;
	public Books (String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void setAdultPeople(People p) {
		this.people = p;
	}
	public void setChildPeople(People c) {
		this.child = c;
	}
	public void setName(String n) {
		this.name = n;
	}
	public void setPrice(int p) {
		this.price = p;
	}
	public People getAdultPeople() {
		return people;
	}
	public People getChildPeople() {
		return child;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getInfo() {
		return "->������" + this.name + ",�۸�" + this.price;
	}
	
	
}

public class RefExample2 {
	public static void main (String args[]) {
		People adult = new People("����", 30, "�ҳ�");
		People child = new People("����", 5, "����");
		Books book1 = new Books("Think in Java", 100);
		Books book2 = new Books("һǧ��һҹ", 50);
		adult.setBooks(book1);
		child.setBooks(book2);
		book1.setAdultPeople(adult);
		book2.setChildPeople(child);
		System.out.println("��������->" + adult.getInfo() + adult.getBooks().getInfo());
		System.out.println("��������->" + child.getInfo() + child.getBooks().getInfo());
		System.out.println("��������->" + book1.getInfo() + book1.getAdultPeople().getInfo());
		System.out.println("��������->" + book2.getInfo() + book2.getChildPeople().getInfo());
	}

}

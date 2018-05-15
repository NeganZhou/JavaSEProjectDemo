package baseOOP;

//һ������һ���飬һ��������һ����
//����һ��������࣬��Ҳ��һ���������
class Book {
	private Member member;
	private String name;
	private int price;
	public Book(String name,int price) {
		this.name = name;
		this.price = price;
	}
	public void setMember(Member m) {
		this.member = m;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int p) {
		this.price = p;
	}
	public Member getMember() {
		return member;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}

class Member {
	private Book book;
	private String name;
	private int age;
	private String gender;
	public Member(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void setBook(Book b) {
		this.book = b;
	}
	public void setName(String n) {
		this.name = n;
	}
	public void setAge(int a) {
		this.age = a;
	}
	public void setGender(String g) {
		this.gender = g;
	}
	public Book getBook() {
		return book;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
}

public class RefExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("Think in Java",100);
		Member member1 = new Member("Negan",22,"man");
		book1.setMember(member1);
		member1.setBook(book1);
		System.out.println("from book find person" + "\n������" + book1.getMember().getName() + "\n���䣺" + book1.getMember().getAge() + "\n�Ա�" + book1.getMember().getGender());//������
		System.out.println("from person find book" + "\n����" + member1.getBook().getName() + "\n�۸�" + member1.getBook().getPrice());
		
	}

}

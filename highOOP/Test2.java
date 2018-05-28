package highOOP;
//超人和人在谈生意

//要以人的姿态去谈
//有人坠楼了
//超人变身去救人
class Man{
	public void fun() {
		System.out.println("谈生意");
	}
}
class SuperMan extends Man{
	public void fly() {
		System.out.println("飞去救人");
	}
}
public class Test2 {
	public static void main(String[] args) {
		//SuperMan superMan = new SuperMan();
		//superMan.fun();		不应该用超人的姿态去谈生意 会把别人吓走的
		Man man = new SuperMan();
		man.fun();
		//突然有人坠楼了
		//变身
		SuperMan superMan = (SuperMan)man;
		superMan.fly();
	}
}

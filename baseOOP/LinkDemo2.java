package baseOOP;
//完整的单向链表的实现
class Link{					//把节点定义成内部类
	class Node{
		private String data;
		private Node next;
		public Node(String data) {
			this.data = data;
		}
		public void add(Node newNode) {		//这是建立节点用的
			if(this.next == null) {
				this.next = newNode;		//如果下一个节点为空就把新的节点设在next位置上
			} else {						//如果不为空就就表示还有下一个节点
				this.next.add(newNode);		//在下一个节点处增加
			}
		}
		public void print() {
			System.out.println(this.data + "\t");
			if(this.next != null) {			//若下一个节点不为空则继续打印
				this.next.print();			//输出下一个节点
			}
		}
		public boolean search(String data) {	//内部定义搜索方法
			if(data.equals(this.data)) {		//判断当前节点的名字是否与查找的一致
				return true;					//若一致fanhuitrue
			} else {							//继续找下一个
				if (this.next != null) {		//若下一个节点存在就递归调用此方法继续查找
					return next.search(data);	//返回查找的结果
				}else {							
					return false;				//节点不存在返回false
				}
			}
		}
		public void delete(Node previous, String data) {  //删除节点
			if(data.equals(this.data)) {				  //找到匹配的节点
				previous.next = this.next;				  //空出当前节点
			}else {											
				if(this.next != null) {						//继续向下找
					this.next.delete(this, data);
				}
			}
		}
	
	}
	private Node root;   //表示根节点       						
	public void addNode(String data) {					//给新的节点添加数据
		Node newNode = new Node(data);					//建立一个新的节点
		if(this.root == null) {							//没有根节点
			this.root = newNode;						//将第一个节点设置为根节点
		}else {											
			this.root.add(newNode);						//把数据添加到合适的位置
		}
	}
	public void printNode() { 						//打印全部的节点
		if(this.root != null) {
			this.root.print();
		}
	}
	public boolean contains(String name) {  			//判断元素是否存在
		return this.root.search(name);
	}
	public void deleteNode(String data) {				//删除节点
		if(this.contains(data)) {						//若节点存在则执行删除操作
			if(this.root.data.equals(data)) {			//判断根节点是否满足需求
				this.root = this.root.next;				//将根节点之后的内容设置成根节点
			}else {
				this.root.next.delete(root,data);		//删除节点
			}
		}
	}
}
public class LinkDemo2 {

	public static void main(String[] args) {
		Link l = new Link();
		l.addNode("A");
		l.addNode("B");
		l.addNode("C");
		l.addNode("D");
		l.addNode("E");
		System.out.println("删除之前===============================");
		l.printNode();
		l.deleteNode("A");
		l.deleteNode("D");
		System.out.println("删除之后===============================");
		l.printNode();
		System.out.println("查询节点：" + l.contains("A"));
		System.out.println("查询节点：" + l.contains("B"));
	}

}

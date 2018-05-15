package baseOOP;

//每一个节点除了要保存自己的内容外 还要保存下一个节点的内容
class Node {
	private String data;
	private Node node;
	public Node(String data) {
		this.data = data;
	}
	public void setNode(Node node) {//设置下一个节点
		this.node = node;
	}
	public String getData() {  		//得到节点内容
		return this.data;
	}
	public Node getNode() {   		//取得下一个节点
		return this.node;
	}
}public class LinkDemo1 {
	public static void main(String args[]) {
		Node n1 = new Node("train1");
		Node n2 = new Node("train2");
		Node n3 = new Node("train3");
		n1.setNode(n2);//这样就可以连起来了
		n2.setNode(n3);
		print(n1);
	}
	public static void print(Node node) {
		System.out.println(node.getData());
		if(node.getNode() != null) {
			print(node.getNode());
		}
	}
}

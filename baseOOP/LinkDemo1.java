package baseOOP;

//ÿһ���ڵ����Ҫ�����Լ��������� ��Ҫ������һ���ڵ������
class Node {
	private String data;
	private Node node;
	public Node(String data) {
		this.data = data;
	}
	public void setNode(Node node) {//������һ���ڵ�
		this.node = node;
	}
	public String getData() {  		//�õ��ڵ�����
		return this.data;
	}
	public Node getNode() {   		//ȡ����һ���ڵ�
		return this.node;
	}
}public class LinkDemo1 {
	public static void main(String args[]) {
		Node n1 = new Node("train1");
		Node n2 = new Node("train2");
		Node n3 = new Node("train3");
		n1.setNode(n2);//�����Ϳ�����������
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

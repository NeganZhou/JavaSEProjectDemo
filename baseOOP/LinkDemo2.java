package baseOOP;
//�����ĵ��������ʵ��
class Link{					//�ѽڵ㶨����ڲ���
	class Node{
		private String data;
		private Node next;
		public Node(String data) {
			this.data = data;
		}
		public void add(Node newNode) {		//���ǽ����ڵ��õ�
			if(this.next == null) {
				this.next = newNode;		//�����һ���ڵ�Ϊ�վͰ��µĽڵ�����nextλ����
			} else {						//�����Ϊ�վ;ͱ�ʾ������һ���ڵ�
				this.next.add(newNode);		//����һ���ڵ㴦����
			}
		}
		public void print() {
			System.out.println(this.data + "\t");
			if(this.next != null) {			//����һ���ڵ㲻Ϊ���������ӡ
				this.next.print();			//�����һ���ڵ�
			}
		}
		public boolean search(String data) {	//�ڲ�������������
			if(data.equals(this.data)) {		//�жϵ�ǰ�ڵ�������Ƿ�����ҵ�һ��
				return true;					//��һ��fanhuitrue
			} else {							//��������һ��
				if (this.next != null) {		//����һ���ڵ���ھ͵ݹ���ô˷�����������
					return next.search(data);	//���ز��ҵĽ��
				}else {							
					return false;				//�ڵ㲻���ڷ���false
				}
			}
		}
		public void delete(Node previous, String data) {  //ɾ���ڵ�
			if(data.equals(this.data)) {				  //�ҵ�ƥ��Ľڵ�
				previous.next = this.next;				  //�ճ���ǰ�ڵ�
			}else {											
				if(this.next != null) {						//����������
					this.next.delete(this, data);
				}
			}
		}
	
	}
	private Node root;   //��ʾ���ڵ�       						
	public void addNode(String data) {					//���µĽڵ��������
		Node newNode = new Node(data);					//����һ���µĽڵ�
		if(this.root == null) {							//û�и��ڵ�
			this.root = newNode;						//����һ���ڵ�����Ϊ���ڵ�
		}else {											
			this.root.add(newNode);						//��������ӵ����ʵ�λ��
		}
	}
	public void printNode() { 						//��ӡȫ���Ľڵ�
		if(this.root != null) {
			this.root.print();
		}
	}
	public boolean contains(String name) {  			//�ж�Ԫ���Ƿ����
		return this.root.search(name);
	}
	public void deleteNode(String data) {				//ɾ���ڵ�
		if(this.contains(data)) {						//���ڵ������ִ��ɾ������
			if(this.root.data.equals(data)) {			//�жϸ��ڵ��Ƿ���������
				this.root = this.root.next;				//�����ڵ�֮����������óɸ��ڵ�
			}else {
				this.root.next.delete(root,data);		//ɾ���ڵ�
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
		System.out.println("ɾ��֮ǰ===============================");
		l.printNode();
		l.deleteNode("A");
		l.deleteNode("D");
		System.out.println("ɾ��֮��===============================");
		l.printNode();
		System.out.println("��ѯ�ڵ㣺" + l.contains("A"));
		System.out.println("��ѯ�ڵ㣺" + l.contains("B"));
	}

}

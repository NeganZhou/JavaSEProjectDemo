package collection;

import java.util.LinkedList;

class Stack{
	//1����ջ���ڼ��ϵ�������һ��Ԫ��
	//2����ջ���Ѽ����е����һ��Ԫ���Ƴ�
	LinkedList linkedList;	//����һ��LinkedList
	public Stack() {
		linkedList = new LinkedList(); //��LinkedList��ʼ��
	}
	void push(Object obj) {		//��ջ����
			linkedList.add(obj);
		}
	void pop() {
		linkedList.removeLast();
	}
	@Override
	public String toString() {
		return  linkedList.toString();
	}
	
}
public class LinkedListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		//��ջ
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);
		//��ջ
		stack.pop();
		System.out.println(stack);
	}

}

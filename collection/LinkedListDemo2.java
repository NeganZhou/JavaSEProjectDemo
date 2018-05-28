package collection;

import java.util.LinkedList;

class Stack{
	//1、入栈：在集合的最后添加一个元素
	//2、出栈：把集合中的最后一个元素移除
	LinkedList linkedList;	//定义一个LinkedList
	public Stack() {
		linkedList = new LinkedList(); //将LinkedList初始化
	}
	void push(Object obj) {		//入栈方法
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
		//入栈
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);
		//出栈
		stack.pop();
		System.out.println(stack);
	}

}

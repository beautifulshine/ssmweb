package com.li.fx.fx1;

public class LinkedStack<T> {
	private static class Node<U>{
		U item;
		Node<U> next;
		Node() {
			item = null;
			next = null;
		}
		Node (U item, Node<U> next){
			this.item = item;
			this.next = next;
		}
		
		boolean end(){
			return next == null && item == null;
		}
	}
	/**
	 *  end sentinel
	 */
	private Node<T> top = new Node<T>();
	
	/**
	 *  向栈里压入一个对象
	 * @param item
	 */
	public void push(T item){
		top = new Node<T>(item, top);
	}
	
	/**
	 *  弹出一个元素
	 * @return
	 */
	public T pop(){
		T result = top.item;
		if (!top.end()) {
			top = top.next;
		}
		return result;
	}
	
	public static void main(String[] args) {
		LinkedStack<String> linkedStack = new LinkedStack<>();
		for (String string : "java,c,c++,python,php".split(",")) {
			linkedStack.push(string);
		}
		String str;
		while ((str = linkedStack.pop()) != null) {
			System.out.println(str);
		}
	}
}

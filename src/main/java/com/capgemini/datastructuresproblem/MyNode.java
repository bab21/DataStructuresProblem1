package com.capgemini.datastructuresproblem;

public class MyNode<K> {
	private K key;
	private MyNode next;
	public MyNode(K key){
		this.key=key;
		this.next=null;
	}
	public MyNode getNext() {
		return this.next;
	}
	public void setNext(MyNode myNode) {
		this.next=myNode;
	}
}

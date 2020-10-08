package com.capgemini.datastructuresproblem;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;
	
	public MyLinkedList(){
		head=null;
		tail=null;
	}
	
	//UC2.....
	public void add (INode myNode) {
		if(this.tail==null)
			this.tail=myNode;
		if(this.head==null)
			this.head=myNode;
		else {
			INode tempNode=this.head;
			this.head=myNode;
			this.head.setNext(tempNode);
		}
	}
	
	//UC3....
	public void append(INode myNode) {
		if(this.tail==null)
			this.tail=myNode;
		if(this.head==null)
			this.head=myNode;
		else {
			this.tail.setNext(myNode);
			this.tail=myNode;
		}
		
	}
	
	//UC4.....
	public void insertAfter(INode myNode,INode newNode) {
		INode tempNode=myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	//UC5....
	public INode pop() {
		if(head==null)
			return null;
		INode tempNode=head;
		head=head.getNext();
		return tempNode;
	}
	
	//UC6 ......
	public INode popLast() {
		INode tempNode=head;
		while(tempNode.getNext()!=tail) {
			tempNode=tempNode.getNext();
		}
		INode lastNode=tail;
		this.tail = tempNode;
		tempNode.setNext(null);
		return lastNode;
	}
	
	//UC7.....
	public INode searchNodeWithKey(K key) {
		INode tempNode=head;
		while(tempNode !=null &&  tempNode.getKey()!=key) {
			tempNode=tempNode.getNext();
		}
		return tempNode;
	}
	
	//UC8.....
	public void insertAfterNodeWithKey(K givenKey,K newKey) {
		INode nodeWithGivenKey=this.searchNodeWithKey(givenKey);
		INode newNode=new MyNode(newKey);
		this.insertAfter(nodeWithGivenKey, newNode);
		
	}
	
	//UC9...
	public INode deleteNodeWithKey(K key) {
		INode iteratorNode=head;
		while(iteratorNode!=null && iteratorNode.getNext().getKey()!=key)
			iteratorNode=iteratorNode.getNext();
		
		INode deletedNode=iteratorNode.getNext();
		iteratorNode.setNext(deletedNode.getNext());
		deletedNode.setNext(null);
		return deletedNode;
	}
	
	//UC9....
	public int size() {
		int size=0;
		INode tempNode=head;
		while(tempNode!=null) {
			size++;
			tempNode=tempNode.getNext();
		}
		return size;	
	}
	
	public void printMyLinkedList() {
		StringBuffer myNodes=new StringBuffer("My Nodes....");
		INode tempNode=head;
		while(tempNode.getNext()!=null) {
			myNodes.append(tempNode.getKey()+"-->");
			tempNode=tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
		
	}
	
	
	
}


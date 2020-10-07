package com.capgemini.datastructuresproblem;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;
	
	public MyLinkedList(){
		head=null;
		tail=null;
	}
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


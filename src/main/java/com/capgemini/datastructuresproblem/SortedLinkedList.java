package com.capgemini.datastructuresproblem;

public class SortedLinkedList<K extends Comparable> {
	public INode<K> head;
	public INode<K> tail;
	
	public SortedLinkedList(){
		head=null;
		tail=null;
	}
	
	//UC10.....
	public void add (INode myNode) {
		if(this.tail==null)
			this.tail=myNode;
		if(this.head==null)
			this.head=myNode;
		else {
			if(myNode.getKey().compareTo(head.getKey())<0)
			{
				INode tempNode=this.head;
				this.head=myNode;
				this.head.setNext(tempNode);
			}
			else if(myNode.getKey().compareTo(tail.getKey())>0) {
				tail.setNext(myNode);
				tail=myNode;
			}
			else {
				INode iteratorNode=head;
				while(!(iteratorNode.getKey().compareTo(myNode.getKey())<0 && iteratorNode.getNext().getKey().compareTo(myNode.getKey())>=0)) {
					iteratorNode=iteratorNode.getNext();
				}
				
				INode tempNode=iteratorNode.getNext();
				iteratorNode.setNext(myNode);
				myNode.setNext(tempNode);
			
			}
				
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

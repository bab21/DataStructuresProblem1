package com.capgemini.datastructuresproblem;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedListTest {
	
	//UC2...
	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
		MyNode myFirstNode=new MyNode(70);
		MyNode mySecondNode=new MyNode(30);
		MyNode myThirdNode=new MyNode(56);
		
		MyLinkedList myLinkedList=new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		
		boolean result=myLinkedList.head.equals(myThirdNode)&&
					   myLinkedList.head.getNext().equals(mySecondNode)&&
					   myLinkedList.tail.equals(myFirstNode);
		
				
		assertTrue(result);
	}
	
	//UC3...
	@Test
	public void given3NumbersWhenAppendedToLinkedListShouldBeAddedToBack() {
		MyNode myFirstNode=new MyNode(56);
		MyNode mySecondNode=new MyNode(30);
		MyNode myThirdNode=new MyNode(70);
		
		MyLinkedList myLinkedList=new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		
		myLinkedList.printMyLinkedList();
		
		boolean result=myLinkedList.head.equals(myFirstNode)&&
					   myLinkedList.head.getNext().equals(mySecondNode)&&
					   myLinkedList.head.getNext().getNext().equals(myThirdNode)&&
					   myLinkedList.tail.equals(myThirdNode);
		
				
		assertTrue(result);
	}
	
	//UC4...
	@Test
	public void givenNewNodeToInsertAfterParticularNode() {
		MyNode myFirstNode=new MyNode(56);
		MyNode mySecondNode=new MyNode(70);
		
		MyNode newNode=new MyNode(30);
		
		MyLinkedList myLinkedList=new MyLinkedList();
		
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.insertAfter(myFirstNode, newNode);
		
        myLinkedList.printMyLinkedList();
		
		boolean result=myLinkedList.head.equals(myFirstNode)&&
					   myLinkedList.head.getNext().equals(newNode)&&
					   myLinkedList.head.getNext().getNext().equals(mySecondNode)&&
					   myLinkedList.tail.equals(mySecondNode);
		
				
		assertTrue(result);
	}
	

}

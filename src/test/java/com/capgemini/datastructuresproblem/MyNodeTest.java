package com.capgemini.datastructuresproblem;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyNodeTest {

	@Test
	public void given3NumbersWhenLinkedShouldPassLinkedListTest() {
		MyNode myFirstNode=new MyNode(56);
		MyNode mySecondNode=new MyNode(30);
		MyNode myThirdNode=new MyNode(70);
		
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		
		boolean result=myFirstNode.getNext().equals(mySecondNode)&&
					   mySecondNode.getNext().equals(myThirdNode);
		assertTrue(result);
	}

}

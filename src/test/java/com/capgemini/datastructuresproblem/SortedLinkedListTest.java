package com.capgemini.datastructuresproblem;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortedLinkedListTest {

	@Test
	public void given4NumbersWhenAddedToSortedLinkedListShouldBeInAscendingOrder() {
		SortedLinkedList<Integer> sortedLinkedList=new SortedLinkedList<>();
		MyNode myFirstNode=new MyNode(56);
		MyNode mySecondNode=new MyNode(30);
		MyNode myThirdNode=new MyNode(40);
		MyNode myFourthNode=new MyNode(70);
		
		sortedLinkedList.add(myFirstNode);
		sortedLinkedList.add(mySecondNode);
		sortedLinkedList.add(myThirdNode);
		sortedLinkedList.add(myFourthNode);
		
		sortedLinkedList.printMyLinkedList();
		boolean result=sortedLinkedList.head.getKey()==mySecondNode.getKey();
		assertTrue(result);
		
	}

}

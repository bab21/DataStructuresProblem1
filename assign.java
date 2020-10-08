//UC5
	@Test
	public void deleteFirstNodeRecheckTheLinkedListDeletedNodeShouldNotPresentAndHeadShouldBeNextNode() {
		MyNode myFirstNode=new MyNode(56);
		MyNode mySecondNode=new MyNode(30);
		MyNode myThirdNode=new MyNode(70);
		
		MyLinkedList myLinkedList=new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		
		INode returnedNode=myLinkedList.pop();
		System.out.println("After deleting first node");
		myLinkedList.printMyLinkedList();
		
		boolean result=myLinkedList.head.equals(mySecondNode)&&
					   myLinkedList.head.getNext().equals(myThirdNode)&&
					   returnedNode.equals(myFirstNode)&&
					   myLinkedList.tail.equals(myThirdNode);
	
			
		assertTrue(result);
	}
	
	public INode pop() {
		if(head==null)
			return null;
		INode tempNode=head;
		head=head.getNext();
		return tempNode;
	}
	
package com.career.ds;

public class Singly_Linked_List {
	//header node of the list
	ListNode head;
	
	//length of the list
	private int length;
	
	/**
	 * getters & setters for header node
	 */
	public ListNode getHead() {
		return head;
	}

	public void setHead(ListNode head) {
		this.head = head;
		length ++;
	}
	
	// constructor initializes length of the list
	public Singly_Linked_List(){
		length = 0;
	}
	
	/**
	 * Insert at the beginning of the list
	 * @param node
	 */
	
	public void insertAtBegin(ListNode node){
		// node->head
		node.setNext(head);
		// node becomes header node
		head = node;
		length++;
	}
	
	/**
	 * Insert at the end of the list
	 * @param node
	 */
	public void insertAtEnd(ListNode node){
		ListNode p,q;
		
		// P is the header hode
		p=head;
		
		//Traverse through the list until last node
		while((q=p.getNext()) != null){
			p=q;
			continue;
		}
		
		//Last node is reached and node is inserted just next to it
		p.setNext(node);
		length ++;
	}
	
	public void insertAtMiddle(int data, int position){
		
		ListNode temp = head;
		
		//Ignoring header node - starting from 2nd iteration 
		// Stops at the node just before the desired position
		for(int i=2;i<position;i++){
			temp = temp.getNext();
		}
		
		//New node is created with data
		ListNode newNode = new ListNode(data);
		// temp is [position-1] node
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		length ++;
	}

	/**
	 * Displays the whole list
	 */
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		
		if (head == null){
			return result.append("]").toString();
		}
		result.append(head.getData());
		
		ListNode temp = head.getNext();
		while (temp != null){
			result.append("->").append(temp.getData());
			temp = temp.getNext();
		}
		System.out.println("The length of the list is "+ length);
		return result.append("]").toString();
	}
}
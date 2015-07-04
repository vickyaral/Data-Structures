package com.career.ds;

public class SLL_EXE {

	public static void main(String args[]){
	
		Singly_Linked_List objList = new Singly_Linked_List();
		
		// creates a header node
		objList.setHead(new ListNode(5));
		
		//Insert a node at the beginning of the list
		objList.insertAtBegin(new ListNode(3));
		objList.insertAtBegin(new ListNode(1));
		
		//Insert a node at the beginning of the list
		objList.insertAtEnd(new ListNode(10));

		//Insert data at desired position
		objList.insertAtMiddle(8,4);
		objList.insertAtMiddle(6,4);
		objList.insertAtMiddle(12,7);
		
		objList.insertAtEnd( new ListNode(15));
		
		System.out.println(objList.toString());
		
	}
}

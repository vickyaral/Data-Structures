package com.career.ds;

/**
 * A single node data structure that has data and a pointer object
 * @author mkanthan
 *
 */
public class ListNode {
	private int data;
	private ListNode next;
	
	//Constructs a node with data 
	public ListNode(int data) {
		this.data = data;
	}
	
	/**
	 * Getters and Setters for node data
	 * @return
	 */
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	/**
	 * Getters and Setters for next pointer
	 * @return
	 */
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
}

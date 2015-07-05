package com.career.ds;

import java.util.Arrays;

public class Fixed_Length_Array_Queue {
	
	private int[] queueRep;
	private int size,front,rear;
	private final int CAPACITY = 16;
	
	public Fixed_Length_Array_Queue() {
		super();
		queueRep = new int[CAPACITY];
		size=0;front=0;size=0;
	}
	
	public void enQueue(int data){
		if (size == CAPACITY){
			throw new IllegalStateException("Queue is full: Overflow");
		}else{
			size ++;
			queueRep[rear++] = data;
			rear = rear % CAPACITY;
		}
	}
	
	public int deQueue(){
		if (size == 0){
			throw new IllegalStateException("Queue is emty: Underflow");
		}else{
			size --;
			int data = queueRep[front];
			queueRep[front] = Integer.MIN_VALUE;
			front ++;
			front = front % CAPACITY;
			return data;
		}
	}
	
	
	@Override
	public String toString() {
		
		System.out.println("Fixed_Length_Array_Queue [queueRep="
				+ Arrays.toString(queueRep) + ", size=" + size + ", front="
				+ front + ", rear=" + rear + ", CAPACITY=" + CAPACITY + "]"); 
		
		return "Fixed_Length_Array_Queue [queueRep="
				+ Arrays.toString(queueRep) + ", size=" + size + ", front="
				+ front + ", rear=" + rear + ", CAPACITY=" + CAPACITY + "]";
	}

	public static void main(String args[]){
		Fixed_Length_Array_Queue q = new Fixed_Length_Array_Queue();
		
		for(int i=0;i<=15;i++){
			q.enQueue(i+1);
		}
		
		for(int i=0;i<=15;i++){
			int data = q.deQueue();
			System.out.println("Deleted item "+data);
		}
		
		q.toString();
	}
	

}

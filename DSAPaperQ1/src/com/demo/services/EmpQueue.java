package com.demo.services;

import com.demo.beans.CustomNode;

public class EmpQueue {

	private CustomNode head;
	private CustomNode front;
	private CustomNode rear;
	
	
	public EmpQueue() {
		super();
		head=null;
		front=null;
		rear= null;
	}


//	public EmpQueue(CustomNode head, CustomNode front, CustomNode rear) {
//		super();
//		this.head = head;
//		this.front = front;
//		this.rear = rear;
//	}
	
	public void isEmpty()
	{
		if(head==null)
		{
			System.out.println(" ");
		}
	}
}

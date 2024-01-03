package com.demo.beans;

public class CustomNode {

	private Employee data;
	public CustomNode next;
	public CustomNode() {
		super();
		data=null;
		next=null;
	}
	public CustomNode(Employee data, CustomNode next) {
		super();
		this.data = data;
		this.next = next;
	}
	
	
	
	
}

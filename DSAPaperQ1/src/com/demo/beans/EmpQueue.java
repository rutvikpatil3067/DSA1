package com.demo.beans;

//create class empQueue..
public class EmpQueue {

	//class members..
	//private int[] arr;
	//private int size;
	private CustomNode head;
	private CustomNode front;
	private CustomNode rear;
	private CustomNode next;
	
	//default constructor..
	public EmpQueue() {
		super();
		//size=10;
		head=null;
		front=null;
		rear= null;
		next=null;
	}
	
	// to check employee data is available or not...
	public boolean isEmpty()
	  {
		
		if(head==null && front==null)
		{
			System.out.println(" there is no data of employees");
			return true;
		}
		return false;
	  }
	
	
  //for adding the employee...
	public void insertEmployee()
	{
		CustomNode newnode=new CustomNode();
		if(head==null)
		{
			System.out.println(" there is no data of employees");
			
		}
		else {
			newnode=head;
			head=newnode;
		}
	}
	
	//
	public void insertAtEnd()
	{
		CustomNode newnode = new CustomNode();
		
		if(head==null)
		{
			System.out.println(" there is no data of employees");
			
		}
		else 
		{
			CustomNode temp= head;
			while(temp.next!=null )
			{
				temp=temp.next;
				
			}
			temp.next=newnode;
		}
	}
	
	public boolean removeEmpbypos(int eid)
	{
		 int count=0;
		CustomNode temp=head;
		CustomNode Prev=head;
		if(head==null)
		{
			System.out.println(" there is no data of employees");
			return false;
		}
		
		while(count!=eid-1)
		{
			Prev=temp;
			temp=temp.next;
		}
		Prev.next=temp.next;
		temp=null;
		return true;
	}

	public void removeEmp() {
		// TODO Auto-generated method stub
		CustomNode temp=head;
		
		while()
		
	}

	public void display() {
		// TODO Auto-generated method stub
		for(i=o;i<)
	}
	
	
}

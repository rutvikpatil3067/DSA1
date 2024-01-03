package com.demo.beans;

import java.time.LocalDate;

public class Two_wheeler extends Vehicle
{

	private int dicky_capacity;

	public Two_wheeler(int v_id, String owner_name, LocalDate dom, String type, String s_name, String make,
			String model, int price, String status, int dicky_capacity) 
	{
		super(v_id, owner_name, dom, type, s_name, make, model, price, status);
		this.dicky_capacity = dicky_capacity;
	}
	
	
	
	

	public int getDicky_capacity() 
	{
		return dicky_capacity;
	}

	public void setDicky_capacity(int dicky_capacity) 
	{
		this.dicky_capacity = dicky_capacity;
	}





	@Override
	public String toString() {
		return super.toString()+"Two_wheeler [dicky_capacity=" + dicky_capacity + "]";
	}
	
	
	
	
	
	
	
	


	
	
}

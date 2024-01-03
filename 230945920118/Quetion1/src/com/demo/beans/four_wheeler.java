package com.demo.beans;

import java.time.LocalDate;

public class four_wheeler extends Vehicle 
{
	private String eng_type;
	private String gear_type;
	
	
	
	public four_wheeler(int v_id, String owner_name, LocalDate dom, String type, String s_name, String make,
			String model, int price, String status, String eng_type, String gear_type) 
	{
		super(v_id, owner_name, dom, type, s_name, make, model, price, status);
		this.eng_type = eng_type;
		this.gear_type = gear_type;
	}

	
	

	public String getEng_type() {
		return eng_type;
	}


	public void setEng_type(String eng_type) {
		this.eng_type = eng_type;
	}


	public String getGear_type() {
		return gear_type;
	}


	public void setGear_type(String gear_type) {
		this.gear_type = gear_type;
	}




	@Override
	public String toString()
	{
		return super.toString()+"four_wheeler [eng_type=" + eng_type + ", gear_type=" + gear_type + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}

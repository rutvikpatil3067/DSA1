package com.demo.dao;


import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Vehicle;

public class Vehicle_daoImpl implements Vehicle_Dao
{
	static Set<Vehicle> trs;
	static
	{
		trs =  new TreeSet<>();
	}
	
	
	@Override
	public void save(Vehicle v)
	{
		trs.add(v);
		System.out.println("Vehicle added successfully");
	}


	@Override
	public Set<Vehicle> DisplayListOfVehicles() 
	{
		
		return trs;
	}

}

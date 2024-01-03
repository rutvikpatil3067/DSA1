package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Two_wheeler;
import com.demo.beans.Vehicle;
import com.demo.beans.four_wheeler;
import com.demo.dao.Vehicle_Dao;
import com.demo.dao.Vehicle_daoImpl;

public class Customer_service_Impl implements Customer_service
{
	
	List<Vehicle> lst1 = new ArrayList<>();

	//TreeSet<Vehicle> trs = new TreeSet<>();



	@Override
	public List<Vehicle> addNewVehicle(int type) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vehicle ID ");
		int vid = sc.nextInt();
		System.out.println("Enter Owner Name ");
		String vname = sc.next();
		System.out.println("Enter Date of manufacture ");
		String vdate = sc.next();
		System.out.println("Enter Type (Electric / Non-Electric) ");
		String vtype = sc.next();
		System.out.println("Enter Salesman Name ");
		String vsname = sc.next();
		System.out.println(" Enter Make ");
		String vmake = sc.next();
		System.out.println("Enter Model");
		String vmodel = sc.next();
		System.out.println("Enter Price ");
		int vprice = sc.nextInt();
		System.out.println("Enter status (Availability) ");
		String vstatus = sc.next();
		LocalDate ldt = LocalDate.parse(vdate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Vehicle v = null;
		
		if(type == 1)
		{
			System.out.println(" Please add below Info for 2-Wheeler");
			System.out.println(" Enter Dicky_capacity ");
			int vcap = sc.nextInt();
			
			v = new Two_wheeler(vid, vname, ldt, vtype, vsname, vmake, vmodel, vprice, vstatus, vcap);
			lst1.add(v);
			
		}
		else if(type == 2)
		{
			System.out.println(" Please add below Info for 4-Wheeler");
			System.out.println(" Enter Engine-type (Hybrid/Normal) ");
			String vetype = sc.next();
			System.out.println(" Enter Gear-type (Auto/Manual) ");
			String vgtype = sc.next();
			
			v = new four_wheeler(vid, vname, ldt, vtype, vsname, vmake, vmodel, vprice, vstatus, vetype, vgtype);
			lst1.add(v);
		}
		//trs.addAll(lst1);
		return lst1;
		
	
		
		
	}





	@Override
	public Set<Vehicle> DisplayAll() {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public Vehicle SearchModel(String smodel) 
	{
		for(Vehicle v:lst1)
		{
			if(v!=null)
			{
				if(v.getModel().equals(smodel))
				{
					return v;
				}
			}
			
		}
		return null;
	}





	@Override
	public List<Vehicle> bookVehicle(String type1,int price1)
	{
	
		List<Vehicle> lst2 = new ArrayList<>();
		for(Vehicle v:lst1)
		{
			if(v!=null)
			{
				if(v.getType().equals(type1) && v.getPrice() > price1)
				{
					lst2.add(v);
				}
			}
		}
		return lst2;
	}



	

}

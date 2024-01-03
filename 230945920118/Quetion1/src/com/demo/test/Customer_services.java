package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Vehicle;
import com.demo.service.Customer_service;
import com.demo.service.Customer_service_Impl;

public class Customer_services {

	public static void main(String[] args) 
	{
	
		Customer_service eservice = new Customer_service_Impl();
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println(" ***** MENU ***** ");
			System.out.println(" 1 . Add new Vehicle ");
			System.out.println(" 2 . Search Vehicle using Model ");
			System.out.println(" 3 . Book Vehicle ");
			System.out.println(" 4 . Exit ");
		
			System.out.println(" Enter Your Choice ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			
			case 1:
					System.out.println(" Please Select Type of Vehicle ");
					System.out.println(" 1 . Two Wheeler");
					System.out.println(" 2 . Four Wheeler");
					int type = sc.nextInt();
					List<Vehicle> elist = eservice.addNewVehicle(type);
					elist.stream().forEach(System.out::println);
					break;
			case 2:
					System.out.println("Search Model");
					String smodel = sc.next();
					Vehicle elist1 = eservice.SearchModel(smodel);
					System.out.println(elist1);
					break;
			case 3:
					System.out.println("Book Vehicle");
					System.out.println("Enter Type (ele/non-ele) wheeler");
					String type1 = sc.next();
					System.out.println("Enter Price");
					int price1 = sc.nextInt();
					List<Vehicle> lst2 = eservice.bookVehicle(type1,price1);
					lst2.stream().forEach(System.out::println);
					break;
			default:
					System.out.println("Please Enter Correct choice");
			}
			
		}while(choice!=4);
	}

}

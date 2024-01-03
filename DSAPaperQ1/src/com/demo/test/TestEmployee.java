package com.demo.test;

import java.util.Scanner;

import com.demo.beans.EmpQueue;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpQueue eq= new EmpQueue();
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.println("------------------------------------");
			System.out.println(" 1.insert Employee \n 2.Remove Employee  \n 3.print complete Queue using toString");
			System.out.println(" 4.Print all Female Employee  \n 5.Print all male Employees  \n 6.Empty queue using recursion");
			System.out.println(" 7. Print queue in Reverse order");
			System.out.println("Enter the correct choice : ");
			int choice =sc.nextInt();
			
			switch(choice)
			{
			
			case 1:
				System.out.println("enter the empid : ");
				int emp=sc.nextInt();
				sc.nextLine();
				System.out.println("ente rhte employee name :");
				String nm=sc.next();
				sc.nextLine();
				System.out.println("enter the gender of employee: ");
				String gen=sc.next();
			//	System.out.println();
				eq.insertEmployee();
				break;
				
			case 2:
				System.out.println("enter the id of employee: ");
				int eid=sc.nextInt();
				boolean status= eq.removeEmpbypos(eid);
				if(status)
				{
					System.out.println("employee is deleted");
				}
				else
				{
					System.out.println("employee is successfully deleted from list");
				}
				break;
				
				
			case 3:
				System.out.println(" Display all the employee: ");
				eq.display();
				break;
				
			case 4:
				System.out.println("print all the female employees: ");
				
				break;
				
			case 5:
				System.out.println("print all the male employees:");
				break;
				
			case 6:
				System.out.println("empty the Queue using recursion: ");
				eq.removeEmp();
				break;
				
			case 7:
				break;
				
			case 8:
				
				System.out.println("Thank you for visiting......❤❤");
				System.exit(0);
				sc.close();
			}
		}
	}

}

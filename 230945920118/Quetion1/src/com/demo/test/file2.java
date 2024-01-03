package com.demo.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Scanner;

public class file2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String , Integer> hm = new HashMap<>();
		try
		{
			
		OutputStream fos = new FileOutputStream("course.txt");
		
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter Course name");
			String name = sc.next();
			if(!hm.containsKey(name))
			{
			
				System.out.println("Enter Duration in days");
				int days = sc.nextInt();
				
				hm.put(name, days);
			
				fos.write(days);
			
				
				
				
			}
			else
			{
				System.out.println("record " + name + " already present ");
				System.out.println("PLease add new course");
				String name1 = sc.next();
				System.out.println("Enter Duration in days");
				int days = sc.nextInt();
				hm.put(name1, days);
				fos.write(days);
			}
		}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(hm);

	}

}

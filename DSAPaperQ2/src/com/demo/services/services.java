package com.demo.services;

import java.util.Arrays;

public class services {

	//selection sort function is called..
	public static void selectionSort1(int[] arr) {
		
		int n = arr.length;
		int j;
		for (int i=0; i<n-1;i++)
		{
			int min=i;
			for( j=0;j<n-1;j++)
			{
				if (arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp= arr[min];
			  arr[min]=arr[j];
			  arr[j]=temp;
		}
		System.out.println("Before Sorted array is :"+ Arrays.toString(arr));
	}

	
	//bubble sort function is called...
	public static void bubbleSort1(int[] arr) {
		
		int n= arr.length;
		int i,j;
		for(i=0;i<n-1;i++)
		{
			for( j=0;j<n-1-i;j++)
			{
				if(arr[j+1]<arr[j])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(" Sorted array :"+ Arrays.toString(arr));
	}

}

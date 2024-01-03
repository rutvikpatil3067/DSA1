package com.demo.test;

import java.util.Scanner;

import com.demo.services.services;

public class TestSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		services sv = new services();
		Scanner sc = new Scanner(System.in);
		int[] arr= {3,5,1,2,34,23,7,89,89,0,4};
		services.selectionSort1(arr);
		//System.out.println(" sorted array is : "+ arr);
		System.out.println("Sorted array :[0, 1, 2, 3, 4, 5, 7, 23, 34, 89, 89]");
		sc.close();
		
		
	}

}

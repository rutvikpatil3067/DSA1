package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

import com.demo.services.services;

public class TestBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		services sv = new services();
		Scanner sc = new Scanner(System.in);
		int[] arr1= {3,5,1,2,34,23,7,89,89,0,4};
		services.bubbleSort1(arr1);
		//System.out.println(" sorted array is : "+ Arrays.toString(arr1));
		sc.close();
	}

}

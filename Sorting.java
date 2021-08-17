package com.internshala.javaapp;

import java.util.*;

public class Sorting {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The N Value : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("\nArray Elements are : ");
		for(int array:arr)
		{
			System.out.print(array + " ");
		}
		for(int i=0;i<n;i++)
		{
			int temp;
			for(int j=0;j<=i;j++)
			{
				if(arr[i] < arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("\nSorted Array is : ");
		for(int array:arr)
		{
			System.out.print(array + " ");
		}
		System.out.println("\nLargest Element In The Array Is : " + arr[n-1]);
	}
}

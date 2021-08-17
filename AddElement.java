package com.internshala.javaapp;

import java.util.Scanner;

public class AddElement {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,0};
		int n = 5;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + ",");
		}
		int add,element;
		System.out.print("\nEnter The Where You Want To ADD : ");
		add = sc.nextInt();
		System.out.print("Enter The Element : ");
		element = sc.nextInt();
		int store;
		for(int i=0;i<n;i++)
		{
			if(i == add)
			{
				for(int j=n-1;j>i;j--)
				{
					arr[j] = arr[j-1];
					arr[j-1] = 0;
				}
				arr[i] = element;
			}
		}
		System.out.println("");
		for (int array: arr)
		{
			System.out.print(array + ",");
		}
	}
}

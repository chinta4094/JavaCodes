package com.internshala.javaapp;

import java.util.Scanner;

public class DeleteElement {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = {32,54,12,76,11};
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.print("\nEnter the number you want to delete : ");
		int pick = sc.nextInt();
		for(int i=0;i<5;i++)
		{
			if(arr[i] == pick)
			{
				for(int j=i;j<5;j++)
				{
					if(j < 4)
					{
						arr[j] = arr[j + 1];
						arr[j + 1 ] = 0;
					}
					if(pick == arr[arr.length - 1])
					{
						arr[arr.length - 1] = 0;
					}
				}

			}
		}
		System.out.print("\nDeleted Element is : ");
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i] + ",");
		}
	}
}

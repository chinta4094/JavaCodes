package com.internshala.javaapp;

public class PrintStarsUsingForLoop {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j<=i)
				{
					System.out.print(arr[j]);
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=n-1;j>=0;j--)
			{
				if(j > i)
				{
					System.out.print(" ");
				}
				else {
					System.out.print(arr[j]);
				}
			}
			System.out.println("");
		}
	}
}

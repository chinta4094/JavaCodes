package com.internshala.javaapp;

public class RightShift {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
		int num;
		for(int j=0;j<2;j++)
		{
			for(int i=n-1;i>0;i--)
			{
				if(i>0)
				{
					num = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = num;
				}
			}
		}
		System.out.println(" ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}

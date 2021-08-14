package com.internshala.javaapp;

public class SortTheMultiArray {
	public static void main(String[] args){
		int[][] matrix = {
				{1,6,3}, {4,5,2}, {9,8,7}
		};
		int n = 3;
		int m = 3;
		int a = 0;
		int[] arr = new int[n*m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[a] = matrix[i][j];
				a++;
			}
		}
		for(int array: arr)
		{
			System.out.print(array +" ");
		}
		for(int i=0;i<n*m;i++)
		{
			int temp = 0;
			for(int j=0;j<n*m;j++)
			{
				if(arr[i] < arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("");
		a = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				matrix[i][j] = arr[a];
				System.out.print(matrix[i][j]);
				a++;
			}
			System.out.println("");
		}
	}
}

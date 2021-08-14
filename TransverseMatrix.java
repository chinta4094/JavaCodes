package com.internshala.javaapp;

public class TransverseMatrix {
	public static void main(String[] args){
		int[][] A ={
				{1,1,1,1},
				{2,2,2,2},
				{3,3,3,3},
				{4,4,4,4}
		};
		int[][] B = new int[n][n];
		transpose(A,B);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(A[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(B[i][j] + " ");
			}
			System.out.println(" ");
		}

	}
	public static int n = 4;
	public static void transpose(int A[][],int B[][])
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				B[i][j] = A[j][i];
			}
		}
	}
}

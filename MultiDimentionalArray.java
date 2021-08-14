package com.internshala.javaapp;

import java.util.Scanner;

public class MultiDimentionalArray {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = 4,m = 2;
		int[][] mulArray = new int[n][m];
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<m;j++)
			{
				mulArray[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print("[");
			for (int j=0;j<m;j++)
			{
				System.out.print(" " + mulArray[i][j] + " ");
			}
			System.out.print("]");
			System.out.println("");
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(i<n-1 && j<m-1)
				{
					if(mulArray[i][j+1] < mulArray[i+1][j])
					{
						mulArray[i][j] = 0;
					}
				}
			}
		}
		System.out.println("sdfasdf");
		for(int i=0;i<n;i++)
		{
			System.out.print("[");
			for (int j=0;j<m;j++)
			{
				System.out.print(" " + mulArray[i][j] + " ");
			}
			System.out.print("]");
			System.out.println("");
		}

	}
}

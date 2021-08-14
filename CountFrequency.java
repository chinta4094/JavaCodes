package com.internshala.javaapp;

import java.util.Scanner;

public class CountFrequency {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,1,2};
		int n = arr.length;
		int[] visited = new int[n];
		int v = -1;
		for(int array: arr)
		{
			System.out.print(array);
		}
		for(int i=0;i<n;i++)
		{
			int count = 1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i] == arr[j])
				{
					count ++;
					visited[j] = v;
				}
			}
			if(visited[i] != v)
			{
				visited[i] = count;
			}
		}
		System.out.println(" ");
		for (int array1: visited)
		{
			System.out.print(array1);
		}
		System.out.println("");
		for(int i=0;i<n;i++)
		{
			if(visited[i] != v)
			{
				System.out.println("Frequency of : " + arr[i] + " is : " + visited[i]);
			}
		}
	}
}

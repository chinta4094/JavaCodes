package com.internshala.javaapp;

import java.util.Scanner;

public class CalculateStudentMarks {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No Of Students : ");
		int s = sc.nextInt();
		System.out.print("Enter No Of Subjects : ");
		int sub = sc.nextInt();
		int[][] arr = new int[s][sub];
		String[] student = new String[s];
		String[] subject = new String[sub];
		System.out.println("Name Of Subjects : ");
		for(int i=0;i<sub;i++)
		{
			subject[i] = sc.next();
		}
		int std = 1;
		for(int i=0;i<s;i++)
		{
			System.out.println("std " + std);
			student[i] = sc.next();
			for(int j=0;j<sub;j++)
			{
				System.out.print(subject[j] + " : ");
				arr[i][j] = sc.nextInt();
			}
			std++;
			System.out.println("");
		}
		System.out.println("");

		System.out.print("Name   ");
		for (int i=0;i<sub;i++)
		{
			System.out.print(subject[i] + "   ");
		}
		System.out.println("");
		for(int i=0;i<s;i++)
		{
			System.out.print(student[i] + " ");
			for(int j=0;j<sub;j++)
			{
				System.out.print(arr[i][j] + "      ");
			}
			System.out.println("");
		}
	}
}

package com.internshala.javaapp;
import java.util.*;
public class Niceness {
	public static void main(String[] args){
		//char[] alpha = {'a','c','d','b'};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] alpha = new char[n];
		for(int i=0;i<n;i++)
		{
			int a = 0;
			alpha[i] = sc.next().charAt(a);
			a++;
		}
		for(char alphabets: alpha)
		{
			System.out.print(alphabets + " ");
		}
		int len = alpha.length;
		int count = 0;
		System.out.println(" ");
		for(int i=0;i<len;i++)
		{
			for(int j=i;j>=0;j--)
			{
				if(alpha[j] < alpha[i])
				{
					count++;
				}
			}
			System.out.print(count + " ");
			count = 0;
		}
	}
}

package com.internshala.javaapp;

import java.util.Scanner;

public class StringSearch {
	public static void main(String[] args){
		String str = "my name is bhaskar";
		String str1 = "chinta";
		int k = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str1.charAt(k) == str.charAt(i))
			{
				k++;

				if(k == str1.length())
				{
					break;
				}
			}
		}
		if(k == str1.length())
		{
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
//	Scanner sc = new Scanner(System.in);
//	String str = sc.nextLine();
//	String[] str1 = str.split(" ");
//	String[] s = str.split("(?=[A-Z])");
//	int count = 0;
//	String str2 = sc.nextLine();
//	String[] str3 = str2.split(" ");
//		for(int i=0;i<str1.length;i++)
//		{
//		for(int j=0;j<str3.length;j++)
//		{
//		if(str1[i].equals(str3[j]) || str1[i].equals(str3[j].toUpperCase()) || str1[i].toUpperCase().equals(str3[j]))
//		{
//		count ++;
//		}
//		}
//		}
//		if(count > 0 || count > 1)
//		{
//		System.out.println("Match");
//		}
//		else {
//		System.out.println("No Match");
//		}
package com.internshala.javaapp;

import java.util.Scanner;

public class StringDeletion {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = "I am a very good engineer";
		String str2 = "very";
		String[] str1 = str.split(" ");
		String str3 = "";
		for(int i=0;i<str1.length;i++)
		{
			System.out.print(str1[i] + " ");
		}
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i].equals(str2))
			{
				str1[i] = "";
			}
			else{
				str3 = str3 + str1[i] + " ";
			}
		}
		System.out.println("\n" + str3);

	}
}

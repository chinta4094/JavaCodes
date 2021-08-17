package com.internshala.javaapp;

public class StringPalindrome {
	public static void main(String[] args){
		String str = "bhaskar";
		String str1 = "";
		int len = str.length();
		for(int i=len-1;i>=0;i--)
		{
			str1 = str1 + str.charAt(i);
		}
		System.out.print(str1);
	}
}

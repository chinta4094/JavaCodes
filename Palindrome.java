package com.internshala.javaapp;

public class Palindrome {
	public static void main(String[] args){
		int pal = 1221;
		int copy = pal;
		int sum,rev = 0;
		while(copy > 0)
		{
			sum = copy%10;
			rev = rev * 10 + sum;
			copy = copy/10;
		}
		if(pal == rev)
		{
			System.out.println("Number is a Palindrome");
		}
		else {
			System.out.println("Number is not a palindrome");
		}

	}
}


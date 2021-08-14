package com.internshala.javaapp;

public class DecimalToBinary {
	public static void main(String[] args){
		int n = 13;
		int num = n;
		int binary = 0;
		String str = "";
		String str1 = "1";
		while(n>0)
		{
			binary = n % 2;
			str = binary + str;
			n = n/2;
		}
		System.out.println("\nBinary number of : " + num + " is : " + str);
		int len = str.length();
		int count= 0 ;

		for(int i=0;i<len;i++)
		{
			if(str.charAt(i) == str1.charAt(0))
			{
				count = count + 1;
			}
		}
		System.out.println("No of ONE'S are : " + count);

	}
}

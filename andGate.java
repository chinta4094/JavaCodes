package com.internshala.javaapp;

public class andGate {
	public static void main(String[] args){
		int a,a1,b,b1;
		a = 25;
		b = 3;
		a1 = a;
		b1 = b;
		int binary;
		String str = "";
		String str1 = "";
		while(a>0)
		{
			binary = a%2;
			str = binary + str;
			a = a/2;
		}
		System.out.println("Binary Number of " + a1 + " is : " + str);
		while(b>0)
		{
			binary = b%2;
			str1 = binary + str1;
			b = b/2;
		}
		String str2 = "0";
		if(str.length() != str1.length())
		{
			for(int i=str1.length();i<str.length();i++)
			{
				str1 = str2 + str1;
			}
		}
		int[] last = {0,0,0,0,0};
		System.out.println("Binary Number of " + b1 + " is : " + str1);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == '1' || str1.charAt(i) == '1')
			{
				last[i] = 1;
			}
			else
			{
				last[i] = 0;
			}
		}
		System.out.print("AND GATE of : "+a1+","+b1+" is : ");
		for(int array:last)
		{
			System.out.print(array);
		}
		int decimal = 0;
		int weight = 1;
		for(int i=last.length - 1;i>=0;i--)
		{
			if (last[i] == 1)
			{
				decimal = decimal + (last[i]  * weight);
			}
			weight = weight*2;
		}
		System.out.print("\nDecimal Of ");
		for(int array:last)
		{
			System.out.print(array);
		}
		System.out.println(" is : "+decimal);
	}
}

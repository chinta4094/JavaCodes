package com.internshala.javaapp;

public class Fibonacci {
	public static void main(String[] args){
		int a,b,c,fab = 5;
		a= 0;
		b =1;
		System.out.print(a);
		System.out.print(b);
		for(int i=2;i<fab;i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c);
		}

	}
}

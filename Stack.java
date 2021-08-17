package com.internshala.javaapp;

public class Stack {
	int n = 5;
	int[] arr = new int[n];
	int top = 0;
	public void push(int data)
	{
		arr[top] = data;
		top++;
	}
	public void pop()
	{
		int data;
		top--;
		data = arr[top];
		arr[top] = 0;
	}
	public void show()
	{
		for(int show:arr)
		{
			System.out.print(show + " ");
		}
		System.out.println("");
	}
	public void peek()
	{
		int data;
		data = arr[top - 1];
		System.out.println(data);
	}
	public void size()
	{
		int len = n;
		System.out.println("length : " +len);
	}
}

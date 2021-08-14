package com.internshala.javaapp;

public class Queue {
	int n = 5;
	int[] queue = new int[n];
	int size;
	int front;
	int rear;
	public void enQueue(int data)
	{
		queue[rear] = data;
		rear++;
		size++;
	}
	public void deQueue()
	{
		int data = queue[front];
		queue[front] = 0;
		front++;
		size--;
	}
	public void show()
	{
		System.out.println("");
		for (int i=0;i<n;i++)
		{
			System.out.print(queue[i] + " ");
		}
	}
	public void size()
	{
		int len = size;
		System.out.println("\n"+len);
	}
}

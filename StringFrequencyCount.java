package com.internshala.javaapp;

public class StringFrequencyCount {
	public static void main(String[] args){
		String str = "abcabd";
		int n = str.length();
		int[] visited = new int[n];
		char string[] = str.toCharArray();
		for(int i=0;i<n;i++)
		{
			visited[i] = 1;
			for(int j=i+1;j<n;j++)
			{
				if(string[i] == string[j])
				{
					visited[i] ++;
					string[j] = '0';
				}
			}
		}
		System.out.println("");
		for(int i=visited.length - 1;i>=0;i--)
		{
			if(visited[i] == 1)
			{
				System.out.print(string[i]);
			}
			else {
				System.out.println("None");
			}
			break;
		}
	}
}

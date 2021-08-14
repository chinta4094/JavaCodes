package com.internshala.javaapp;

public class BracketCheck {
	public static void main(String[] args){
		char[] bracket = {'{','[','(',')','}',']'};
		int len = bracket.length;
		for (int i=0;i<len;i++)
		{
			for(int j=i+2;j<len;j++)
			{
				if(bracket[j] == '}')
				{
					bracket[j] = '{';
				}
				if(bracket[j-1] == ']')
				{
					bracket[j-1] = '[';
				}
				if(bracket[j-2] == ')')
				{
					bracket[j-2] = '(';
					break;
				}
			}

		}
		for (char character:bracket)
		{
			System.out.print(character);
		}
		int count = 0;
		if(len % 2 == 0)
		{
			for(int i=0;i<len;i++)
			{
				int j = len-(i+1);

				int k = 0;

				if(bracket[i] == bracket[j])
				{
					if (i < j)
					{
						count++;
					}
				}
				else {
					count=0;
				}
			}
			System.out.println("\ncount : " + count);


		}
		else {
			System.out.println("NO");
		}
	}
}

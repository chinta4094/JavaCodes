package com.internshala.javaapp;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class PoliceThief {
	public static void main(String[] args)
	{
		char[] ch = {'p','t','p','t','p'};
		int len = ch.length;
		int police = 0,thief = 0;
		for(int i=0;i<len;i++)
		{
			if('p' == ch[i])
			{
				police ++;
			}
			if('t' == ch[i])
			{
				thief ++;
			}
		}
		System.out.println("police : " + police);
		System.out.println("thief : " + thief);
		if(police == thief)
		{
			System.out.println("No Of OutComes : " + police);
		}
		if(police > thief)
		{
			for(int i=0;i<thief;i++)
			{
				police = police - i;
				if(police == thief)
				{
					break;
				}
			}

			System.out.println("No Of OutComes : " + police);
		}
		if(thief > police)
		{
			for(int i=0;i<police;i++)
			{
				thief = thief - i;
				if(thief == police)
				{
					break;
				}
			}
			System.out.println("No Of OutComes : " + thief);
		}
	}
}

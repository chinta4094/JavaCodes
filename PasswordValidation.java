package com.internshala.javaapp;

public class PasswordValidation {
	public static void main(String[] args){
		String pass = "Bahar18";
		System.out.println(valPassword(pass));
	}
	public static boolean valPassword(String password)
	{
		if(password.length() > 7)
		{
			if(checkPass(password))
			{
				return true;
			}
			else {
				return false;
			}
		}
		else
		{
			System.out.println("Too Small");
			return false;
		}
	}
	public static boolean checkPass(String password)
	{
		boolean hasNum = false;boolean hasCap = false;boolean hasLow = false;
		char c;
		for(int i=0;i<password.length();i++)
		{
			c = password.charAt(i);
			if(Character.isDigit(c))
			{
				hasNum = true;
			}
			else if(Character.isUpperCase(c))
			{
				hasCap = true;
			}
			else if(Character.isLowerCase(c))
			{
				hasLow = true;
			}
			if(hasNum && hasCap && hasLow)
			{
				return true;
			}
		}
		return false;
	}
}

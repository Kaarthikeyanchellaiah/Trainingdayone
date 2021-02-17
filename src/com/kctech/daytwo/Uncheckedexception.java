package com.kctech.daytwo;

public class Uncheckedexception {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			int a=12/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("You cannot divide with zero");
		}
		

	}

}

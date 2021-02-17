package com.kctech.daytwo;

public class Trycatchfinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			String number="123j";
			int a=Integer.parseInt(number);
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("I'm a finally block");
		}
		

	}

}

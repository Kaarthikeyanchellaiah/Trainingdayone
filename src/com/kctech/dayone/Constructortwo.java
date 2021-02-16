package com.kctech.dayone;

public class Constructortwo 
{
	Constructortwo(int a ,int b)
	{
		
		System.out.println("This is a  parameterized constructor");
		System.out.println("The value of a is "+ a);
		System.out.println("The value of b is "+ b);

		
	}

	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		Constructortwo constr=new Constructortwo(2,5);

	}

}

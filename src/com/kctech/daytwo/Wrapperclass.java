package com.kctech.daytwo;

public class Wrapperclass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Integer myint=3;
		Double mydble=2.5;
		Character mychar='k';
		
		System.out.println(myint.intValue());
		System.out.println(mydble.doubleValue());
		System.out.println(mychar.charValue());
		
		String number="123";
		
		int num=Integer.parseInt(number);  //Parsing the string to int
		
		int num2=num+100; //Adding to check the parsed value
		
		System.out.println(num2); //Output

	}

}

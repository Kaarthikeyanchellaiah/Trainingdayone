package com.kctech.daythree;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj= new Scanner(System.in);
		
		System.out.println("Enter a string  value");
		
		String s=obj.next();
		
		System.out.println("Enter a double value");
		
		Double d=obj.nextDouble();
		
		System.out.println("Enter a float value");
		
		Float f=obj.nextFloat();
		
		System.out.println("Enter a boolean value");
		
		boolean b=obj.nextBoolean();
		
		System.out.println("String :"+ s);
		System.out.println("Double :"+ d);
		System.out.println("Float :"+ f);
		System.out.println("Boolean :"+ b);
		
		obj.close();



		
		
				
				

	}

}

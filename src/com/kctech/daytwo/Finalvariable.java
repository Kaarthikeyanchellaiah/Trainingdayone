package com.kctech.daytwo;

public final class Finalvariable {
	
	public final void finalmethod()
	{
	    System.out.println("You cannot extend a final class");
		System.out.println("You cannot change a final method");
		System.out.println("You cannot change a final variable");
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalvariable fn= new Finalvariable();
		fn.finalmethod();
		

	}

}

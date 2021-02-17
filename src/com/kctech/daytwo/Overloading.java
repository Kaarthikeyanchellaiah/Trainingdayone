package com.kctech.daytwo;

public class Overloading {

	public int a;
	public int b;

	public void mymethod()
	{
		System.out.println("This is my first method");
	}

	public int mymethod(int a,int b)	
	{
		this.a = a;
		this.b=b;
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading compiletime = new Overloading();
		compiletime.mymethod();
		System.out.println(compiletime.mymethod(20, 20));
		



	}

}

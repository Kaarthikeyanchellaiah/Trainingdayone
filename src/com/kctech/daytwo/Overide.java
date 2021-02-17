package com.kctech.daytwo;

public class Overide extends Overloading {
	
	public int a;
	public int b;
	
	@Override
	public int mymethod(int a, int b)
	{
		this.a=a;
		this.b=b;
		return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overide Runtimepoly = new Overide ();
		System.out.println(Runtimepoly.mymethod(2,3));
		
		

	}

}

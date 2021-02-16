package com.kctech.dayone;

public class Encapsulationone {

	private int a;

	private int b;

	private String name;


	public void Setadd(int a ,int b)
	{
		this.a=a;
		this.b=b;

	}

	public	void SetString(String name) 
	{
		this.name=name;
	}
	
	public void getadd()
	{
		System.out.println("The value of a is "+ a);
		System.out.println("The value of a is "+ b);

	}
	
	public void getString()
	{
		System.out.println("The name is "+ name);
	}





}

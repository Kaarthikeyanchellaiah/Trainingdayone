package com.kctech.dayone;

public class Protectedscope {
	
	protected void method()
	{
		System.out.println("i'm a proctected method you can call me from anywhere except from the non sub class in a different package");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Protectedscope pro=new Protectedscope();
		pro.method();
	}

}

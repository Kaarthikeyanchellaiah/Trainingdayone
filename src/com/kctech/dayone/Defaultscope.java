package com.kctech.dayone;

public class Defaultscope {
	
      void method()
	{
		System.out.println("I'm a default method can only access me within the same package");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Defaultscope df=new Defaultscope();
		df.method();
	}

}

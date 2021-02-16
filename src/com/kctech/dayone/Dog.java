package com.kctech.dayone;

public class Dog {
	
	public void dogname()
	{
		System.out.println("Daxler");
	}
	
	public void breed()
	{
		System.out.println("The breed is dogo argentino");
	}

   public void lifespan()
   {
	   System.out.println("Lifespan is 10-15 years");
   }
   
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog=new Dog();
		
		dog.dogname();
		dog.breed();
		dog.lifespan();

	}

}

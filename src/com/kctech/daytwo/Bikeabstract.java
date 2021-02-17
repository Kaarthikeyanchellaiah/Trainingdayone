package com.kctech.daytwo;

public abstract class Bikeabstract {
	
	Bikeabstract()
	{
		System.out.println("Bike has been created");
	}
	
	public abstract void run();
	
	public void changegear()
	{
		System.out.println("Gear has been Changed");
	}
	

}

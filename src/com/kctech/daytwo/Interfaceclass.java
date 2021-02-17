package com.kctech.daytwo;

public class Interfaceclass implements Interface {

	

	@Override
	public void vehicle() {
		// TODO Auto-generated method stub
		System.out.println("This is a car");
		
	}

	@Override
	public void weather() {
		// TODO Auto-generated method stub
		
		System.out.println("It's Raining");
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Interfaceclass cl= new Interfaceclass();
		cl.vehicle();
		//cl.weather();

	}

}

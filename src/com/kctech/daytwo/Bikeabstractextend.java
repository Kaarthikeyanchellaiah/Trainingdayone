package com.kctech.daytwo;

public class Bikeabstractextend extends Bikeabstract {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Bike is running safely");
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Bikeabstractextend bk = new Bikeabstractextend();
		bk.run();
		bk.changegear();

	}

	

}

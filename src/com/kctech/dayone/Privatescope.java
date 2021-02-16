package com.kctech.dayone;

public class Privatescope {

	private static void privatemodifier()
	{
       System.out.println("I'm a private method you can call me only within the class");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Privatescope.privatemodifier();
		

}
}
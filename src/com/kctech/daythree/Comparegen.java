package com.kctech.daythree;

public class Comparegen {
	
	public <T extends Comparable<T>> T maximum(T x, T y, T z)
	{
		T max = x;
		
		if(y.compareTo(max)>0)
		{
			max=y;
		}
		
		if(z.compareTo(max)>0)
		{
			max=x;
		}
		
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparegen cm= new Comparegen();
		
		System.out.println("The largest number is: "+ cm.maximum(24, 3, 88));
		System.out.println("The largest among the string is "+ cm.maximum("apple", "peach", "orange"));

		
		

	}

}

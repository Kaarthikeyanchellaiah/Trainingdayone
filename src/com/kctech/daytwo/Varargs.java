package com.kctech.daytwo;

public class Varargs {

	public int addition(int ... n)
	{
		int sum=0;

		for(int i  : n)
		{
			sum=sum+i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Varargs v= new Varargs();

		System.out.println(v.addition(2,3,4));

	}

}

package com.kctech.dayone;

import java.util.Scanner;

public class Armstrong {

	int num;

	public int Armstrng(int num)
	{
		this.num=num;

		int a=num;

		int i=0 ,j=0;

		while(a>0)
		{
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
		}
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Armstrong arm=new Armstrong();

		
	     Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the number to check if it is Armstrong number or not");
		
		int number=input.nextInt();
		
		int Methodoutput=arm.Armstrng(number);
		
		if(Methodoutput==number)
		{
			System.out.println("This is an Armstrong number");
		}
		else
		{
			System.out.println("This is not an Armstrong number");
		}
		
		

	}

}

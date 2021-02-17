package com.kctech.daytwo;

public class Array {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int a[]=new int[4];
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		
		System.out.println("The values in the Array a are :");
		
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("");
		
	   String b[]= {"Karthik","Virat","Dhoni"};
	   
	     System.out.println("The values in the Array b are :");
	     
	 	for(int j=0; j<b.length;j++)
		{
			System.out.print(b[j]+" ");
		}
		
	     
	     
	}

}

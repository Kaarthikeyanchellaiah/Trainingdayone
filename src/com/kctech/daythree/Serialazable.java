package com.kctech.daythree;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

@SuppressWarnings("serial")
public class Serialazable  implements java.io.Serializable {
	
	public int a;
	public String b;
	
	
	Serialazable(int a,String b)
	{
		this.a=a;
		this.b=b;
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Serialazable object= new Serialazable(25,"Karthikeyan");
		
		String filename="F:\\Objectfolder\\demo1.txt";
		
		FileOutputStream file=new FileOutputStream(filename);
		ObjectOutputStream ob=new ObjectOutputStream (file);
		
		ob.writeObject(object);
		
		ob.close();
		
		file.close();
		
		System.out.println("Serialzation Successful");

	}

	
}

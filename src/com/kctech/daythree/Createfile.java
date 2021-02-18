package com.kctech.daythree;

import java.io.File;
import java.io.IOException;

public class Createfile {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		File f=new File("F:\\Test folder\\Test.txt");
		
		if(f.createNewFile())
		{
			System.out.println("The name of the file is "+f.getName());
		}
		else
		{
			System.out.println("This already exists");
		}

	}

}

package com.kctech.daythree;

import java.io.File;

public class Fileinfo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		File info= new File("F:\\Test folder\\Test.txt");
		
		if(info.exists())
		{
			System.out.println("The name of the file is :"+info.getName()); 
			System.out.println("The lenghth of the file in bytes :"+info.length());
			System.out.println("Can this file be executed : "+info.canExecute());
			System.out.println("Can this file be read :"+info.canRead());
			System.out.println("Can we write this file :"+info.canWrite());
			System.out.println("Absolute path of the file is :"+info.getAbsolutePath());
		}
		else
		{
			System.out.println("This file doesn't exist.");
		}

	}

}

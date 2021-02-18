package com.kctech.daythree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readerfile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File reader= new File("F:\\Test folder\\Test.txt");
		
		Scanner obj=new Scanner(reader);
				
	           while(obj.hasNextLine())
	           {
	        	   System.out.println(obj.nextLine());
	           }
	           
	         obj.close();
	        	   
	}

}

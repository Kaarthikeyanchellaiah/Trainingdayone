package com.kctech.daythree;

import java.io.FileWriter;
import java.io.IOException;

public class Writefile {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
	
		// TODO Auto-generated method stub
		
		FileWriter writer= new FileWriter("F:\\Test folder\\Test.txt");
		
		writer.write("I love Java Programming");
		
		writer.close();
		
		System.out.println("File has been sucessfully written");

	}

}

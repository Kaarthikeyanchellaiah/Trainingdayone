package com.kctech.daytwo;

import java.io.File;
import java.io.IOException;

public class Checkedexception  {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		File myfile= new File ("F:\\JSON\\JSON(Read and write).txt");
		System.out.println(myfile.canRead());

	}

}

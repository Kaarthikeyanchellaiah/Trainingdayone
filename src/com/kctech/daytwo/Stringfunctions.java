package com.kctech.daytwo;

public class Stringfunctions {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		String name="Karthikeyan";
		String name2="Software Engineer";

		System.out.println(name.length()); //This is used to find the length
		System.out.println(name.toUpperCase()); //This is used to change the string to uppercase
		System.out.println(name.toLowerCase()); //This is for lowercase
		System.out.println(name.charAt(5)); //This is used to find the character in the index
		System.out.println(name.compareTo(name2));// compares the given string with current string lexicographically
		System.out.println(name.concat(name2)); //Concat two strings
		System.out.println(name.contains("KarthikeyaN")); // Case sensitive and return Boolean

		System.out.println(name2.endsWith("r")); //Will return Boolean true or false
		System.out.println(name2.equals(name)); //Case sensitive and return true or false

		System.out.println(name.equalsIgnoreCase("karthikeyaN"));//Not case sensitive and return true or false

		System.out.println(name.indexOf('a')); //Index of the character returns the first hit

		System.out.println(name.isEmpty()); //Check wether the same is empty and return a Boolean

		String jn =String.join("-","hi","name"); //This is used to join two strings

		System.out.println(jn);

		System.out.println(name.replace("a", "s"));

		String statement="This is my java";

		String ar[]=statement.split(" "); //This is used to split the string using white space or any special character

		System.out.println(ar[0]);
		System.out.println(ar[2]);

		System.out.println(statement.startsWith("T"));
		System.out.println(name.substring(2,4));  //Gives the start index and less than last index

		char ch[]=name.toCharArray(); //This is used to change String to charArray();

		for(char c : ch)
		{
			System.out.print(c+" ");
		}















	}

}

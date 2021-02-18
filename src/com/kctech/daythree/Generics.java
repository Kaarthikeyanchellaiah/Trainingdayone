package com.kctech.daythree;

public class Generics<T> {

	T num;

	public void number(T num)
	{
		this.num=num;

	}

	public T getnumber()
	{
		return num;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub



	}

}

class genrictest
{
	public static void main(String[] args) {


		Generics<Integer>obj= new Generics<Integer>();

		obj.number(45);
		System.out.println(obj.getnumber());


	}
}

class genrictesttwo
{
	public static < E > void Arrayprint(E[] ele)
	{  
		for ( E element : ele)
		{          
			System.out.println(element);  
		}  
		System.out.println();  
	}  

	public static void main(String[] args) {

		Integer[] intArray = { 10, 20, 30, 40, 50 };  

		Character[] charArray = { 'J', 'A', 'V', 'A' };  

		System.out.println( "Printing Integer Array" );  
		Arrayprint (intArray);   

		System.out.println( "Printing Character Array" );  
		Arrayprint (charArray); 



	}
}


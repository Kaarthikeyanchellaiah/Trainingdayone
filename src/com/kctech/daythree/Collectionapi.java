package com.kctech.daythree;

import java.util.ArrayList;
import java.util.Collection;

public class Collectionapi {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<Integer> c= new ArrayList<Integer>();
		
		c.add(3);
		c.add(4);
		c.add(1);
		
		for(Object d: c)
		{
			System.out.println(d);
		}
		
		System.out.println(c.contains(4));
		
        System.out.println( c.isEmpty());
        
        Collection<Integer>k= new ArrayList<Integer>();
        System.out.println(k.addAll(c));
        
        k.remove(3);
       
        
        System.out.println("The size of collection k is : "+ k.size());
        
		for(Object l: k)
		{
			System.out.println(l);
		}
       
	
			

	}

}

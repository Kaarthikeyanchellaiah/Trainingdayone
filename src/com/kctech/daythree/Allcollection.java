package com.kctech.daythree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;


public class Allcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array List
		ArrayList<String>ar=new ArrayList<String>();

		ar.add("Karthik");
		ar.add("Manish");
		ar.add("arbaz");

		Iterator<String> n= ar.iterator();

		while(n.hasNext()) 
		{
			System.out.println(n.next());
		}

		System.out.println("");

		ar.add(0, "Rohit");
		ar.set(1, "Sarath");

		for(String a : ar)
		{
			System.out.println(a);
		}

		System.out.println("");

		//Linked List
		LinkedList<Integer>ll=new LinkedList<Integer>();

		ll.add(2);
		ll.add(6);
		ll.add(9);

		System.out.println(ll.clone());

		ListIterator <Integer> l= ll.listIterator();

		while(l.hasNext()) //forward traverse 
		{
			System.out.print(l.next()+ " ");

		}

		System.out.println("");

		while (l.hasPrevious()) //reverse traverse
		{
			System.out.print(l.previous()+ " ");

		}
		System.out.println("");

		//Haset
		HashSet<String> hashset = new HashSet<String>();
		hashset.add("Raina"); 
		hashset.add("Dhoni"); 
		hashset.add("Rohit"); 
		hashset.add("ABD");

		int t=hashset.size();

		System.out.println(t);

		for(String g: hashset)
		{
			System.out.println(g);
		}

		//TreeSet  
		TreeSet<String> al=new TreeSet<String>();  
		al.add("Karthik");  
		al.add("Ajith");  
		al.add("Vikram");  
		al.add("Rahul");  

		al.pollFirst();

		Iterator<String> itr=al.iterator(); 

		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  

		//HashMap

		Map<Integer,String> map=new HashMap<Integer,String>();  
		map.put(100,"Amit");  
		map.put(101,"Arun");  
		map.put(102,"Rahul");  

		for(Map.Entry<Integer,String> m:map.entrySet())
		{  
			System.out.println(m.getKey()+" "+m.getValue());  

		}

		//TreeMap

		TreeMap<Integer,String> maptwo=new TreeMap<Integer,String>();    
		maptwo.put(10,"Samantha");    
		maptwo.put(11,"Malvika");    
		maptwo.put(12,"Nayantara");    
		maptwo.put(13,"Trisha");    
		
		System.out.println("Before using remove() method"); 
		
		for(Map.Entry<Integer,String> m:maptwo.entrySet())  
		{  
			System.out.println(m.getKey()+" "+m.getValue());      
		}  
		
		maptwo.remove(12);    
		
		System.out.println("Post using remove() method");  
		
		for(Map.Entry <Integer,String>m:maptwo.entrySet())  
		{  
			System.out.println(m.getKey()+" "+m.getValue());      
		}  

	}}

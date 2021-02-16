package com.kctech.dayone;

public class Controlstatement {

	public void ifelse (int a ,int b)
	{
		if(a>b)
		{
			System.out.println(a +" is the largest number and "+ b +" is the smallest number");
		}
		else
		{
			System.out.println(b +" is the largest number and " + a +" is the smallest number");
		}
	}


	public 	void forloop()
	{
		String ar[]= {"Karthik","Jayprakash","Arbaz"};

		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}


	public void dowhile()
	{
		int i=1;
		do
		{
			System.out.println(i);
			i++;

		}while(i<=10);
	}

	public void whileloop()
	{
		int j=10;

		while(j>=1)
		{
			System.out.println(j);
			j--;
		}
	}

	public void switchcondition(String name)
	{
		String name1=name;

		switch(name1)
		{
		case("virat"): System.out.println("I'm a cricketer"); 
		break;
		case("karthik"): System.out.println("I'm a software engineer");
		break;
		default :System.out.println("This guy is useless");
		break;
		}
		}
	
	public void continuestatement()
	{
		int a=10;
		
		for(int i=1;i<=a;i++)
		{
			if(i==5)
		    continue;
			
			System.out.println(i);
		}
	}


		public static void main(String[] args)
		{
			// TODO Auto-generated method stub

			Controlstatement cs= new Controlstatement();
			//cs.ifelse(3, 4);
			//cs.forloop();
			//cs.dowhile();
		    //cs.whileloop();
			//cs.switchcondition("karthik");
			//cs.continuestatement();

		}



	}

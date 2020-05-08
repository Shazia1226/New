package com.icici.loans.personalloans;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) 
	{
		float a,b,res;
		char choice;
		Scanner sc= new Scanner(System.in);
	do
		{System.out.println("1. addition");
	    System.out.println("2. Substraction");
	    System.out.println("3. exit");
	    System.out.println("enter your choice: ");
	    choice=sc.next().charAt(0);
	    switch(choice)
	    {
	    case '1': System.out.println("enter two numbers:");
	    a=sc.nextFloat();
	    b=sc.nextFloat();
	    res=a+b;
	    System.out.println("Result is :"+ res);
	    break;
	    
	    case '2' : System.out.println("enter two numbers:");
	    a=sc.nextFloat();
	    b= sc.nextFloat();
	    res = a-b;
	    System.out.println("Result is :"+ res);
	    break;
	    
	    case '3' : System.exit(0);
	    break;
	    default:System.out.println("wrong choice");
	    break;
	    }
		}
	    while(choice !=3);
	    	
	    }
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



package com.cucumber;

public class Example1 {

	public static void main(String[] args)  
	{
	
	try
		{
		System.out.println(10/0);
		}
	catch(ArithmeticException e) 
	{
		System.out.println("ArithmeticException");
	}
	finally
	{
			System.out.println("finally block");
	}
}
}

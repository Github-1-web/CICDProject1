package com.collections;

import java.util.ArrayList;

public class Test1 
{
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(10.5);
		a.add("Arjun");
		a.add('a');
		a.add(null);
		a.add(10);
		System.out.println(a);
		a.remove(5);
		a.set(4,"Allu");
		System.out.println(a.get(1));
		System.out.println(a.size());
		System.out.println(a);
		
		
	}
}

package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("ALLU");
		a.add("ARJUN");
		a.add("SRINATH");
		a.add("RAJU");
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.get(2));
		for(String s:a)
		{
			System.out.println(s);
		}
		Iterator it=a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}

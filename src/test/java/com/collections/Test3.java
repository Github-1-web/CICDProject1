package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Test3 {

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
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		for(Object x:a)
		{
			System.out.println(x);
		}
		Iterator it=a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

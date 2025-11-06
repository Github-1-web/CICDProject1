package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Set1 {

	public static void main(String[] args) 
	{
		HashSet set=new HashSet();
		set.add(100);
		set.add(10.5);
		set.add("Welcome");
		set.add(true);
		set.add('A');
		set.add(100);
		set.add(null);
		set.add(null);
		System.out.println(set);
		set.remove(5);
		System.out.println(set.size());
		ArrayList a=new ArrayList(set);
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		for(Object x:set)
		{
			System.out.println(x);
		}
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

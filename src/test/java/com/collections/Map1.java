package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Map1 {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(111,"Siddhu");
		hm.put(222,"Srinath");
		hm.put(333,"Azhar");
		hm.put(444,"Joshi");
		hm.put(555,"Zaheer");
		hm.put(111,"Prasad");
		System.out.println(hm);
		hm.remove(555);
		System.out.println(hm.get(333));
		System.out.println(hm.entrySet());
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		for(int k:hm.keySet())
		{
			System.out.println(k+" "+hm.get(k));
		}
		Iterator<Entry<Integer,String>> it=hm.entrySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		while(it.hasNext())
		{
			Entry<Integer,String> entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}

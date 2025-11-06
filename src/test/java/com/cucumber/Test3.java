package com.cucumber;

public class Test3 {

	public Test3(String string) 
	{
		
	}

	public static void main(String[] args) 
	{
		Test3 obj1=new Test3("Allu");
		Test3 obj2=new Test3("Allu");
		System.out.println(obj1.equals(obj2));
		
		String s1=new String("Arjun");
		String s2=new String("Arjun");
		System.out.println(s1.equals(s2));
		
		StringBuffer sb1=new StringBuffer("NIT");
		StringBuffer sb2=new StringBuffer("NIT");
		System.out.println(sb1.equals(sb2));
	}

}

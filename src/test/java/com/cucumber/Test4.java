package com.cucumber;

public class Test4 {

	public static void main(String[] args) 
	{
		String s1=new String("Allu");
		String s2="Arjun";
		String s3=s1.concat(s2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		StringBuffer sb1=new StringBuffer("Allu");
		StringBuffer sb2=new StringBuffer("Arjun");
		sb1.append(sb2);
		System.out.println(sb1);
		System.out.println(sb2);
		
	}

}

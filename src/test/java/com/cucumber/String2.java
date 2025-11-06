package com.cucumber;

public class String2 {

	public static void main(String[] args) 
	{
		String s1="Allu";
		String s2="Arjun";
		String s3="Allu";
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s3);
		String str1=new String("Ramesh");
		String str2=new String("Suresh");
		String str3=new String("Raju");
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str1==str3);
	}

}

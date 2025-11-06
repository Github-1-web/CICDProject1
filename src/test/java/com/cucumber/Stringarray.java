package com.cucumber;

public class Stringarray {

	public static void main(String[] args) 
	{
		String[] str= {"Apple","Banana","Orange","Mango"};
		System.out.println(str[2]);
		System.out.println(str.length);
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		for(String s:str)
		{
			System.out.println(s);
		}
		
	}

}

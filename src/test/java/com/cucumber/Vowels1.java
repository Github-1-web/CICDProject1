package com.cucumber;

public class Vowels1 {

	public static void main(String[] args) 
	{
		String str="allu arjun";
		char ch[]=str.toCharArray();
		int vowels_count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				System.out.println(ch[i]);
				vowels_count++;
			}
		}
		System.out.println(vowels_count);
	}

}

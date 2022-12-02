package com.Assigment;

public class Specifiedcharacter 
	{
	public static void main(String[] args) 
	{
		 String str1 = "no", str2 = "name";
		    CharSequence cs = "name";
		     System.out.println("Comparing "+str1+" and "+cs+": " + str1.contentEquals(cs));
		      System.out.println("Comparing "+str2+" and "+cs+": " + str2.contentEquals(cs));
	}
	}

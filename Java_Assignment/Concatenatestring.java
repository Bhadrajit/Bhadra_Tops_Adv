package com.Assigment;

public class Concatenatestring 
{
	public static void main(String[] args)
	{
		String str1 = "no";
        String str2 = "name";
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2); 
       

        // Concatenate the two strings together.
        String str3 = str1.concat(str2);

        // Display the new String.
        System.out.println("The concatenated string:"+ str3);
    }
	}


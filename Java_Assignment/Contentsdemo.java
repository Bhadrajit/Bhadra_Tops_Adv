package com.Assigment;

public class Contentsdemo 
{
	public static void main(String[] args) 
	{
		
        String str1= "white is favorite color.";
        String str2 = "red is also my favorite color.";

        // The String to check the above two Strings to see
        // if they start with this value (white).
        String startStr = "white";

        // Do either of the first two Strings start with startStr?
        boolean starts1 = str1.startsWith(startStr);
        boolean starts2 = str2.startsWith(startStr);

        // Display the results of the startsWith calls.
        System.out.println( str1 + " starts with " +
             startStr + "? " + starts1);
        System.out.println(str2 + " starts with " +
             startStr + "? " + starts2);
	}
}


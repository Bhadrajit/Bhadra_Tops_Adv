package com.Assigment;

import java.util.HashSet;
import java.util.Set;

public class StringDemo 
{
		 public static void Interleavings
		 (String res, String P, String Q, String r, Set < String > out) {
		  if (P.length() == 0 && Q.length() == 0) {
		   out.add(res);
		   return;
		  }
		  if (P.length() > 0)
		  {
		   Interleavings(res + P.charAt(0), P.substring(1), Q, r, out);
		  }
		  if (Q.length() > 0)
		  {
		   Interleavings(res + Q.charAt(0), P, Q.substring(1), r, out);
		  }
		 }

			 public static void main(String[] args) {
			  String P = "XY";
			  String Q = "YZ";
			  String R= "uv";
			  System.out.println("The given strings are: " + P + "  " + Q+ "  " +R +"  ");
			  System.out.println("The interleavings strings are: ");
			  Set < String > out = new HashSet < > ();
			  String  r = null;
			Interleavings("", P, Q, r, out);
			 out.stream().forEach(System.out::println);
			 }
	}


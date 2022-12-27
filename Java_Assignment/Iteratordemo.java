package com.Assigment;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Iteratordemo
{
	public static void main(String[] args) {
		 // Create a empty hash set
	     HashSet<String> h_set = new HashSet<String>();
	   // use add() method to add values in the hash set
	          h_set.add("blue");
	          h_set.add("red");
	          h_set.add("Black");
	          h_set.add("White");
	          h_set.add("Pink");
	          h_set.add("Yellow");

	          // set Iterator 
	          java.util.Iterator<String> p = h_set.iterator();
	        // Iterate the hash set
	         while (p.hasNext()) {
	         System.out.println(p.next());
	         }
	}
	}

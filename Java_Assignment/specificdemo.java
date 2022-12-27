package com.Assigment;

import java.util.ArrayList;

public class specificdemo
{
	public static void main(String[] args) {
			 
		ArrayList<String> colors = new ArrayList<>();
		 
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
 
 
        colors.set(0,"Cyan");
        System.out.println(colors.get(0));
	}
}

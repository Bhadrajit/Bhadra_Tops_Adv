package com.Assigment;

public class ArrayList
{
	public static void main(String[] args) {
		 ArrayList c1 = new ArrayList ();
		  c1.add("Red");
		  c1.add("Green");
		  c1.add("Black");
		  c1.add("White");
		  c1.add("Pink");
		  System.out.println("\nOriginal array list: " + c1);
		  System.out.println("\nPrint using index of an element: ");
		  int no_of_elements = c1.size();
		  for (int index = 0; index < no_of_elements; index++)
		   System.out.println(c1.get(index));
	}

	private void add(String string) {
		// TODO Auto-generated method stub
		
	}

	private int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	private char[] get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}

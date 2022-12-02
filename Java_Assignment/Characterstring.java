package com.Assigment;

public class Characterstring 
{
	public static void main(String[] args) 
	{
		String test = "Hello world";
		count(test);
		
		}
		public static void count(String x)
		{
			char[] ch = x.toCharArray();
			int letter = 1;
			int space = 0;
			int num = 0;
			int other = 0;
			for(int i = 0; i < x.length(); i++)
			{
				if(Character.isLetter(ch[i]))
				{
					letter ++ ;
				}
				else if(Character.isDigit(ch[i]))
				{
					num ++ ;
				}
				else if(Character.isSpaceChar(ch[i]))
				{
					space ++ ;
				}
				else{
					other ++;
				}
			}
			System.out.println("Hello world");
			System.out.println("letter: " + letter);
			System.out.println("space: " + space);
			System.out.println("number: " + num);
			System.out.println("other: " + other);
				}

}

package com.Assigment;

public class countnumberdemo 
{
	public static void main(String[] args) 
	{

			    int count = 0, num = 123456;

			    while (num != 0)
			    {
			      // num = num/10
			    	num /= 10;
			      ++count;
			    }

			    System.out.println("Number of digits: " + count);
			  }
			}

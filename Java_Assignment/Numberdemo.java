package com.Assigment;
import java.util.Scanner;  
public class Numberdemo  
{  
public static void main(String[] args)   
{  
int a, b, c, largest;  
Scanner sc = new Scanner(System.in);    
    System.out.println("Enter the first number:");  
              a = sc.nextInt();  
        System.out.println("Enter the second number:");  
              b = sc.nextInt();  
       System.out.println("Enter the third number:");  
              c = sc.nextInt();
              int temp = 0;
			largest=c>temp?c:temp;  
            //prints the largest number  
            System.out.println("The largest number is: "+largest);   
}
}

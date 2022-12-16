package com.Assigment;

public class Gradedemo {
	public static void main(String[] args) 
	{
		
		// Main Driver Method
	    // User is supposed to enter grade among them
	        System.out.println(
	            "Enter Grade varying from A,B,C,D");
	        
	         String grade = "A";
	        // Checking whether grade == "A" or not
	        if (grade == "A") {
	            System.out.println(
	                "Student has scored between 80 to 90");
	        }
	        
	        // Checking whether grade == "B" or not
	        else if (grade == "B") {
	            System.out.println(
	                "Student has scored between 70 to 80");
	        }
	        // Checking whether grade == "C" or not
	        else if (grade == "C") {
	        	System.out.println(
	                    "Student has scored between 60 to 70");
	            }
	            // Checking whether grade == "D" or not
	            else if (grade == "D") {
	                System.out.println(
	                    "Student has scored between 50 to 60");
	            }
	            else {
	     
	                // Printing message-user pressed some other key
	                System.out.println(
	                    "The grade you entered is not valid!");
	}
	    }
	}


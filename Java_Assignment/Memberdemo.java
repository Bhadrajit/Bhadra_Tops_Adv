package com.Assigment;

import com.Assigment.Memberdemo.Member.Employee;

public class Memberdemo 
{
	class Member{
		  String name;
		  static int age;
		  String number;
		  static String address;
		  int salary;
		private String specialization;

		  public void printSalary(){
		    System.out.println(salary);
		  }
		  class Employee extends Member{
			  public Employee(int string) {
				// TODO Auto-generated constructor stub
			}

			String specialization;
			}

			class Manager extends Member{
			  String department;
			}
			  public static void main(String[] args){
			 Employee e =new Employee();
			     e.name="xyz";	
			    e.age = 23;
			    e.number = "986****";
			    e.address = "xyzxyz";
			    e.salary = 1231;
			  }
	}
}
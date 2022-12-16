package com.Assigment;

public class Complexnumber {
	
	  private double real;
	private double img;

	void ComplexNumber(double r, double i){

	this.real = r;

	this.img = i;

	  }
	public static Complexnumber sum1(Complexnumber c1, Complexnumber c2)

	  {
	       Complexnumber temp = new Complexnumber();

	       temp.real = c1.real + c2.real;

	       temp.img = c1.img + c2.img;
	       //returning the output complex number

	       return temp;
 }
public static void main(String args[]) {

Complexnumber c1 = new Complexnumber();

Complexnumber c2 = new Complexnumber();

      Complexnumber temp = sum1(c1, c2);

      System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");

  }

}



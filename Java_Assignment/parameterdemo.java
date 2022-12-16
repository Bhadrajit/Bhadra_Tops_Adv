package com.Assigment;

public class parameterdemo 
{
	public static  void main(String[] args) 
	{
		 Rectangle obj = new Rectangle();
	        obj.Area(10, 20);
	        obj.Area(11.5, 3.4);
	        
	        Circle obj1 = new Circle();
	        obj1.Area(3);
	        obj1.Area(6.2);
	}
}
class Circle 
{
    static final double PI = Math.PI;
    void Area(double r)
    {
        double A = PI * r * r;
  
        System.out.println("The area of the circle is :" + A);
    }
    
    void Area(float r)
    {
        double A = PI * r * r;
  
        System.out.println("The area of the circle is :" + A);
    }
}
class Rectangle 
{

    void Area(double l, double b)
    {
        System.out.println("Area of the rectangle: " + l * b);
    }
    void Area(int l, int b)
    {
        System.out.println("Area of the rectangle: " + l * b);
    }
}
		        
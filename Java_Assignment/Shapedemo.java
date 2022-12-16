package com.Assigment;

public class Shapedemo {
	public void print_shape(){
        System.out.println("This is a shape!");
    }
}
    class rectangle extends Shapedemo{
        public void print_rect(){
            System.out.println("This is rectangle! ");
        }
    }
    class circle extends Shapedemo{
        public void print_circle(){
            
        }
    }
    class square  extends rectangle{
        public  void print_square(){
            System.out.println("Square is a rectangle");
        }
    
      public static void main(String[] args) {
    	  square sq = new square();
            sq.print_shape();
            sq.print_rect();
        }
	}





package com;
 public class Rectangle {
	
	 	double length, width;
	  
	     Rectangle()
	     {
	         length = 1;
	         width = 1;
	     }

	     Rectangle(double length, double width)
	     {
	         this.length = length;
	         this.width  = width;
	     }
	    
	     double getArea()
	     {
	         return (length * width);
	     }
	    
	    

	     public static void main(String[] args) {
	         Rectangle rect1 = new Rectangle();
	         Rectangle rect2= new Rectangle(15.0,8.0);
	         Rectangle rect3= new Rectangle(1,9);
	         Rectangle rect4= new Rectangle(2.5,1.8);
	         Rectangle rect5= new Rectangle(15.0,8.0);


	         
	         System.out.println("Area of first object="+rect1.getArea());
	         System.out.println("Area of second object="+rect2.getArea());
	         System.out.println("Area of third object="+rect3.getArea());
	         System.out.println("Area of fourth object="+rect4.getArea());
	         System.out.println("Area of fifth object="+rect5.getArea());


	    }
	     
	 }
 

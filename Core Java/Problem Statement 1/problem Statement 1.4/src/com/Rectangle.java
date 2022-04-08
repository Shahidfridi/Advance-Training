package com;

public class Rectangle {

	    public float length;
	    public float width;
	  

	    public Rectangle(float length, float width){

	       if(length < 0.0 || length >= 20.0){
	            throw new IllegalArgumentException("Length must be between 0.0 and 20.0");
	        }
	       if(width < 0.0 || width >= 20.0){
	            throw new IllegalArgumentException("Width must be between 0.0 abnd 20.00");
	        }

	        this.length = length;
	        this.width = width;
	    }


		public float getLength() {
			return length;
		}


		public void setLength(float length) {
			this.length = length;
		}


		public float getWidth() {
			return width;
		}


		public void setWidth(float width) {
			this.width = width;
		}

		
		public float area() {
			return this.length*this.width;
		}
		
		public float perimeter() {
			return (this.length+this.width)*2;
		}
		

	    public static void main(String[] args) {
	    	
	    	System.out.println();
	    	
	    	Rectangle obj=new Rectangle(10, 15);
	    	System.out.println(obj.area());
	    	System.out.println(obj.perimeter());
	    	
	    }
		
		
		
	}


package com;

public class Book {
	
		private String title_book;
		
		private double title_price;

		public String getTitle_book() {
			return title_book;
		}

		public void setTitle_book(String title_book) {
			this.title_book = title_book;
		}

		public double getTitle_price() {
			return title_price;
		}

		public void setTitle_price(double title_price) {
			this.title_price = title_price;
		}
		
		
		public Book(String title_book, double title_price) {
			super();
			this.title_book = title_book;
			this.title_price = title_price;
		}
		public void showbook() {	
			System.out.println( "The book title is " +getTitle_book()+ " The price is "+getTitle_price());
		}

		  public static void main(String argvs[])   {
			  
			  
			  
			  Book[] obj =new Book[3];
			  obj[1]=new Book("python Programe", 200.0);
			  obj[1].showbook();
			  obj[0]=new Book("Java Programming",350.50);
			  obj[0].showbook();
			  obj[2]=new Book ("Let Us C++",250.00);
			  obj[2].showbook();

			  
			  
			  
		  }
		
		
		
	}

			
		
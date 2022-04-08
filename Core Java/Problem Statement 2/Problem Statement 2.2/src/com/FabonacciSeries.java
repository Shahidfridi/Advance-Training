package com;

public class FabonacciSeries {

	public static void main(String[] args) {
		
		int n = 13, firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= 13;i++) {
	      System.out.print(firstTerm + ", ");

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;

	}
	}
}

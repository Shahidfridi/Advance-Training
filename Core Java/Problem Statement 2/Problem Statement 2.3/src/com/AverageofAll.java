package com;

public class AverageofAll {
	
		public static void main(String[] args) {      
	        
		      
			 int A[] = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0}; 
		        int sum = 0;
		      
		        for (int i = 0; i < A.length; i++) {   
		           sum = sum + A[i];
		        }    
		         int avg=(sum/A.length);
		        
		          A[15]= avg;
		          
		          
		        System.out.println("Sum of all the elements of an array: " + avg); 
		        System.out.println("Element present in A[15] is :"+ A[15]);  

		    }  
		}  


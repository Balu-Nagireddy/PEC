package com.training.arrays;

import java.util.Scanner;

public class ExampleOnArray4 {
	public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int rowSize = sc.nextInt();
      int colSize =sc.nextInt();
      
      //declaring an array with size
      int a[][] = new int [rowSize][colSize];

      for(int i=0;i<rowSize;i++) {
    	  for(int j=0;j<colSize;j++) {
    	      System.out.println("Enter the element at specific index position : a["+i+"]["+j+"]");
    		a[i][j]= sc.nextInt();
    	  }
      }
     System.out.println("Displaying the elements from an array a");
      for(int i=0;i<rowSize;i++) {
    	  for(int j=0;j<colSize;j++) {
    		  System.out.print(a[i][j]+" ");
    	  }
    	  System.out.println(" "); 
      }

	}
}

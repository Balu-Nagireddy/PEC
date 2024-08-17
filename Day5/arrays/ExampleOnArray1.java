package com.training.arrays;

public class ExampleOnArray1 {
	public static void main(String[] args) {
		//Declaring and initializing the array
		
		int a[] = {10,20,30,40};
		
		System.out.println(a);//
		System.out.println("No of elements in an array : "+a.length);
		System.out.println("Displaying the elements using for loop");
       for(int i=0;i<a.length;i++) {
    	   System.out.println(a[i]);
       }
		
		System.out.println("Displaying the elements using enhanced forLoop");
		for(int b: a) {
			System.out.println(b);
		}
		
	}
	
	
	

}

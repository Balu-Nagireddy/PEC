package com.training.arrays;

public class ExampleOnArray6 {
      
	//declaring an method which return list of element of type String
	
	public String[] listOfFruits() {
		String fruits[] = {"mango","guva","apple","banana","Orange"};
		return fruits;
	}
	
	public static void main(String[] args) {
		ExampleOnArray6 eoa6 =  new  ExampleOnArray6();
		
		String fts[]=eoa6.listOfFruits();
		System.out.println("Displaying the elements using enhanced for loop");
		for(String f :fts) {
			System.out.println(f);
		}
		
		
	}
	
}

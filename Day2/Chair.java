package com.training;

public class Chair {
	//instance variables
	//chair object properties  are color,material,noOfWheels
	String color="black";
	String material="plastic";
	int noOfWheels=4;
	
	//chair object behaviour or actions  chairMovieable()
	 //seatHeightAdjustable 
	//instance methods
	public void chairMovieable() {
		System.out.println("chair is movieable");
	}
	
	public void seatHeightAdjustable() {
		System.out.println("we can adjust the chair height");
	}
	
	public static void main(String[] args) {
		//to use chair object properties and behaviour we need to create the object
		//for a class
		//Syntax:
		//ClassName referenceName = new ClassName();
		
		Chair  chobj = new Chair();  //creating by using constructor
		
		//accessing the chair properties
		System.out.println("Chair properties are :");
		System.out.println(chobj.color+" "+chobj.material+" "+chobj.noOfWheels);
		
		//accessing the chair actions
		
	    chobj.chairMovieable();
	    chobj.seatHeightAdjustable();
		
		
		
		
		
		
		
		
		
		
	}
	

}

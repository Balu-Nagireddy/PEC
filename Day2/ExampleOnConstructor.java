package com.training;

public class ExampleOnConstructor {
	//instance variables
	int id;
	String name;
	//static variable
	static float pi=3.142f;
	
	//default
	public ExampleOnConstructor() {
		System.out.println("we are in default constructor");
	}
	//parameterized
	public ExampleOnConstructor(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public void display() {
		System.out.println("Details are : ");
		System.out.println(this.id+" "+this.name);
	}
	
	public static void main(String[] args) {
	//creating the object using a default constructor	
		ExampleOnConstructor eoc = new ExampleOnConstructor();
		eoc.display();

	//creating the object using a parameterized constructor
		ExampleOnConstructor eoc1 = new ExampleOnConstructor(1001,"Smith");
		System.out.println("Parameterized Constructor");
		eoc1.display();
		
		
		//creating the object using a default constructor	
				ExampleOnConstructor eoc2 = new ExampleOnConstructor();
				eoc.display();
     System.out.println("static variables is :");
     System.out.println(ExampleOnConstructor.pi);
		
     System.out.println(eoc.hashCode());
		
	}
	
	
	
	

}

package com.training;

public class Cat extends Animal{

   String name="cat";
   
   public void display() {
	   System.out.println("meow meow...");
   }
	
   public static void main(String[] args) {
	
	   Cat c= new Cat();//child class object
	   c.display(); //from child class
	   
	   System.out.println(c.name); //cat
	   c.eat();//parent
	   
	   
	   
}
   
	
}

package com.training;
   
public class ExampleOnConst {
	
	int id;
	String name;
	public ExampleOnConst() {
		// TODO Auto-generated constructor stub
		this(1001,"smith");//ExampleOnCons(int,String);//calling a constructor
		System.out.println("we are in default constructor");
		
	}
	public ExampleOnConst(int id, String name) {
	    System.out.println("we are in parameter constructor");
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println("Details are :");
		System.out.println(this.id+" "+this.name);
	}
	
	public static void main(String[] args) {
		ExampleOnConst eoc2 = new ExampleOnConst();//default constructor
		eoc2.display();
		
		
	}
	
	
	
	

}

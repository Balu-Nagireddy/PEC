package com.training.poly;

public class Mango extends Tree{
	
	String name;
	int height;

	public Mango() {
		System.out.println("we are in default cosntructors of Mango Child class");
	}
	
	public Mango(String name,int height) {
		//super() by default it will call parent class constructor
		super("neem",5);//Tree(String,int);
		System.out.println("we are in Parameter constructor cosntructors of Mango Child class");
		this.name=name;
		this.height=height;
		//super("neem",5);  not vaild
	}
	
	public void  printMangoDetails() {
		System.out.println("Mango Tree Details");
		System.out.println(name+" "+height);
	}
	
	public static void main(String[] args) {
	   Mango mobj = new Mango();
	   mobj.printMangoDetails();
	   
	   
	   Mango mobj1 = new Mango("yello",3);
	   mobj1.printMangoDetails();
	   mobj1.display();
	   
	}
}

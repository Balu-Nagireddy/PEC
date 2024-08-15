package com.training.poly;

public class Tree {
	
	String name;
	int height;

	public Tree() {
		System.out.println("we are in default constructor of Tree class");
	}

	public Tree(String name, int height) {
		System.out.println("we are in parameter constructor of Tree class");
		this.name = name;
		this.height = height;
	}
	public void display() {
		
		System.out.println("Tree Details are : ");
		System.out.println(name+" "+height);
	}
	
	
	

}

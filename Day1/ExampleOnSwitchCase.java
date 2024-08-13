package com.training;

public class ExampleOnSwitchCase {
	
	public static void main(String[] args) {

		int a=10,b=20,c;

		String choice="add";

		switch(choice) {
		case "add" : c=a+b;
		System.out.println("sum of two numbers is : "+c);
		break; //fall through mechanisam
		case "sub" : c=b-a;
		System.out.println("substraction of two numbers is : "+c);
		break;
		case "mod" : c=b%a;
		System.out.println("Modules of two numbers is : "+c);
		break;
		default:System.out.println("Invalid choice");
		}


	}


	

}

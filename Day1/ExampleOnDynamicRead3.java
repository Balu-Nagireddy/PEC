package com.training;

import java.util.Scanner;

public class ExampleOnDynamicRead3 {
	
	public static void main(String[] args) {
		
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the employee id");
	  int empId = sc.nextInt();
	  sc.nextLine();
	  System.out.println("Enter the employee Name");
	 // String empName=sc.next()+sc.nextLine();
	  String empName=sc.nextLine();
	  System.out.println("Enter the employee sal");
	  double empSal=sc.nextDouble();
	  
	  System.out.println("Employee details are : ");
	  System.out.println(empId+" "+empName+" "+empSal);
	  
	  
		
		
		
		
		
	}

}

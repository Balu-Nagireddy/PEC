package com.training;

import java.util.Scanner;

public class ExampleOnDynamicRead {
	
	public static void main(String[] args) {
		
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the employee id");
	  int empId = sc.nextInt();
	  System.out.println("Enter the employee Name");
	  String empName=sc.next();
	  System.out.println("Enter the employee sal");
	  double empSal=sc.nextDouble();
	  
	  System.out.println("Employee details are : ");
	  System.out.println(empId+" "+empName+" "+empSal);
	  
	  
		
		
		
		
		
	}

}

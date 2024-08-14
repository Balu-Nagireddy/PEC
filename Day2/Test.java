package com.training;

public class Test {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		//System.out.println(e.empId); out side class we cannot access private variables and methods
		
		//initialiating the private instance variables
		e.setEmpId(1001);
		e.setEmpName("smith");
		e.setEmpSal(4000);
		
		//calling the privaet instance variables
		System.out.println("Employee Details are  :");
		System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getEmpSal());
		
		
		
	}

}

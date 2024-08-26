package com.training.java8;

public class IciciBankImpl {

	//create a instance method to return Employee object with 
	 //details 1001 smith 4000
	public Employee display() {
		return new Employee(1001,"smith",4000);
	}

	//define main method
// provide instance method reference //for the Interface IciciBank ->SAM
	public static void main(String[] args) {
		IciciBankImpl  icobj= new IciciBankImpl();
		
		//instance methodReference
		IciciBank  iobj = icobj::display;
		
		Employee e=iobj.getDetails();
		System.out.println("Employee Details are");
		System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getEmpSal());
		
		
	}
	
	
	
}

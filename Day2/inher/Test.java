package com.training.inher;

public class Test {

	public static void main(String[] args) {
		
		Address a1 = new Address("hyd","tg",50053);
		//Employee Depends on Address class, first we need to create Address class followed by Employee
		Employee e = new Employee(1001,"smith",3000, a1);
		
		
		System.out.println("Employee detials");
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpSal());
		 Address eaddrs = e.getAddr();
		 System.out.println(eaddrs.getCity());
		 System.out.println(eaddrs.getState());
		 System.out.println(eaddrs.getPincode());
		 
		 
		
		
	}
}

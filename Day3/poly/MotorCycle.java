package com.training.poly;

public class MotorCycle extends Vehicle{
	
	String vehicleName="Motorcycle";
	String vehType="twoWheeler";
	
	public void m2() {
		System.out.println("we are in method Two of Motor cycle class child class");
	}
	
	@Override
	public String  vehicleDetails() {
		return vehicleName+" "+vehType;
	}
	
	public static void main(String[] args) {
	//child  referenceVariable  = new Child();
		MotorCycle mvoc = new MotorCycle();
		String mdetails=mvoc.vehicleDetails();
		System.out.println(mdetails);
		mvoc.m2();//child
		mvoc.m1();//parent
		
		System.out.println("-----------------------------");
	//ParenClass referenName =  new holding child class object
		Vehicle vobj = new MotorCycle();
		String details =vobj.vehicleDetails();//
		System.out.println(details);
		
		vobj.m1();
		//vobj.m2();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

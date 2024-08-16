package com.training.accessmodifier;

public class ExampleOnAccessModifier {

	int empId=1001;//default
	private String empName="smith";
    protected double empSal=4000.0;
    public String compNameName="INFY";
    
    void m4() {
    	System.out.println("we are in default m4 method");
    }
    
    private void m3() {
    	System.out.println("we are in private m3 method");
    }
    
    protected void m2() {
    	System.out.println("we are in protected m2 method");
    }
    
    public void m1() {
    	System.out.println("we are in public m1 method");
    }
    
	/*
	 * public static void main(String[] args) {
	 * 
	 * ExampleOnAccessModifier eoam = new ExampleOnAccessModifier();
	 * System.out.println(eoam.compNameName);//public
	 * System.out.println(eoam.empSal);//protected
	 * System.out.println(eoam.empName);//private
	 * System.out.println(eoam.empId);//default;
	 * 
	 * // eoam.m1();//public eoam.m2();//protected eoam.m3();//private
	 * eoam.m4();//default
	 * 
	
	 * }
	 */
	
	
	
}

package com.training;

public class ExampleOnTypeCasting {

	public static void main(String[] args) {
		//implicit casting
		int i=10;
		System.out.println("I value is : "+i);//10
		
		double d =i; //converting int  type to double
		System.out.println("d value is : "+d);//10.0
		
		char ch ='a';
		System.out.println("ch value is : "+ch);
		
		int chi = ch;
		System.out.println("chi value is : "+chi);
		
		//explicity //higher type to lower type
		
		double d1 =100;
		System.out.println("d1 value is : "+d1);//100.0
		
		char ch2 =(char) d1; //type casting from double to char
		
		System.out.println("After type cast : "+ch2);
		
	   float f1 = 10.0f;
	   System.out.println("f1 is : "+f1);
	   
	   long l =(long) f1;
	   System.out.println("After type cast : "+l);
	   
	   String s ="hello";
	   System.out.println("s value is : "+s);
	   
	   Object o =s;
	   
	   System.out.println("after implicity cast is : "+o);
		
	   String s2 = (String)o;
	   System.out.println("after typecast explicitly is : "+s2);
	
		
	}
}

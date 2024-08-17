package com.training.string;

public class ExampleOnString {
	
	public static void main(String[] args) {
		
		String s ="hello"; //String literal -- //String object in StringConstant pool
		
		String s1 = new String("hello");//String object //Heap memory
		
		String s2 ="hello";
		
		String  s3= new String("welcome");
		
		System.out.println(s==s1);
		System.out.println(s==s2);
		
		System.out.println(s.equals(s1));
		
		System.out.println("hashcode of s: "+s.hashCode());
		System.out.println("hashcode of s2: "+s2.hashCode());
		
		System.out.println("---------------------------");
		String st = new String("Welcome");
		System.out.println("before change : st is : "+st.hashCode());
		st=st.concat(" to PEC");
		System.out.println("After change : st is : "+st.hashCode());
		
		
		
		
		
		
		
		
		
		
		
	}

}

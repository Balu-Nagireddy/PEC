package com.training.string;

public class ExampleOnStringManipulation {

	public static void main(String[] args) {

		String s1 = new String("welcome to PEC");

		System.out.println("No of characters in a given String s1 : "+s1.length());

		char c =s1.charAt(11);

		System.out.println("Character at 11th index is :  "+c);

		//String substring(startindex,endIndex) ---substring(0,5) --->0 1 2 3 4

		String subst =s1.substring(0,7);
		System.out.println("Substring from the s1 from index 0 to 7th position is :  "+subst);

		String subst1 = s1.substring(7);
		System.out.println("Substring from the s1 from 7th position is :  "+subst1);

		String replSt =s1.replace('E','A');
		System.out.println("After replacing the E to A  : "+replSt);

		System.out.println("upper case String is : "+s1.toUpperCase());
		System.out.println("Lower case String is : "+s1.toLowerCase());

		//indexOf()
		String s2 ="Hello World world World";
		int idx =s2.indexOf("World");
		System.out.println("first occurance index of search world will return: "+idx);

		//strip,contains,lastindexOf,startWith....

		String st ="Welcome to nellore welcome to pec welcome to kandukuru";

		String spt[]= st.split(" ");
		System.out.println("Displaying the elements using  enhanced for loop");
		for(String wt:spt) {
			System.out.println(wt);
		}
		String st1 ="Welcome#to#nellore#welcome#to#pec#welcome#to#kandukuru";

		String spt1[]= st1.split("#");
		System.out.println("Displaying the elements using  enhanced for loop");
		for(String wt:spt1) {
			System.out.println(wt);
		}
		
		String se = "hello";
		String se1= new String("Hello");
		String se2= new String("hello");
		System.out.println("Equality : ");
		System.out.println(se.equals(se1));	
		System.out.println(se.equalsIgnoreCase(se1));
		
		String sn ="";
		System.out.println(sn.length());
		if(sn.isBlank()) {
			System.out.println("sn is empty");
		}else {
			System.out.println("sn is not empty");
		}
		
		String sn1=null;
		if(sn1==null) {
			System.out.println("sn is null");
		}else{
			System.out.println("sn is not null");
		}
		
		
		
		
		
				
				
				
				
				
				
				
				
				
				
				
		
		
		
		





	}
}

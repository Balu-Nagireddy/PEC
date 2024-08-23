package com.training.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ExampleOnMap2 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String>  hm = new LinkedHashMap<Integer,String>();
		//adding key,value pairs into Hashmap
		
		hm.put(3,"mango");
		hm.put(1, null);
		hm.put(323,"smith");
		hm.put(23,"allen");
		
		System.out.println("No of objects in hm : "+hm.size());
		System.out.println("Insertion order is preserved based on key");
		System.out.println(hm);
		
		
		
		  //replace an object
		  
		  hm.put(1,"one"); System.out.println("after overwrite the exists value");
		  System.out.println(hm);
		  
		  hm.replace(3,"mango","martin"); System.out.println("after replace");
		  System.out.println(hm);
		  
		  //getting the value based on key using Value get(key) -> String get(Integer);
		  String searchObj =hm.get(323);
		  System.out.println("Value based on key : "+searchObj);
		  
		  //search based on key using conatinsKey(Integer) 
		  boolean b=hm.containsKey(30); System.out.println("Key exists or not ? :"+b);
		  
		  boolean b1 =hm.containsValue("smith");
		  System.out.println("Value exists or not ? "+b1);
		  
		  //remove 
		  String deletedValue =hm.remove(323);
		  System.out.println("After delete based on key : "+deletedValue);
		  System.out.println(hm);
		  
		  //separating keys from the entrySet using Set keySet() 
		  Set<Integer> sobj=hm.keySet(); 
		  System.out.println("keys are : "); 
		  for(int i: sobj) {
		  System.out.println(i); 
		  } ////separating values from the entrySet usingCollection values()
		  
		  Collection<String> c =hm.values(); System.out.println("Values only: ");
		  for(String s:c) { System.out.println(s); }
		  
		  System.out.println("Displaying the pairset using enhanced for loop"); 
		  //weneed to call entrySet() 
		  System.out.println("Key "+" "+ "values are :");
		  for(Entry<Integer,String> entry: hm.entrySet()) {
		  System.out.println(entry.getKey()+" "+entry.getValue()); }
		  
		  System.out.println("Dsisplaying the pair sets using java8 forEach()");
		  
		  hm.entrySet().stream().forEach(entry ->
		  System.out.println(entry.getKey()+" "+entry.getValue()));
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

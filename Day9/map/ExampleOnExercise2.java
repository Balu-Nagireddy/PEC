package com.training.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;

public class ExampleOnExercise2 {
 public static void main(String[] args) {
	
	 LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
	 
	 lhm.put("smith", 50);
	 lhm.put("varun",26);
	 lhm.put("ravi", 36);
	 lhm.put("sagar", 36);
	 lhm.put("navya",30);
	 
	 //get the only ages
	 Collection<Integer> c = lhm.values();
	 
	 //converting into arraylist
	 ArrayList<Integer> ages = new ArrayList<>(c);
	 
	 Collections.sort(ages,Comparator.reverseOrder());
	 System.out.println("after sort");
	 System.out.println(ages);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}

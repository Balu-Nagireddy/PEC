package com.training.map;

import java.util.Collection;
import java.util.TreeMap;

public class ExampleOnExercise {
	public static void main(String[] args) {
		
	   TreeMap<Integer,Student> tm = new TreeMap<Integer,Student> ();
	   
	    Student s1 = new Student(21,"smith",70);
	    Student s2 = new Student(11,"allen",60);
	    Student s3 = new Student(41,"rakesh",90);
	    Student s4 = new Student(31,"martin",50);
	    
	    tm.put(s1.getSid(), s1);
	    tm.put(s2.getSid(), s2);
	    tm.put(s3.getSid(), s3);
	    tm.put(s4.getSid(), s4);
	    System.out.println(tm);
	   
	    System.out.println("Values : ");
	    Collection<Student> c =tm.values();
	    for(Student s:c) {
	    	System.out.println(s.getSid()+" "+s.getSname()+" "+s.getMarks());
	    }
	    
	    
		
		
		
		
	}

}

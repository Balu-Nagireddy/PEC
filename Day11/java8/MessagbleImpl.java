package com.training.java8;

public class MessagbleImpl {
	
public static void main(String[] args) {

//constructor reference using new operator
		
	Messageble msg =Message::new;  
		
	msg.getMessage("Devdas");
	}

}

// program to demostrate final method
package com.coeta.daysix.finalVariable;
// class with final method
public class FinalMethodClass {
	//constructor
		FinalMethodClass(){
			System.out.println("This is Default constructor");
		}
		
		final int a= 100;
		
		// Final method
		
		final void show() {
			System.out.println("Value of a : "+ a);
		}
	

}

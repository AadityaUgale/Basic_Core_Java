package com.tns.dayone;

import java.util.Scanner;

public class Base1 {

	public static void main(String[] args) {
	
		
    Scanner SC =new Scanner(System.in);
	
	String name =SC.nextLine();
	char gender = SC.next().charAt(0);
	int age =SC.nextInt();
	long mobileNo =SC.nextLong();
	double CGPA= SC.nextDouble();
	
	System.out.println("Name :" + name);
	System.out.println("gender  :" + gender);
	System.out.println("age:" + age);
	System.out.println("mobileNo :" + mobileNo);
	System.out.println("CGPA :" + CGPA);

	}

}

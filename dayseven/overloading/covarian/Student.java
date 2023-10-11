//Program to define class with Covariant method Overriding
package com.coeta.dayseven.overloading.covarian;

public class Student implements cloneable {
	int rollNo;
	String classname;
	String name;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//class constructor
		public Student(int rollNo, String classname, String name) {

			this.rollNo = rollNo;
			this.classname = classname;
			this.name = name;
		}
		//Print method
		public void printData()
		{
			System.out.println("name  : " + name + ", Roll No : "+ rollNo + " class name" + classname);
		}
		//Override the clone method
		
		@Override
		public Object clone() throws CloneNotSupportedException{
			
			return super.clone();
		}
		

}

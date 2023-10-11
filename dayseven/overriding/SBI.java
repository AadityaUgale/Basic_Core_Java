// Program to demonstrate method overriding_Run time polymorphism
package com.coeta.dayseven.overriding;

public class SBI extends RBI {
	@Override
	public float getRateOfInterest() {
		return 7.0f;
	}
	public SBI getObject()
	{
		return this;
	}
	

}

package com.app.sunbeam;

public class Manager implements Emp {
double da;
double bs;
public Manager(double da, double bs) {
	
	this.da = da;
	this.bs = bs;
}
@Override
public double getsal() {
	
	return bs+da;
}
@Override
	public double calcIncentives() {
		
		return 0.2*bs;
	}
}

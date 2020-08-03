package com.task.constructor.may21year2020;

public class Reporter {
	
	public Reporter() {
		System.out.println("This Reporter method is the default constructor");
	}
	
	public Reporter(String Name) {
		System.out.println("The Best news anchor of zee news :" +Name);
	}
	public Reporter (String Na,int Salary) {
		System.out.println("The Best news anchor for AAJ TAK : "+Na);
		System.out.println("The Annual Salary of Shweta Singh : "+Salary);
	}

	public static void main(String[] args) {
		Reporter r=new Reporter();
		Reporter r1=new Reporter("Sushir Chaudhary");
		Reporter r2=new Reporter("Shweta Singh ",10000000);



	}

}

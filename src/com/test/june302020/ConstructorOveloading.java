package com.test.june302020;

public class ConstructorOveloading {
	
	public  ConstructorOveloading() {
		this(11);
		System.out.println("Default Constructor Overloading");
	}
	public  ConstructorOveloading(int a) {
		System.out.println("The Given integer value for the ConstructorOveloading is  " +a);
	}
	public  ConstructorOveloading(String str) {
		this(12);
		System.out.println("The given String for ConstructorOveloading is : "+str);
		//this(11);

	}

	public static void main(String[] args) {
		ConstructorOveloading cov=new ConstructorOveloading();
		ConstructorOveloading cov1=new ConstructorOveloading(10);
		ConstructorOveloading cov2=new ConstructorOveloading("Chennai");


	}

}

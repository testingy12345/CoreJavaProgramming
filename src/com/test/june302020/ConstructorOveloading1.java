package com.test.june302020;

public class ConstructorOveloading1 extends ConstructorOveloading {
	
	public ConstructorOveloading1() {
		super("Coimbator");
		System.out.println("Default constructor for derived class");
	}
	//Note :1st parent c con get executed (string) then child class cons(default)

	public static void main(String[] args) {
		ConstructorOveloading1 cv1=new ConstructorOveloading1();
		

	}

}

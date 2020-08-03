package com.constructor.may21year2020;

public class EmpName extends EmpDetails{
	//Note:Without extending if we are trying to use extend super class it will throw an error .
	public EmpName() {
		super("Aditi","Tyagi");
		//this(10);
		System.out.println("Employee name is Vipin");
		
	}
	public EmpName(int a) {
		this("Aman");

		System.out.println("Parameterized Constructor :" +a);
		
	}
	public EmpName(String name) {
		//this("Aditi", "Tyagi");
		System.out.println("Parameterized constructor with one String :" +name);
		
	}
	
	public EmpName(String fname,  String lname) {
		System.out.println("Parametrized Constructor with 2 String :" +fname   +lname);
		
	}

	public static void main(String[] args) {
		EmpName em=new EmpName();
		EmpName em1=new EmpName("Alex");
		EmpName em2=new EmpName("Simon","Dull");
        
	}

}

package com.constructor.may21year2020;

public class EmpDetails {
	public EmpDetails(){
		System.out.println("Child class Default Constructors");
		
	}
	public EmpDetails(int a){
		System.out.println("Parameterized Constructors :"+a);
		
	}
	public EmpDetails(String s,String s1){
		System.out.println("Parameterized Constructors :"+s);
		System.out.println("Parameterized Constructors :"+s1);

		
	}
	public static void main(String[] args) {
		EmpDetails em=new  EmpDetails();
		EmpDetails em1=new  EmpDetails(50);
		EmpDetails em2=new  EmpDetails("Vipin","Tekade"); 
	}

}

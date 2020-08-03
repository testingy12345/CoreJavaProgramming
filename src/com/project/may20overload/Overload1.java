package com.project.may20overload;

public class Overload1 {
	
	public void method1(String name) {
		System.out.println(name);
		
	}
	
	public void method1(int idcard) {
		System.out.println(idcard);

	}

	public void method1(String surname,String lastname) {
		//System.out.println(surnamelastname);
		
	}
	public void method1(String surname,int lastname) {
		
	}
	public void method1(int surname,String lastname) {
		
		
	}
	public void addition(int a) {
		System.out.println("Hi all" +  a);
	}

	public static void main(String[] args) {
		Overload1 ol=new Overload1();
		ol.method1("Vipin");
		ol.method1("Kumar","Sanga");
		

	}

}

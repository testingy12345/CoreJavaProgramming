package com.abstract1.bank;

public class ClassB implements SBIBank{

	@Override
	public void method1() {
		System.out.println("5%");
		
		
	}

	@Override
	public void method2() {
		System.out.println("7%");

		
		
	}

	@Override
	public void method3() {
		System.out.println("4%");

		
	}
	public static void main(String[] args) {
		ClassB dd=new ClassB();
		dd.method1();
		dd.method2();
		dd.method3();
		
	}

}

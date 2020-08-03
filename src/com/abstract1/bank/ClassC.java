package com.abstract1.bank;

public class ClassC implements IndianBank,SBIBank{
	//It is the concept of multiple inheritance 
	//It is possible to achieve multiple inheritance in java ?
	//It is not possible to achieve multiple inheritance in java
	//Using class level we can't able to achieve but using interface level we can achieve  multiple inheritance .

	@Override
	public void method1() {
		System.out.println("87%");
		
	}

	@Override
	public void method2() {
		System.out.println("91%");

		
	}

	@Override
	public void method3() {
		System.out.println("71%");

		
	}

	@Override
	public void depoSit() {
      System.out.println("Deposite 1CR");		
	}

	@Override
	public void withDraw() {
	      System.out.println("WithDraw 50Lakh");		

	}

	@Override
	public void balanCe() {
		System.out.println("Balance 50Lakh");		
	}
	
	public static void main(String[] args) {
		ClassC c=new ClassC();
		c.depoSit();
		c.withDraw();
		c.balanCe();
		
	}
	

}

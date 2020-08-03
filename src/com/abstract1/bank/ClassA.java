package com.abstract1.bank;

public class ClassA extends ReserveBank{

	@Override
	public void saving() {
		System.out.println("5%");
		
	}

	@Override
	public void fixed() {
		System.out.println("7%");
		
	}

	@Override
	public void demat() {
		System.out.println("4%");
		
	}
	public static void main(String[] args) {
		ClassA ff=new ClassA();
		ff.saving();
		ff.fixed();
		ff.demat();
		
		
	}

}

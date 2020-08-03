package com.inheritance.lockdown;

public class LockDown2ndStage extends LockDown1stStage{
	
	public void lockDownStage2() {
		System.out.println("After LockDown Stage 1.0 Indian PM Narendra Modi Announced LockDown 2.0 from 14-04-2020  to 3-05-2020");
	}

	public static void main(String[] args) {
		LockDown2ndStage ld2=new LockDown2ndStage();
		ld2.jantaCurfew();
		ld2.lockDownStage1();
		ld2.lockDownStage2();
		
		
		

	}

}

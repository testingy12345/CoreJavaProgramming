package com.project.may20override;

public class ATM extends Bank {
	@Override
	public void saving(int a) {
		super.saving(a);
		System.out.println("Previous Script Executed");
		
		int b=1000;
		System.out.println("deposit : " +b);
		
		int c=b+a;
		System.out.println("Total Amount :"  +c);
		
	}
     public static void main(String[] args) {
    	 ATM aa=new ATM();
    	 aa.saving(32293);
		
	}
}

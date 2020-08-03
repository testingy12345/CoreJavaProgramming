package com.task.may20th2020override;

public class India extends IPL{
	@Override
	public void inagurationDLFYear(int y) {
		super.inagurationDLFYear(y);
		System.out.println("Previous Script Executed");
		 
		int b=2009;
		System.out.println("SA host the IPL2 inaguration in "+b);
		
		int x=2014;
		System.out.println("UAE host initial matches of IPL in the year "+x);
	}
	

	public static void main(String[] args) {
		India ind=new India();
		ind.inagurationDLFYear(2008);
		
	}

}

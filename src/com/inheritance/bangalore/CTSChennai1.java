package com.inheritance.bangalore;

public class CTSChennai1 extends CTSBangalore1{
	
	public void ctsChennaiEmp() {
		System.out.println("This is CTS Chennai Employee of DLF IT Park");
	}

	public static void main(String[] args) {
		CTSChennai1 ctsc=new CTSChennai1();
		ctsc.ctsChennaiEmp();
		ctsc.ctsEmp1();
		ctsc.ctsEmp2();
	}

}

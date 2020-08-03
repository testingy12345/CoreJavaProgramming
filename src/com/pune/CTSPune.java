package com.pune;

import org.bangalore.CTSBangalore;
import org.bangalore.CTSChennai;

public class CTSPune {
	
	public void ctsPune() {
		System.out.println("This is CTS Pune Emplyoees");
	}

	public static void main(String[] args) {
		CTSPune cp=new CTSPune();
		cp.ctsPune();
		
		CTSChennai  che=new CTSChennai();
		che.ctsChennaiEmp();
		
		CTSBangalore cts=new CTSBangalore();
		cts.ctsEmp1();
		cts.ctsEmp2();

	}

}

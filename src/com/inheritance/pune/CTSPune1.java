package com.inheritance.pune;

import com.inheritance.bangalore.CTSChennai1;

public class CTSPune1 extends CTSChennai1 {
	
	public void ctsPuneEmp() {
		System.out.println("This is CTS pune Employee of Hinjewadi IT Park");
	}

	public static void main(String[] args) {
		CTSPune1 ctsp=new CTSPune1();
		ctsp.ctsPuneEmp();
		ctsp.ctsChennaiEmp();
	}

}

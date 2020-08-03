package com.inheritance.lockdown1;

import com.inheritance.lockdown.LockDown2ndStage;

public class LockDown3rdand4thstage  extends LockDown2ndStage{

	public void lockDownstage3() {
		System.out.println("After LockDown Stage 2.0 Indian PM Narendra Modi Announced LockDown 3.0 from 4-05-2020  to 17-05-2020");

	}
	public void lockDownstage4() {
		System.out.println("After LockDown Stage 3.0 Indian PM Narendra Modi Announced LockDown 4.0 from 17-05-2020  to 31-05-2020");


	}

	public static void main(String[] args) {
		LockDown3rdand4thstage ldk3and4=new LockDown3rdand4thstage();
		ldk3and4.lockDownStage2();
		ldk3and4.lockDownstage3();
		ldk3and4.lockDownstage4();
	}

}

package com.control.statement;

public class CntrlStmtDoWhile {
	public void doWhile() {
		int i=9;
		do
		{
			System.out.println("Value of i is :" +i);
			i++;
		}
		while(i<15);
			
				
	}

	public static void main(String[] args) {
		CntrlStmtDoWhile cdo=new CntrlStmtDoWhile();
		cdo.doWhile();

	}

}

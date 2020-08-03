package com.task.switchcase.may262020;

import java.util.Scanner;

public class CharecterTaskSwitchCase {
	public void charSwitchCase() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the company Name:- ");

		String ss=s.next();
		char c=ss.charAt(0);
		
		switch(c) {
		
		case 'I':
			System.out.println("The company name is INFOSYS");
			break;
		case 'T':
			System.out.println("The company name is TATA CONSULTANCY SERVICES");
			break;

		case 'W':
			System.out.println("The company name is WIPRO");
			break;

		case 'C':
			System.out.println("The company name is CAPGEMINI");
			break;

		case 'S':
			System.out.println("The company name is CTS");
			break;

		case 'G':
			System.out.println("The company name is CGI");
			break;

		default:
			System.out.println("Company not exits");
			System.out.println("FAKE COMPANY");
			
		}
		System.out.println("Switch case executed :");

		
	}

	public static void main(String[] args) {
		CharecterTaskSwitchCase ctsc=new CharecterTaskSwitchCase();
		ctsc.charSwitchCase();

	}

}

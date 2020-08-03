package com.ctrlstmt.switchase;

import java.util.Scanner;

public class SwitchCase {

	public void switchmethod() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to display the value ");
		//int l=s.nextInt();
		String ss=s.next();
		char c=ss.charAt(0);

		//switch(l)
		switch(c)

		{
		case 'M':
			System.out.println("MON");
			break;

		case 'T':
			System.out.println("TUE");
			break;
		/*case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;*/
		case 3:
			System.out.println("WED");
			break;

		case 4:
			System.out.println("THU");
			break;

		case 5:
			System.out.println("FRI");
			break;

		case 6:
			System.out.println("SAT");
			break;

		case 7:
			System.out.println("SUN");
			break;
			
		default:
			//System.out.println("Number Not exit in switch case");
			System.out.println("Charecter does Not exit in switch case");





		}
		System.out.println("Switch case executed :");

	}

	public static void main(String[] args) {
		SwitchCase sc=new SwitchCase();
		sc.switchmethod();

	}

}

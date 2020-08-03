package org.datatype;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your ATM pin");
		int pinno=obj.nextInt();
		System.out.println("Enter your ATM pin  :" +pinno);
		//obj.nextInt();
		System.out.println("Enter your ph no    :");
		long phno=obj.nextLong();
		System.out.println("Enter your ph no    :" +phno + "  "+"ph number is displayed");
		String option=obj.next();
		System.out.println("Enter the option for Current/Saving  :" +option);
		System.out.println("Enter the amount of withdraw");
		float amount=obj.nextFloat();
		System.out.println("Enter the amount of withdraw   :"+amount);
		//System.out.println("do you need to continue y/n");
		//obj.nextBoolean();
		System.out.println("do you need to continue y/n  : ");
		boolean yes=obj.nextBoolean();
		System.out.println("do you need to continue y/n  : "+yes);

		
		
	}

}

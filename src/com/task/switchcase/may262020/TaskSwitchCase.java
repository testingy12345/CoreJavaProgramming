package com.task.switchcase.may262020;

import java.util.Scanner;

public class TaskSwitchCase {
	public void taskSwitchcase() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to display the value ");

		int i=s.nextInt();
		switch(i) {
		case 1:
			System.out.println("JAN");
			break;
		case 2:
			System.out.println("FEB");
			break;

		case 3:
			System.out.println("MAR");
			break;

		case 4:
			System.out.println("APR");
			break;

		case 5:
			System.out.println("MAY");
			break;

		case 6:
			System.out.println("JUNE");
			break;

		case 7:
			System.out.println("JUL");
			break;

		case 8:
			System.out.println("AUG");
			break;

		case 9:
			System.out.println("SEP");
			break;

		case 10:
			System.out.println("OCT");
			break;

		case 11:
			System.out.println("NOV");
			break;

		case 12:
			System.out.println("DEC");
			break;

			
		}
		System.out.println("Switch case executed :");
	}
	

	public static void main(String[] args) {
		TaskSwitchCase tsw=new TaskSwitchCase();
		tsw.taskSwitchcase();
		
		

	}

}

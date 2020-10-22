package com.additionaltask.array.septmber162020;

import java.util.Scanner;

public class ScannerClassArray {

	public static void main(String[] args) {
		int[] i=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("The Given 5 integer of an element are as follows ");
		
		for (int j = 0; j < i.length; j++) {
			i[j]=s.nextInt();
			}
		System.out.println("You have entered the given integer are");
		
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
			
		}
		
		
		

	}

}

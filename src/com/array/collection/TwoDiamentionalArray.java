package com.array.collection;

public class TwoDiamentionalArray {

	public static void main(String[] args) {
		int xx[][]=new int[3][3];
		xx[0][0]=10;
		xx[0][1]=15;
		xx[1][0]=20;
		xx[1][1]=35;
		int l=xx.length;
		System.out.println("The length of the array is :=>" +l);
		System.out.println(xx[0][0]+ " " +xx[0][1] +" "+xx[1][0] +" "+xx[1][1]);
		for (int i = 0; i < xx.length; i++) {
			System.out.println(i);
		}

	}

}

package com.array.collection;

public class OneDiamentional {

	public static void main(String[] args) {
		int a[]= {1,2,5,8,9};
		System.out.println(a[4]);
		int b[] ;
		b=new int[3];
		//or
		int c[]=new int[5];
		c[0]=10;
		c[1]=20;
		c[2]=45;
		c[3]=78;
		c[4]=47;
		System.out.println(c[4]);
		int l=c.length;
		System.out.println("The length of the array is :=>" +l);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
			
		}
		
		

	}

}

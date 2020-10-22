package com.additionaltask.array.septmber162020;

public class SmallestSortElementArray {
	public static  int getSmallestSortElementArray(int[]c,int d) {
		int tmp;
		for (int i = 0; i < d; i++) {
			for (int j = i+1; j < d; j++) {
				
				if(c[i]>c[j]) {
					tmp=c[i];
					c[i]=c[j];
					c[j]=tmp;
					
				}
			}
			
		}
	
		return c[0];
	}

	public static void main(String[] args) {
		int [] c= {45,9,2,457};
		System.out.println("Smallest sorted Element of Array is :"+getSmallestSortElementArray(c,4));

	}

}

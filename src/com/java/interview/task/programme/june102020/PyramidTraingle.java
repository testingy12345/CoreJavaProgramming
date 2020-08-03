package com.java.interview.task.programme.june102020;

public class PyramidTraingle {
	
	public void star(int n) {
		
		for (int i = 0; i < n; i++) {
			for (int j = n-i; j >1; j--) {
				System.out.print(" ");
				
			}
			
			for (int k = 0; k < i; k++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PyramidTraingle pt=new PyramidTraingle();
		pt.star(8);

	}

}

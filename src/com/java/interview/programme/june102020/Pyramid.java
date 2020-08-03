package com.java.interview.programme.june102020;

public class Pyramid {
	
	public void star(int n) {
		for (int i = 0; i<=n; i++) {
			
			/*for(int j=0 ;j<i ;j++) {
			System.out.print("* ");
			}*/
			for(int j=5 ;j>=i ;j--) {
				System.out.print("* ");
				}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Pyramid p=new Pyramid();
		p.star(5);

	}

}

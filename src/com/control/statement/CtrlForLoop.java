package com.control.statement;

public class CtrlForLoop {
	public void forLoop() {
		int n=10;
	/*	for (int i = 0; i <=n; i++) {
			System.out.println(i);
		}*/
		
		for(int j=4 ;j< n ;j++) {
			System.out.println("for loop result of j is :"+j);
			//Nested For Loop
			for(int k=2;k<n;k++) {
				System.out.println("Value of for Loop for k is :" +k);
				
			}
				for(int a =3;a<n ;a++) {
					System.out.println("Value of for Loop for a is :" +a);
				}
		
		}
	}

	public static void main(String[] args) {
		CtrlForLoop cf=new CtrlForLoop();
		cf.forLoop();
	}

}

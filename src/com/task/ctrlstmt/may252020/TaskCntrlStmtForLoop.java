package com.task.ctrlstmt.may252020;

public class TaskCntrlStmtForLoop {
	public void forLoop() {
		int n=5;
		String s= "d";
		
		for(int a=0;a<n;a++) {
			System.out.println("Result of for Loop for a is :" +a);
			
			for(int b=1;b<n;b++) {
				System.out.println("Result of for Loop for b is :"+b);
			}
			for(int c=2 ;c<n ;c++) {
				System.out.println("Result of for Loop for c is :"+c);
				
			}
			for(int d=3;d<n;d++) {
				System.out.println("Result of for Loop for d is :"+d);
				
			}
			for(int e=4 ;e<n ;e++) {
				System.out.println("Result of for Loop for e is :" +e);
			}
			
			
		}
	}

	public static void main(String[] args) {
		TaskCntrlStmtForLoop  tfor=new TaskCntrlStmtForLoop();
		tfor.forLoop();

	}

}

package com.control.statement;

public class ControlStatement {
	public void controlstmt() {
		int i=10;
		//int i1=8 ;
		
			
		
		if(i==9) {
			System.out.println("The Value of i is equal to 9");
		}
		else if(i==10) {
			if(i<5) {
				System.out.println("i is less than 5");
			}
			else {
				System.out.println("i is greater than 5");
			}
			System.err.println("The Value of i is : "+i);
		}
		
	/*	if(i==8) {
			System.out.println("The value of i is equal to :"+i);
		}*/
	/*	else {
			System.out.println("The Value of i is not equal to :"+i);
		}	*/	
	}
	

	public static void main(String[] args) {
		ControlStatement cs=new ControlStatement();
		cs.controlstmt();

	}

}































































package com.ctrlstmt.switchase;

public class BreakContinueStmt {
		
		public void breakContinueStmt() {
			int n=10;
			//System.exit(0);

			for(int j =0 ;j<n ;j++) {
				if(j==6) {
					//break;
					//continue;
					System.exit(0);
				}
				System.out.println(j);
			}
			System.out.println("Outside for Loop");
			System.out.println("Statement after for Loop");
		}
	

	public static void main(String[] args) {
		BreakContinueStmt bc=new BreakContinueStmt();
		bc.breakContinueStmt();

	}

}

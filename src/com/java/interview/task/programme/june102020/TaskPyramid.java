package com.java.interview.task.programme.june102020;

public class TaskPyramid {
	
	public static void star(int n) {
		for (int i = 0; i <n; i++) {
			for (int j =n-1; j>1;j--) {

				System.out.print(" ");
				

			}
			for(int j=0 ;j<=i;j++) {
				System.out.print("* ");
			
			
			}
			System.out.println();


		}

	}

	public static void main(String[] args) {
		int n=7;
		star(n);
		//System.out.println(n);
		//TaskPyramid tp=new TaskPyramid();
		//tp.star(7);

	}
	
/*	 public static void printTriagle(int n) 
	    { 
	        // outer loop to handle number of rows 
	        //  n in this case 
	        for (int i=0; i<n; i++) 
	        { 
	  
	            // inner loop to handle number spaces 
	            // values changing acc. to requirement 
	            for (int j=n-i; j>1; j--) 
	            { 
	                // printing spaces 
	                System.out.print(" "); 
	            } 
	   
	            //  inner loop to handle number of columns 
	            //  values changing acc. to outer loop 
	            for (int j=0; j<=i; j++ ) 
	            { 
	                // printing stars 
	                System.out.print("* "); 
	            } 
	   
	            // ending line after each row 
	            System.out.println(); 
	        } 
	    } 
	      
	    // Driver Function 
	    public static void main(String args[]) 
	    { 
	        int n = 7; 
	        printTriagle(n); 
	    } */

}

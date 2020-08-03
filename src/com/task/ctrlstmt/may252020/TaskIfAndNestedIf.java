package com.task.ctrlstmt.may252020;

public class TaskIfAndNestedIf {
	
	public void nestedIf() {
		int i=99;
		String str="Virtusa";
		if(i==99) {
			System.out.println("The Value of i is equal to  :" +i);
		}
		else if(i==100){
			if(i<97) {
				System.out.println(" i is Less than 97");
			}else {
				System.out.println("i is greater than 97");
			}
			System.err.println("The value of i is  equal to  :"+i);
			
		}
		
	/*	if(str=="Infosys") {
			System.err.println("The value of string is not equal to : "+str);
			
		}else {
			System.out.println("The value of string is  equal to : "+str);
		}*/
	}

	public static void main(String[] args) {
		TaskIfAndNestedIf tnif=new TaskIfAndNestedIf();
		tnif.nestedIf();

	}

}

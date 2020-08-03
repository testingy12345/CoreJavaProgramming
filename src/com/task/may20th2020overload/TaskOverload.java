package com.task.may20th2020overload;

public class TaskOverload {
	static String Address="Roopena Agahara Benguluru" ;
	static int PINCODE=560068;
	 
	public void empName(String Name) {
		System.out.println(Name);
		
	}
	public void empId(int id) {
		System.out.println(id);
	}
	public void companyName(String comp) {
		System.out.println(comp);
		
	}
	public void empSalary(int Salary) {
		System.out.println(Salary);
	}
	public void postDepartment(String d) {
		System.out.println("I Belong to the :"+d);
		
	}
	
	public static void empAddress(String Address,int PINCODE) {
		System.out.println("String Address : " +Address );
		System.out.println("int PINCODE : " +PINCODE);
		
	}

	public static void main(String[] args) {
		TaskOverload to=new TaskOverload();
		to.empName("Vipin");
		to.empId(8064878);
		to.companyName("Virtusa consulting Services Pvt Ltd");
		to.empSalary(89657);
		empAddress(Address, PINCODE);
		
		

	}

}

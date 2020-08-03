package com.task.may20th2020overload;

public class TaskOverride extends TaskOverload{
	@Override
	public void postDepartment(String d) {
		super.postDepartment(d);
		System.out.println("Start Execution of Override Script");
		System.out.println("I Belong to the QA Department");
		
	}

	public static void main(String[] args) {
		
		TaskOverride tov=new TaskOverride();
		tov.postDepartment("QA DEPARTMENT");

	}

}

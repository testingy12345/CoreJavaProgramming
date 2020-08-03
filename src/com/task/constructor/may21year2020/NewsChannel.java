package com.task.constructor.may21year2020;

public class NewsChannel extends Reporter{
	public NewsChannel() {
		System.out.println("This is the Best News Channel Default Constructor");
	}
	public NewsChannel(int a) {
		System.out.println("The Best News Anchor Salary is :" +a);
	}
	public NewsChannel(String s) {
		System.out.println("The Best News Anchor for NDTV is :" +s);
		
	}
	public NewsChannel(String fname ,String lname,int Salary) {
		System.out.println("The First Name for the best news anhor for Zee News : "+fname);
		System.out.println("The Last Name for the best news anhor for Zee News : "+lname);
		System.out.println("The Salary for the best news Anchor for Zee News  : " +Salary);

		
		
	}
	

	public static void main(String[] args) {
		NewsChannel nl=new NewsChannel();
		NewsChannel n2=new NewsChannel(10000000);
		NewsChannel n3=new NewsChannel("RAVISH KUMAR");
		NewsChannel n4=new NewsChannel("SUDHIR","CHAUDHARY",10000000);


	}

}

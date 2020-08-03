package com.task.constructor.may21year2020;

public class NewsChannelThisKeyword extends Reporter{

	public NewsChannelThisKeyword() {
		this(10000000);
		System.out.println("This is the Best News Channel Default Constructor");
	}
	public NewsChannelThisKeyword(int a) {
		this("RAVISH KUMAR");
		System.out.println("The Best News Anchor Salary is :" +a);
	}
	public NewsChannelThisKeyword(String s) {
		this("SUDHIR","CHAUDHARY",10000000);
		System.out.println("The Best News Anchor for NDTV is :" +s);
		
	}
	public NewsChannelThisKeyword(String fname ,String lname,int Salary) {
		System.out.println("The First Name for the best news anchor for Zee News : "+fname);
		System.out.println("The Last Name for the best news anchor for Zee News : "+lname);
		System.out.println("The Salary for the best news Anchor for Zee News  : " +Salary);

		
		
	}
	

	public static void main(String[] args) {
		NewsChannelThisKeyword nl=new NewsChannelThisKeyword();
	/*	NewsChannel n2=new NewsChannel(10000000);
		NewsChannel n3=new NewsChannel("RAVISH KUMAR");
		NewsChannel n4=new NewsChannel("SUDHIR","CHAUDHARY",10000000);*/


	}
}

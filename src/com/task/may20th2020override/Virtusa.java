package com.task.may20th2020override;

public class Virtusa {
	final static String s="I have Joined Virtusa on June 19";
	static String s1="28-06-2019";
	
	public final static void xyz() {
		System.out.println(s);
		s1="It is located in RMZ Bangalore";
		System.out.println(s1);
		
	}
	public void tier() {
		s1="I Belong to Tier 4";
		System.out.println(s1);
		
	}
	
	public void location() {
		System.out.println(s1);
	}
	

	public static void main(String[] args) {
		Virtusa v=new Virtusa();
		xyz();
		v.tier();
		v.location();
	}

}

package com.weekdays;

public class WeekDays {
	
	public void monDay() {
		
		System.out.println("This is Monday");
		
	}
	
	public void tuesDay() {
		
		System.out.println("This is Tuesday");
	}
	
	public void wednesDay() {
		System.out.println("This is Wednesday");
	}

	public static void main(String[] args) {
		WeekDays wk=new WeekDays();
		wk.monDay();
		wk.tuesDay();
		wk.wednesDay();
		
	}

}

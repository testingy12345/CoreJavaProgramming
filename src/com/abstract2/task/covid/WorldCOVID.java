package com.abstract2.task.covid;

public class WorldCOVID implements IndiaCovidStates,ChinaCOVID{

	@Override
	public void casesInIndia() {
	       System.out.println("The total COVID cases in India was more than 1Lakh");		

		
	}

	@Override
	public void recoverdInIndia() {
		System.out.println("The total COVID recovered cases in India 39174");

		
	}

	@Override
	public void death() {
		System.out.println("The total COVID death cases in India 3163");		

		
	}

	@Override
	public void activeCases() {
		System.out.println("The total COVID active cases in India are 58,000");		

		
	}

	@Override
	public void highestCases() {
		System.out.println("The Highest no of Cases in india was registed in Maharasta State");
		
	}

	@Override
	public void secondHighest() {
		System.out.println("The Second Highest no of Cases in india was registed in Gujrat State");

		
	}

	@Override
	public void thirdHighest() {
		System.out.println("The Third Highest no of Cases in india was registed in TN State");

		
	}
	public static void main(String[] args) {
		WorldCOVID wc=new WorldCOVID();
		wc.casesInIndia();
		wc.recoverdInIndia();
		wc.death();
		wc.activeCases();
		wc.highestCases();
		wc.secondHighest();
		wc.thirdHighest();
		
	}

}

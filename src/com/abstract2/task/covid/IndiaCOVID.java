package com.abstract2.task.covid;

public class IndiaCOVID implements ChinaCOVID {

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
	 public static void main(String[] args) {
		 IndiaCOVID ic=new IndiaCOVID();
		 ic.casesInIndia();
		 ic.recoverdInIndia();
		 ic.death();
		 ic.activeCases();
		 
	}

}

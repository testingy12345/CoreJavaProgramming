package com.abstract2.task.covid;

public class COVID19 extends COVID {

	public static void main(String[] args) {
		COVID19 co=new COVID19();
		co.symbol();
		co.infectedPeople();
		co.death();
		
	}

	@Override
	public void symbol() {
		System.out.println("Corona Virus was abbrivated as COVID-19");		
	}

	@Override
	public void infectedPeople() {	
		System.out.println("In China total corona virus cases are 84,000");		

	}

	@Override
	public void death() {
		System.out.println("In China total death due to corona virus are 3142");
	}

}

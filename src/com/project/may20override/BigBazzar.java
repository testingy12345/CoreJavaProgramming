package com.project.may20override;

public  class BigBazzar {
	final int i=10;
	static int j=20;
	
	public final static void abc1() {
		System.out.println(j);
		//int x=j+j;
		j=10+20;
		System.out.println(j);
	}
	public void abc() {
		//int x=j+j;
		j=10+20;
		System.out.println(j);
	}
	
	public void xyz() {
		System.out.println(j);
	}
	public static void main(String[] args) {
		BigBazzar b=new BigBazzar();
		b.abc();
		b.xyz();
		abc1();
		
	}

}

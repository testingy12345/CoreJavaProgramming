package com.project.may20overload;

public class Override1 extends Overload1{
	@Override
/*	public void method1(int idcard) {
		super.method1(idcard);
		
	}*/
	
	public void addition(int a) {
		super.addition(a);
		System.out.println("Started Execution of override script");
		int b=20;
		int c=a+b;
		System.out.println(c);
		
		
	}
	public static void main(String[] args) {
		Override1 od=new Override1();
		od.addition(20);
		
	}
	

}
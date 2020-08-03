package com.typecasting.june22020;

public class ChildClass extends ParentClass{
	
	public  void childMethod()
	{
		System.out.println("Child Method");
		
	}
	@Override
   public void parentMethod() {
		System.out.println("Override Method");
		super.parentMethod();
		
	}
}

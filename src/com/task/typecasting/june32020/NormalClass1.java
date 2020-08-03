package com.task.typecasting.june32020;

public class NormalClass1 {
	public static void main(String[] args) {
		NormalClass1 nc=new NormalClass1();
		ParentClass1 pc1=new ParentClass1();
		pc1.parentOfCricket();
		ParentClass1 pc2=new ChildClass1();
		pc2.parentOfCricket();
		ChildClass1 cc1=new ChildClass1();
		cc1.childOfCricket();
		cc1.parentOfCricket();
		/*ParentClass1 pc3=new ChildClass1();
		pc3.parentOfCricket();*/
		
		

	}

	

}

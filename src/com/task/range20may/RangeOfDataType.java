package com.task.range20may;

public class RangeOfDataType {
	
	public void byteRange() {
		byte b= -128;
		byte b1= 127;
		System.out.println("The range of byte is "+b  +" to "         +b1);
		
	}
	public void shortRange() {
		short s=-32768 ; 
		short s1=32767 ;
		System.out.println("The range of short is "+s  +" to "         +s1);
		
	}
	public void intRange() {
		int i=-2147483648;
		int i1=2147483647 ;
		System.out.println("The range of int is "+i  +" to "         +i1);

		
	}
	public void longRange() {
		long l=	-9223372036854775808l;
		long l1=9223372036854775807l;
		System.out.println("The range of long is "+l  +" to "         +l1);

	}
	public void floatRange() {
		float f=1.40129846432481707e-45f;
		float f1=3.40282346638528860e+38f;
		System.out.println("The range of long is "+f  +" to "         +f1);
	}
	public void doubleRange() {
		double d=4.94065645841246544e-324d;
		double d1=1.79769313486231570e+308d;
		System.out.println("The range of double is "+d  +" to "         +d1);

	}
	public void booleanRange() {
		boolean bl=true;
		boolean bl1=false;
		System.out.println("The range of boolean is "+bl  +" or "         +bl1);

	}
	public void charRange() {
		/*char c='\u0000';
		char c1='\uffff';*/
		char c=(char)-1;
		System.out.println(Integer.valueOf(c));
		//System.out.println("The range of char is "+c  +" to "         +c1);

	}
	

	public static void main(String[] args) {
		 RangeOfDataType rd=new  RangeOfDataType();
		 rd.byteRange();
		 rd.shortRange();
		 rd.intRange();
		 rd.floatRange();
		 rd.doubleRange();
		 rd.booleanRange();
		 rd.charRange();

	}

}

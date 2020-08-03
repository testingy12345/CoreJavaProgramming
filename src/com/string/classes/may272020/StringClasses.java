package com.string.classes.may272020;

public class StringClasses {
	//Note:Interview Question 
	//List some of the predefined classes of string .

	public static void main(String[] args) {
		String s="I am Working in virtusa";
		String d="virtusa";
		String f="Virtusa";
		int l=s.length();
		System.out.println("The length of String is :"+l);
		
		
		for (int i = 0; i <=(l-1); i++) {
			char c=s.charAt(i);
			System.out.print(c);
			
		}
		String upr=s.toUpperCase();
		System.out.println(upr);
		boolean cc=s.contains(f);
		System.out.println(cc);
		
		if(f.equals(d)) {
			System.out.println("Both the string are same");
		}
		else
		{
			System.out.println("Both the string are not same");
		}
		if(f.equalsIgnoreCase(d))
		{
			System.out.println("Both the string are same");
		}
		else
		{
			System.out.println("Both the string are not same");
		}
		int s1=s.indexOf("i");
		System.out.println(s1);
		
		int s2=s.lastIndexOf("i");
		System.out.println(s2);
		
		int s3=d.indexOf("a");
		System.out.println(s3);
		
		String s4=f.replace('V','I');
		System.out.println(s4);
		
		String[] sp=s.split(" ");
		System.out.println(sp[0]);
		System.out.println(sp[1]);
        System.out.println(sp[2]);
		System.out.println(sp[3]);
		System.out.println(sp[4]);
        
		String[] sp1=s.split(" a");
		int hh=sp1.length;
		System.out.println(hh);
		for (int i = 0; i < sp1.length; i++) {
			System.out.println(sp[i]);
		}
		
		String  old=s.concat("  My X company Was WBOX Info pvt ltd");
		System.out.println(old);
		
		String tri=old.trim();
		System.out.println(tri);
		
		


		
		

	}

}

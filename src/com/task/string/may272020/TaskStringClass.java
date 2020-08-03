package com.task.string.may272020;

public class TaskStringClass {

	public static void main(String[] args) {
		String a="My Office is Located in RMZ ECOWORLD Bangalore";
		String a1="office";
		String a2="Office";
		
		int l=a.length();
		System.out.println("The String Length is"+l);
		for (int i = 0; i <=(l-1); i++) {
			char c=a.charAt(i);
			System.out.println(c);
			
		}
		
		if(a.equals(a1)) {
			System.out.println("Strings are Equal");
			
		}else {
			System.out.println("Strings are not Equal");
			
		}
		
		if(a1.equalsIgnoreCase(a2)) {
			System.out.println("Strings are Equal");

	    }else
		{
		   System.out.println("Strings are Equal");

		}
		
		int a3=a.indexOf("f");
		System.out.println("The index of f is :-" +a3);
		
		int a4=a1.lastIndexOf("f");
		System.out.println("The Last index of : -"  +a4);
		
		String a5=a1.toUpperCase();
		System.out.println("The upper Case for a5 is: "+a5);
		
		String a6=a1.toLowerCase();
		System.out.println("The upper Case for a5 is: "+a6);
		
		boolean a7=a1.contains(a6);
		System.out.println(a7);
		
		String a8=a1.replace('e','E');
		System.out.println(a8);
		
		String[] sp=a.split(" ");
		System.out.println(sp[0]);
		System.out.println(sp[1]);
        System.out.println(sp[2]);
		System.out.println(sp[3]);
		System.out.println(sp[4]);
		System.out.println(sp[5]);
		System.out.println(sp[6]);
		
		String[] sp1=a.split("L");
		int  a11=sp1.length;
		System.out.println(a11);
		
		for (int i = 0; i < sp1.length; i++) {
			System.out.println(sp[i]);
		}
        
		String a9=a.concat("My Previous company was Located in Indiranagar");
		System.out.println("Adress  of my previous company : "+a9);
		
		String a10=a9.trim();
		System.out.println(a10);


		
		

	}

}

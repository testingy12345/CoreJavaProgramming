package com.string.task.part2.may282020;

public class TaskStringLiteralAndNonLiteral {

	public static void main(String[] args) {
     
		String s1="NZ";
		System.out.println(s1);
		System.out.println("Literl   "   +System.identityHashCode(s1));
		
		String s2="NZ";
		System.out.println(s1);
		System.out.println("Literl   "   +System.identityHashCode(s2));
		
		String s3=new String("NZ");
		System.out.println(s3);
		System.out.println("Non Literal    "  +System.identityHashCode(s3));
		

		String s4=new String("NZ");
		System.out.println(s4);
		System.out.println("Non Literal    "  +System.identityHashCode(s4));
		
		

		
	}

}

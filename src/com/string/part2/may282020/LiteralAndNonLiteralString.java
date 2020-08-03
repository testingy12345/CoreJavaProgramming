package com.string.part2.may282020;

public class LiteralAndNonLiteralString {
	

	public static void main(String[] args) {
		String s1="Vipin";
		System.out.println(s1);
		System.out.println("Literal   "   +System.identityHashCode(s1));
		String s2="Vipin";
		System.out.println(s2);
		System.out.println("Literal       "+System.identityHashCode(s2));
		
		String s3=new String("Vipin");
		System.out.println(s3);
		System.out.println("NonLiteral   "+System.identityHashCode(s3));
		
		String s4=new String("Vipin");
		System.out.println(s4);
		System.out.println("NonLiteral   "+System.identityHashCode(s4));
		

		

	}

}

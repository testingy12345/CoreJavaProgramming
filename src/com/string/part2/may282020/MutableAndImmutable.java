package com.string.part2.may282020;

public class MutableAndImmutable {

	public static void main(String[] args) {
		System.out.println("immutable");
		String s1="VIRTUSA RMZ";
		String s2="  ECOWORLD BANGALORE";
		String s3=s1.concat(s2);
		System.out.println("The concatinate String is   "+s3);
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println("------------------------------------------------------------");
		System.out.println("Mutable");
		StringBuffer sb=new StringBuffer("CHENNAI");
		StringBuffer sb1=new StringBuffer("BENGULURU");
		System.out.println("sb value :" +sb);
		System.out.println(System.identityHashCode(sb));
		System.out.println(System.identityHashCode(sb1));

		sb.append(sb1);
		System.out.println("sb value :" +sb);
		System.out.println("After Modifing");
		System.out.println(System.identityHashCode(sb));
		System.out.println(System.identityHashCode(sb1));


	}

}

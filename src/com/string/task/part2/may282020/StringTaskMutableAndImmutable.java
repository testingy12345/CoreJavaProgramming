package com.string.task.part2.may282020;

public class StringTaskMutableAndImmutable {

	public static void main(String[] args) {
		System.out.println("Immutable");
		String nz="New Zealand discharge large patient of COVID-19 And Declared as COVID-19 free nation";
		String nz1="New Zealand";
		String nz2="new zealand";
		String nz3="  is know as KIWI fruit and KIWI bird nation";
		nz3=nz1.concat(nz3);
	    System.out.println("The Concatanation of the String is :" +nz3);
	    System.out.println(System.identityHashCode(nz));
	    System.out.println(System.identityHashCode(nz1));
	    System.out.println(System.identityHashCode(nz2));
	    System.out.println(System.identityHashCode(nz3));
	    System.out.println("------------------------------");
	    
	    System.out.println("Mutable");
	    StringBuffer nz4=new StringBuffer("New Zealand");
	    StringBuffer nz5=new StringBuffer("new zealand");
	    StringBuffer nz6=new StringBuffer("   KIWI NATION");

	    System.out.println(" nz4 value - "+nz4);
	    System.out.println(System.identityHashCode(nz4));
	    System.out.println(System.identityHashCode(nz5));
	    
	    nz4.append(nz6);
	    System.out.println("The value of nz4 is    :-"+nz4);
	    System.out.println("After Modifying");
	    System.out.println(System.identityHashCode(nz4));
	    System.out.println(System.identityHashCode(nz5));
	    System.out.println(System.identityHashCode(nz6));

	    

		

	}

}

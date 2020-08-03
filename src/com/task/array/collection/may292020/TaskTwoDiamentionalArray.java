package com.task.array.collection.may292020;

public class TaskTwoDiamentionalArray {

	public static void main(String[] args) {
		int gg[][]=new int[2][2];
		gg[0][0]=45;
		gg[0][1]=85;
		gg[1][0]=78;
		gg[1][1]=87;
		int l=gg.length;
		System.out.println("The Length of the array is : =>" +l);
		for (int i = 0; i <= gg.length; i++) {
			System.out.println(gg[0][0]+ "  " +gg[0][1] + "  " + gg[1][0]+ "  " +gg[1][1]);
			
			
			
		}
		String ss[][]=new String[2][2];
		ss[0][0]="Goging";
		ss[0][1]="Coming";
		ss[1][0]="Outgoing";
		ss[1][1]="Incoming";
		System.out.println(ss[1][1]);
		int ls=ss.length;
		System.out.println("The Length of the 2 diamentional array String is :"  +ls);
		for (int S = 0; S < ss.length; S++) {
			System.out.println(ss[0][0] + "    " +ss[0][1] + "   "+ss[1][0] + " " +ss[1][1]);
			
		}

	}

}

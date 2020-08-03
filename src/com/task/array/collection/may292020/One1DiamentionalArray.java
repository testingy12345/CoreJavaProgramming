package com.task.array.collection.may292020;

public class One1DiamentionalArray {

	public static void main(String[] args) {
		int a[]={45,78,59,96,86};
		System.out.println(a[3]);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int b[] ;
		b=new int[5];
		b[0]=879;
		b[1]=458;
		b[2]=365;
		b[3]=425;
		b[4]=578;
		//b[5]=012;
		System.out.println(b[1]);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			
		}
		String s[]= {"Amar","Akbhar","Anthony"} ;
		System.out.println(s[1]);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			
		}
		
		float f[]= {45 , 78, 96, 69};
		System.out.println(f[1]);
		for (int i = 0; i < f.length; i++) {
			System.out.print(f[i]);
			
		}
		
		char c[]= {'a'    ,     'e',    'i',    'o',    'u'};
		System.out.println(c[2]);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
			
		}
		

	}

}

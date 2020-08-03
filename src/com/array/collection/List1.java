package com.array.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List1 {
	
	public void arrayList() {
		
		List l=new ArrayList();
		l.add(1);
		l.add("Vipin");
		l.add("v");
		l.add(8064878);
		l.add("Virtusa");
		l.add(80f);
		System.out.println(l);
		
		
	}
	
	public void linkedList() {
		List l=new LinkedList();
		l.add(1);
		l.add("Vipin");
		l.add("v");
		l.add(8064878);
		l.add("Virtusa");
		l.add(80f);
		System.out.println(l);
		LinkedList j=new LinkedList();
		j.add("Analytic Qutioned");
		j.add(456);
		j.add(901);
		System.out.println(j);
		
		l.addAll(j);
		System.out.println(l);
		l.set(4,500);
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		j.removeAll(j);
		System.out.println(j);
		

	}

	

	public static void main(String[] args) {
		List1 ll=new List1();
		ll.arrayList();
		ll.linkedList();

	}

}

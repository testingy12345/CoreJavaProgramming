package com.array.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
	private void hashSet() {
		HashSet<String> s=new HashSet<String>();
		//s.add(20);
		//s.add(35);
		s.add("IPL");
		System.out.println(s);
		
	}
	private void linkedHashSet() {
		LinkedHashSet l=new LinkedHashSet();
		l.add(99);
		l.add(45);
		l.add(451);
		l.add("Navigation");
		System.out.println(l);
		
	}
	private void treeSet() {
		TreeSet s1=new TreeSet();
		s1.add("Sadagopan Ramesh");
		s1.add("SRT");
		System.out.println(s1);
		
	}
	public static void main(String[] args) {
		Set t=new Set();
		t.hashSet();
		t.linkedHashSet();
		t.treeSet();

	}

}

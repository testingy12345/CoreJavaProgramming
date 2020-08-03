package com.task.array.collection.may292020;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TaskSet {
	
	private void hashSet() {
		
		Set s=new HashSet();
		s.add(10);
		s.add(30);
		s.add("LandLord");
		s.add(999);
		System.out.println(s);
		
	}
	
	private void linkedHashSet() {
		Set s2=new LinkedHashSet();
		s2.add("Navin");
		s2.add("Automation");
		s2.add("Labs");
		s2.add(1000);
		System.out.println(s2);
	}
	
	private void treeSet() {
		
		Set s3=new TreeSet();
		s3.add("Virat Kohali");
		s3.add("King Kohali");
		s3.add("Rohit Sharma");
		s3.add("HITMAN");
		System.out.println(s3);
	}

	public static void main(String[] args) {
	
		TaskSet s1=new TaskSet();
		s1.hashSet();
		s1.linkedHashSet();
		s1.treeSet();
		
		

	}

}

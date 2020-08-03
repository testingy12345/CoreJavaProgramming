package com.task.array.collection.may292020;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTask {
	public void taskArrayList() {
		List I=new ArrayList();
		I.add(98);
		I.add(100);
		I.add("USA");
		I.add("Whuhan China");
		I.add("LONDON UK");
		System.out.println(I);
	}
	
	public void linkedList() {
		List l1=new LinkedList();
		l1.add("Super Man");
		l1.add(707);
		l1.add("CSK");
		l1.add("RCB");
		l1.add(5600);
		l1.add(6600);
		System.out.println(l1);
		
		List l2=new LinkedList();
		l2.add("MI");
		l2.add("RCB");
		l2.add("KTK");
		l2.add("PWI");
		l2.add("RPS");
		l2.add(546);
		l2.add("DD");
		l2.add("DC");
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println(l1);
		l1.set(6,600);
		System.out.println(l1);
		
		l1.remove(3);
		System.out.println(l1);
		l1.removeAll(l1);
		System.out.println(l1);
		

		
	}

	public static void main(String[] args) {
		ListTask lt=new ListTask();
		lt.taskArrayList();
		lt.linkedList();
		

	}

}

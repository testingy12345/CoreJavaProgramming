package com.array.collection.task30may2020;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TaskMaps {
	
	public void hashMap() {
		Map<Integer,String> m2=new HashMap<Integer,String>();
		m2.put(1,"I Love India");
		m2.put(200,"My Country is India");
		m2.put(1099,"COVID-19 First Patient Found in Wuhan China");
		System.out.println(m2);
		System.out.println(m2.get(1099));
		for (Map.Entry n2:m2.entrySet()) {
			System.out.println(n2.getKey()+ " "+n2.getValue());
			
		}
	}
	
	public void linkedHashMap() {
		Map<Integer,String> m3=new LinkedHashMap<Integer,String>();
		m3.put(380,"BRETT LEE");
		m3.put(563,"GLENN MCGRATH");
		m3.put(709,"SHANE WARNE");
		System.out.println(m3);
		System.out.println(m3.get(563));
		for(Map.Entry n3:m3.entrySet()) {
			System.out.println(n3.getKey()+"   "+n3.getValue());
			
		}
		
	}
	
	public void treeMap() {
		Map<Integer,String> m4=new TreeMap<Integer,String>();
		m4.put(1,"SRT");
		m4.put(2,"ALISTER COOK");
		m4.put(3,"JACQUE KALLIS");
		System.out.println(m4);
		System.out.println(m4.get(3));
		for (Map.Entry n4:m4.entrySet()) {
			System.out.println(n4.getKey()+"   "+n4.getValue());
			
			
			
		}
		
	}

	public static void main(String[] args) {
		TaskMaps tm=new TaskMaps();
		tm.hashMap();
		tm.linkedHashMap();
		tm.treeMap();
		
		
		

	}

}

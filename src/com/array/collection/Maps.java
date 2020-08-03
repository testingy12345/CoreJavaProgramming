package com.array.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
	
	public void hashMap() {
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(1,"SRT");
		m.put(2,"RD");
		m.put(300,"MSD");
		System.out.println(m);
		System.out.println(m.get(1));
		for (Map.Entry n:m.entrySet()) {
			System.out.println(n.getKey() +"  "+n.getValue());
			
		}


		
		
	}
    public void linkedHashMap() {
    	Map<Integer,String> m1=new LinkedHashMap<Integer,String>();
    	m1.put(1,"Chris Gyle");
    	m1.put(999,"Ramnaresh Sarvan");
    	m1.put(123,"Shivnarayan Chandrapaul");
    	System.out.println(m1);
    	System.out.println(m1.get(123));
    	
    	for (Map.Entry n1:m1.entrySet()) {
			System.out.println(n1.getKey() +"  "+n1.getValue());

    		
			
		}


		
		
	}
    public void treeMap() {
    	Map<Integer, String> m=new TreeMap<Integer, String>();
		m.put(1,"SRT");
		m.put(2,"RD");
		m.put(300,"MSD");
		System.out.println(m);
		System.out.println(m.get(1));
		for (Map.Entry n:m.entrySet()) {
			System.out.println(n.getKey() +"  "+n.getValue());
			
		}

		
		
	}
    public void hashTable() {
		
		
	}

	public static void main(String[] args) {
		Maps m=new Maps();
		m.hashMap();
		m.linkedHashMap();
		m.treeMap();

	}

}

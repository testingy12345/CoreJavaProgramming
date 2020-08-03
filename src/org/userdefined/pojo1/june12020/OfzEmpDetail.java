package org.userdefined.pojo1.june12020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OfzEmpDetail {

	public static void main(String[] args) {
		List<EmpDetails> l=new ArrayList<EmpDetails>();
		EmpDetails obj1=new EmpDetails();
		obj1.setEmpid(8064);
		obj1.setEmpName("Vipin");
		obj1.setSalary(45000);
		obj1.setPhno(8208627925l);
		//Note : For Multiple entry we need to create a different object .Because each object creation required different memory.
		EmpDetails obj2=new EmpDetails();
		obj2.setEmpid(6402);
		obj2.setEmpName("Vijay");
		obj2.setSalary(90000);
		obj2.setPhno(9665081663l);
		
		EmpDetails obj3=new EmpDetails();
		obj3.setEmpid(6402);
		obj3.setEmpName("Virat");
		obj3.setSalary(80000);
		obj3.setPhno(9847562478l);
		
		l.add(obj1);
		l.add(obj2);
		l.add(obj3);
		
		for (EmpDetails mn:l) {
			System.out.println(mn.getEmpid());
			System.out.println(mn.getEmpName());
			System.out.println(mn.getSalary());
			System.out.println(mn.getPhno());
			System.out.println("======================================================================");

			
			//Note:Map Will not allow duplicate

			
			
		}
		Map<Integer,EmpDetails> l1=new HashMap<Integer,EmpDetails>();
		EmpDetails obj4=new EmpDetails();
		obj4.setEmpid(8064);
		obj4.setEmpName("Vipin");
		obj4.setSalary(45000);
		obj4.setPhno(8208627925l);
		//Note : For Multiple entry we need to create a different object .Because each object creation required different memory.
		EmpDetails obj5=new EmpDetails();
		obj5.setEmpid(6402);
		obj5.setEmpName("Vijay");
		obj5.setSalary(90000);
		obj5.setPhno(9665081663l);
		
		EmpDetails obj6=new EmpDetails();
		obj6.setEmpid(6402);
		obj6.setEmpName("Virat");
		obj6.setSalary(80000);
		obj6.setPhno(9847562478l);
		
		l1.put(0,obj4);
		l1.put(1,obj5);
		l1.put(2,obj6);
		
		Set<Entry<Integer,EmpDetails>> xy=l1.entrySet();
		for (Entry<Integer, EmpDetails> a: xy) {
			EmpDetails value=a.getValue();
			System.out.println(value);
			System.out.println(a.getKey());
			System.out.println(a.getValue().getEmpid());
			System.out.println(a.getValue().getEmpName());
			System.out.println(a.getValue().getSalary());
			System.out.println(a.getValue().getPhno());
			System.out.println("======================================================================");

		}
	}

}

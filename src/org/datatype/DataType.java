package org.datatype;

public class DataType {
	static int jj ;
	static String kk;
	static char ll;
	static double kn;
	static boolean gh;
	static long dk;
	static byte b;
	static short s;
	static float f;
	
	public void empId() {
		int a=8064878 ;
		System.out.println(a);
	}
	
	public void empid2(int a) {
		System.out.println(a);
		
	}
	
	public void empname(String name) {
		System.out.println(name);
	}
	public void salary(double Salary) {
		System.out.println(Salary);
		
	}
	public void phNo(long phNo) {
		System.out.println(phNo);
	}

	public static void main(String[] args) {
		DataType d=new DataType();
		d.empId();
		d.empid2(805878);
		d.empname("Vipin");
		d.salary(40000);
		d.phNo(8208627925l);
		System.out.println(jj);
		System.out.println(kk);
		System.out.println(ll);
		System.out.println(kn);
		System.out.println(gh);
		System.out.println(dk);
		System.out.println(b);
		System.out.println(s);
		System.out.println(f);

		
		
		
		

	/*	byte ff=-128;
		byte f=127;
		System.out.println(f   +" "    +ff);*/
	}

}

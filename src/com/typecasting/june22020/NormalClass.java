package com.typecasting.june22020;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class NormalClass {
	
	public static void main(String[] args) throws IOException {
		/*NormalClass nc=new NormalClass();
		ParentClass pc=new ParentClass();
		pc.parentMethod();
		ParentClass pp=new ChildClass();
		pp.parentMethod();
		ChildClass c=new ChildClass();
		c.parentMethod();
		c.childMethod();
		ParentClass pp1=new ChildClass();
		pp1.parentMethod();*/
		
		File f=new File("C:\\Users\\VIPIN\\Desktop\\maybatch\\20\\20\\Evening\\vipin.docs\\");
		File f1=new File("C:\\Users\\VIPIN\\Desktop\\eOffer Content_files\\JuneBatch\\xyz.txt");
		boolean m=f1.mkdir();
		System.out.println(m);
		
		File f4=new File("C:\\Users\\VIPIN\\Desktop\\maybatch\\20\\20\\Evening\\vipin.docs\\");
        boolean m1=f4.mkdirs();
		System.out.println(m1);
		
		//File f2=new File("C:\\Users\\VIPIN\\Desktop\\maybatch\\20\\20\\Evening\\vipin.docs\\");
        boolean m2=f.createNewFile();
		System.out.println(m2);
		
		//File f3=new File("C:\\Users\\VIPIN\\Desktop\\eOffer Content_files\\JuneBatch\\xyz.txt");
        boolean m3=f1.isDirectory();
		System.out.println(m3);//Confusion in isDirectory() concept .//Now Clear
		
		boolean m4=f.isFile();
		System.out.println(m4);
		
		FileUtils.write(f1,  "hi friends i am working in Virtusa"); //Error in FileUtils .Error Clear need to add common.io.jar
		System.out.println("Text has been written in file");
		List<String> rr=FileUtils.readLines(f1);
		System.out.println(rr);
		for (String string : rr) {
			System.out.println(string);
			
		}
		

	}

}

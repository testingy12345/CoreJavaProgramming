package com.task.typecasting.june32020;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOperation {

	public static void main(String[] args) throws IOException  {

		File f=new File("C:\\Users\\VIPIN\\Desktop\\Virtusa\\h");
		/*boolean m1=f.mkdir();
		System.out.println(m1);*/
		
		/*File f1=new File("C:\\Users\\VIPIN\\Desktop\\RMZ\\QA");
		boolean m2=f1.mkdirs();
		System.out.println(m2);*/
		
	/*	boolean m3=f.createNewFile();
		System.out.println(m3);*/
		
		File f2=new File("C:\\Users\\VIPIN\\Desktop\\HSBC\\h\\zxc.txt");
		boolean m4=f.isDirectory();
		System.out.println(m4);
		
		boolean m5=f.isFile();
		System.out.println(m5);
		
		File f1=new File("C:\\Users\\VIPIN\\Desktop\\eOffer Content_files\\virtusa\\xyz.txt");
		FileUtils.write(f1, "Infosys ");
		System.out.println("Text has been written in File");
		
		List<String> cv=FileUtils.readLines(f1);
		System.out.println(cv);
		for (String string : cv) {
			System.out.println(string);
			
		}

		
		
		
		
		
		
		
		
	}

}

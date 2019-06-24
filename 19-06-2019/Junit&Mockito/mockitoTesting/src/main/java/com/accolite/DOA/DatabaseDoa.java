package com.accolite.DOA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DatabaseDoa {
	
	String id;
	String name;
	
	 public String getId() {
		return id;
	}
	public static String setId(String id) {
		id = id;
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void save(String fileName) {
		 
		 File file = new File(fileName);
		 boolean status = false;
		 OutputStream out = null;
		System.out.println("Status of file saving: " + status);

		try {
			out = new FileOutputStream(file);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			status = false;
		}
		
		try {
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Status of file saving: " + status);
		
	 }

}

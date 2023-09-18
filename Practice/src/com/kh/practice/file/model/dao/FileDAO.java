package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		File f = new File(file);
		return f.exists();
	}
	public void fileSave(String file, String s) {
		try {
			FileWriter w = new FileWriter(file);
			w.write(s);
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	public StringBuilder fileOpen(String file) {
//		
//	}
	public void fikeEdit(String file, String s) {
		
	}
	
	
}

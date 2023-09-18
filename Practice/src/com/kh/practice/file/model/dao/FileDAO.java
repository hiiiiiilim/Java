package com.kh.practice.file.model.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		try {
			FileReader r= new FileReader(file);
			BufferedReader br = new BufferedReader(r);
			
			String line;
			try {
				while((line=br.readLine()) != null) {
					sb.append(line).append("\n");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sb;
	}
	public void fileEdit(String file, String s) {
		
	}
}

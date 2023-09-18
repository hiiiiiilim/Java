package com.kh.practice.file.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	
	public void fileSave(String file, String s) {
		fd.fileSave(file, s);
	}
	public StringBuilder fileOpen(String file) {
		return null;
	}
	public void fikeEdit(String file, StringBuilder s) {
		
	}
}

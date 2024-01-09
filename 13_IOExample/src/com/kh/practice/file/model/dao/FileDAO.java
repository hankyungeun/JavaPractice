package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		File f = new File(file);
		return f.exists();
	}
	public void fileSave(String file, String s) {
		FileWriter writer= null;
		try {
			writer = new FileWriter(file);
			writer.write(s);
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(writer != null) writer.close();
			} catch (IOException e) {}
		}
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		try {
			FileReader reader = new FileReader(file);
			
			char[] buf = new char[1024];
			while(reader.read(buf)!=-1) {
				sb.append(buf);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb;
		
	}
	public void fileEdit(String file, String s) {
		FileWriter writer= null;
		try {
			writer = new FileWriter(file, true);
			writer.write(s);
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(writer != null) writer.close();
			} catch (IOException e) {}
		}
	}
}

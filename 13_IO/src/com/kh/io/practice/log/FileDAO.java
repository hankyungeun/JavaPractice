package com.kh.io.practice.log;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	final static int READ_SIZE = 1024;
	private FileReader reader = null;
	FileWriter writer = null;
	File f = null;
	
	//파일 접근
	public void access(String filepath, int type) throws IOException{
		if(type == 0 && reader == null){
			reader = new FileReader(filepath);
		}

		if(type == 1 && writer == null){
			writer = new FileWriter(filepath);
		}
	}

	public void close(int type)throws IOException{
		if(type==0&&reader != null) reader.close();
		if(type==1&&writer!=null) writer.close();
	}

	public String read(){
		StringBuffer sb = new StringBuffer("");
		if(reader != null) {
			char[] buffer = new char[READ_SIZE];
			try {
				while((reader.read(buffer)) != -1) {
					sb.append(buffer);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}
	
	public boolean write(String data) {
		if(writer != null) {
			try {
				writer.write(data);
			}catch(IOException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}else {
			return false;
		}
	}
	public boolean isExistFile(String filepath) {
		f= new File(filepath);
		return f.exists();
	}
	
	public int getFilesCount(String filepath) {
		f= new File(filepath);
		return filepath.length();
	}
}

package com.kh.io.practice.log;

import java.io.IOException;

public class LogTest {

	public static void main(String[] args) {
		FileDAO log = new FileDAO();
		try {
			log.access("log.txt" , 1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		int[] arr = new int[3];
		
		for(int i=0; i<4; i++) {
			arr[i] = i;
		}
		
	}

}

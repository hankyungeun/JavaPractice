package com.kh.io_13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOPractice {
	public static void main(String[] args) {
		//파일 출력용 스트림 생성
		try ( FileOutputStream fos = new FileOutputStream("phone_info.txt");
			  ObjectOutputStream oos = new ObjectOutputStream(fos)){
			//저장할 객체 데이터 생성
			Phone p1 = new Phone("iphone", 15000000);
			//객체 데이터 출력
			oos.writeObject(p1);
			
			
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}

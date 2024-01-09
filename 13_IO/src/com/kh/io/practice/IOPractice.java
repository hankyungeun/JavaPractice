package com.kh.io.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOPractice {
	public static void main(String[] args) {

	}

	public static void fileReaderTest() {
		FileReader fr = null;
		try {
			fr = new FileReader("test2.txt");
			int result;
			char[] buffer = new char[1024];

			while ((result = fr.read(buffer)) != -1) {
				String fileData = new String(buffer, 0, result);
				System.out.println(fileData);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

		}

	}

	public static void fileWriterTest() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("test2.txt");
			fw.write("안녕하세요.\n");
			fw.write("한경은입니다");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
			}
		}

	}

	public static void fileInputStreamTest() {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("test.txt");
			int i;
			while ((i = fis.read()) != -1) {
				System.out.println((char) (i));
			}
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
			}
		}
	}

	public static void fileOutputStreamTest() {
		FileOutputStream fos = null;
		try { // 파일 관련 클래스 사용 시 예외처리 필수
			fos = new FileOutputStream("test.txt");
			fos.write(65); // 파일에 데이터 쓸 때 사용
			fos.write(50);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // write(), close()사용 시 발생가능한 예외 처리
			e.printStackTrace();
		} finally {
			// 프로그램 중간에 예외 발생 시 스트림이 닫히지 않는 경우 닫아주기 위해 작성
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {
			}
		}

	}
}

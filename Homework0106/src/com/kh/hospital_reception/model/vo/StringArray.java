package com.kh.hospital_reception.model.vo;

import java.util.Scanner;

public class StringArray{
	CustomArray<Book> cb = new CustomArray<>();
	Scanner sc = new Scanner(System.in);
	Book[] b = new Book[10];
	
	public  void add(String element) {
		for (int i = 0; i < 10; i++) {
			if(b[i] == null) {
				b[i] = new Book();
				b[i].setbName(element);
				break;
			}
		}
		cb.setArr(b);
	}
	public  void remove(String element) {
		for (int i = 0; i < 10; i++) {
			if(b[i].getbName().equals(element)) {
				b[i] = null;
				break;
			}
		}
		cb.setArr(b);
	}	

	public void print() {
		System.out.println(cb);
	}
	
	public void menu() {
		while(true) {
			System.out.println("1. 대출");
			System.out.println("2. 삭제");
			System.out.println("3. 조회");
			int num = sc.nextInt();
			String bname = "";
			sc.nextLine();
			switch(num) {
			case 1:
				System.out.print("대출 할 책 입력 : ");
				bname = sc.nextLine();
				add(bname);
				System.out.println("대출완료");
				break;
			case 2:
				System.out.print("반납 할 책 입력 : ");
				bname = sc.nextLine();
				remove(bname);
				System.out.println("삭제완료");
				break;
			case 3:
				print();
				break;
			}
			
		}
	}

	public static void main(String[] args) {
		StringArray ar = new StringArray();
		ar.menu();
	}
}

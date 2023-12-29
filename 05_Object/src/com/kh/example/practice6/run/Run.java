package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book book = new Book();
		Book book2 = new Book("영어책", "한경은", "한경은" );
		Book book3 = new Book("수학책", "한경은", "한경은", 30000, 30);
		
		book.inform();
		book2.inform();
		book3.inform();
	}

}

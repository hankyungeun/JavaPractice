package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		return mem;
	}
	
	public Book[] selectAll() {
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		Book b[];
		for(int i = 0; i < 5; i++) {
//			if(bList[i].getTitle() == b[].getTitle()) {
				
//			}
		}
		return null;
	}
	
	public int rentBook(int index) {
		int result = 0;
		if(bList[index] instanceof AniBook) {
			if(mem != null) {
				if(((AniBook)bList[index]).getAccessAge() < mem.getAge()) {
					result = 1;
				}
				
			}
		}
		else if (bList[index] instanceof CookBook) {
			if(mem != null) {
				if(((CookBook)bList[index]).isCoupon() == true) {
					mem.setCouponCount(mem.getCouponCount() + 1);
				}
				result = 2;
			}
		}
		return result;
	}
}

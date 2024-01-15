package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

//리스트 정렬 관련 클래스
public class AscTitle implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		//정수 / 실수
		//오름차순 : o1 - o2
		//내림차순 : o2 - o1
		
		//문자열의 경우
		//오름차순 : o1.getTitle().compareTo(o2.getTItle())
		//내림차순 : o2.getTitle().compareTo(o1.getTItle())
		
		
		return 0;
	}
}

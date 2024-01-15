package com.kh.set.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.kh.map.practice.MemberHashMap;

public class SetPractice {
	
	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		memberHashMap.addMember(new Member(2000,"아이유"));
		memberHashMap.addMember(new Member(3000,"아이유"));
		memberHashMap.addMember(new Member(4000,"아이유"));
		memberHashMap.showAllMember();
		System.out.println("*".repeat(20));
		memberHashMap.removeMember(3000);
		memberHashMap.showAllMember();
	}
	public static void hashMapTest() {
		Set<Member> hashSet = new HashSet<>();
		hashSet.add(new Member(1000, "한경은"));			//인스턴스 생성하면서 전달
		Member m1 = new Member(1001,"ㄱㄴㄷ");
		hashSet.add(m1);						
		//인스터스를 가리키는 참조변수 전달
		hashSet.add(new Member(1001,"애기"));
		hashSet.add(new Member(1002,"한경은"));
		System.out.println(hashSet);
		hashSet.remove(m1);
		
		System.out.println("*".repeat(20));

		for(Member m : hashSet) {
			System.out.println(m);
		}
	}
	public static void hashSetTest01() {
		// TODO Auto-generated method stub

		Set<String> hashSet = new HashSet<>();
	
		hashSet.add("ISTP");
		hashSet.add("ISFJ");
		hashSet.add("ISFP");
		hashSet.add("INTJ");
		hashSet.add("ESFP");
		hashSet.add("ESFP");
		
		hashSet.remove("ESFP");
		
		System.out.println(hashSet);
		//[ISTP, ISFP, ESFP, INTJ, ISFJ]
		
		
		//iterator 사용
		Iterator<String> iter = hashSet.iterator();		//Iterator객체 생성
		for(;iter.hasNext();) {							//조건식 위치 : 데이터 유/무 판
			String data = iter.next();					//데이터 조회
			System.out.println(data);
		}
		
		System.out.println("*".repeat(20));
		//for-each문 사용
		for(String str : hashSet) {						//어떤 데이터들의 모음인지 확인 후 자료형 작성
			System.out.println(str);					//str => Set에 저장된 데이터를 하나하나 꺼내옴
		}
		
	}
}

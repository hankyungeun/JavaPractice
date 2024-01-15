package com.kh.map.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.kh.set.practice.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		return false;
	}
	
	public void showAllMember() {
		//(1)Iterator객체 생성
		Iterator<Integer> iter = hashMap.keySet().iterator();
		//(2)반복문 돌리면서, 데이터 유/무 체크하고 조회
		while(iter.hasNext()) {
			System.out.println(hashMap.get(iter.next()));
		}
	}
}

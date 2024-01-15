package com.kh.map.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapPractice {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(3000, "SSG");
		map.put(3001, "키움");
		map.put(3002, "롯데");
		
		Set<Integer> keyList = map.keySet();
		
		for(Integer k : keyList) {
			//데이터 조회
			System.out.println(k  + " : " + map.get(k));
		}
		map.remove(3001);
		System.out.println("*".repeat(20));
		for(Iterator<Integer> iter = keyList.iterator(); iter.hasNext();) {
			System.out.println( map.get(iter.next()));						//iter.next() : 키 값을 하나씩 조회
																		//map.get(key) : key값 기준으로 map에서 데이터 조회
		}
	}
}

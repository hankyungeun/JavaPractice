package com.kh.list.practice;

import java.util.ArrayList;

public class MyQueue {
	ArrayList<String> myQueue = new ArrayList<>();
	
	//데이터 추가
	public void enQueue(String data) {
		myQueue.add(data);
		ListPractice.printItem(myQueue);
	}
	
	//데이터 제거
	public String deQueue() {
		if(myQueue.size() == 0) {
			return "리스트가 비어있습니다!";
		}
		else {
			return myQueue.remove(0) + " 삭제";
		}
	}
}

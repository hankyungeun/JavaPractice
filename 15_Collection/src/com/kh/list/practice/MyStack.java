package com.kh.list.practice;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	ArrayList<String> arrayStack = new ArrayList<>();
	
	public void push(String data) {
		System.out.println("push");
		arrayStack.add(data);
		ListPractice.printItem(arrayStack);
	}
	
	public String pop() {
		if(arrayStack.size()==0) {
			return "리스트가 비어있습니다!";
		}
		else {
			int lastIndex = arrayStack.size() - 1;
			return arrayStack.remove(lastIndex) + " 삭제";
		}
	}
}

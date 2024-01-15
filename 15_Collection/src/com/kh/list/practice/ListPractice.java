package com.kh.list.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ListPractice {
	public static void main(String[] args) {
		MyQueue mq = new MyQueue();
		mq.enQueue("1");
		mq.enQueue("2");
		mq.enQueue("3");
		mq.enQueue("4");
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
	}
	
	public static void stackTest() {
		MyStack my = new MyStack();
		my.push("2");
		my.push("3");
		my.push("4");
		my.push("5");
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
	}
	
	public static void linkedListTest() {
		
		LinkedList<Integer> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("저장할 데이터 길이 입력 : ");
		int len = sc.nextInt();
		
		for (int i = 0 ; i < len; i++) {
			list.add(random.nextInt(10));
		}
		printItem(list);
		
	}


	public static void arrayListTest() {
		ArrayList<String> arr = new ArrayList<>();

		arr.add("한식");
		arr.add("마라탕");
		arr.add("짜장면");
		printItem(arr);
		
		arr.remove(1);
		printItem(arr);

		arr.add(1, "돈까스");
		printItem(arr);

		arr.set(1, "ddd");
		printItem(arr);

	}
	
//	public void printItem(ArrayList<String> list)
	public static <E> void printItem(List<E> list) {
		for (E element : list) {
			System.out.println(element);
		}
		System.out.println("-".repeat(10));
	}
	

}

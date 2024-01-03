package com.kh.controller;

import java.util.Random;
import java.util.Scanner;

import com.kh.model.vo.User;

public class PlayController {
	Scanner sc = new Scanner(System.in);
	User u = new User("한경은");
	
	public void method01(){
		Random random = new Random();
		int r = random.nextInt(50) + 1;
		System.out.println("==== Up&Down ====");
		System.out.println("숫자 맞추기");
		System.out.println("=================");
		
		for(int i = 0; i < 5; i++) {
			System.out.print("번호 입력 : ");
			int num = sc.nextInt();
			if(num > r) {
				System.out.println("Down");
			}
			else if(num < r) {
				System.out.println("UP");
			}
			else {
				System.out.println("Catch");
				u.setScore(u.getScore() + 10);
				break;
			}
		}
		System.out.println(r);
	}
	
	public void method02() {
		Random random = new Random();
		int result = 0;
		int r = random.nextInt(3) + 1;
		System.out.print("가위 바위 보 입력 : ");
		String input = sc.next();
		switch(input) {
			case "가위": result = 1; break;
			case "바위": result = 2; break;
			case "보": result = 3; break;
		}
		if(result < r) {
			System.out.println("패배");
			u.setScore(u.getScore() - 10);
		}
		else if(result > r) {
			System.out.println("승리");
			u.setScore(u.getScore() + 10);
		}
		else {
			System.out.println("무승부");
		}
		
	}
	
	public void getUserInfo() {
		System.out.println(u.toString());
	}
}

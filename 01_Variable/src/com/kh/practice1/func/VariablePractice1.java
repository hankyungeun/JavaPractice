package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("성별 입력하세요 : ");
		String gender = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요 : ");
		float height = sc.nextFloat();
		System.out.printf("키 %.1fcm인 %d살 %s %s님 반갑습니다^^", height, age, gender, name);
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String text = sc.nextLine();
		System.out.println("첫 번째 문자 : " + text.charAt(0));
		System.out.println("두 번째 문자 : " + text.charAt(1));
		System.out.println("세 번째 문자 : " + text.charAt(2));
		
	}
	
}

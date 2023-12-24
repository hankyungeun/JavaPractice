package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요(-포함) : ");
		String ssn = sc.nextLine();
	
		if(ssn.charAt(7) == '1' || ssn.charAt(7) == '3') {
			System.out.println("남자");
		}
		else if(ssn.charAt(7) == '2' || ssn.charAt(7) == '4')
			System.out.println("여자");
		else
			System.out.println("알 수 없음");
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("정수 2 : ");
		int num2 = sc.nextInt();

		System.out.println("입력 : ");
		int num = sc.nextInt();
		
	}

}

package com.kh.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	
	public static void main(String[] args) {
		System.out.println("프로그램을 시작합니다.");
		try {
			arithmeticTest();
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException 오류");
		}
		try {
			inputMismatchTest();
		}catch(InputMismatchException e) {
			System.out.println("자연수를 입력해주세요");
		}
		try {
			nullPointerTest();
		}
		catch(NullPointerException e) {
			System.out.println("name이 null입니다.");
		}
		System.out.println("프로그램을 종료합니다.");
	}
	
	public static void arithmeticTest() throws ArithmeticException{
		//ArithmeticException : 산술관련 예외클래스
		int n1 = 10;
		int n2 = 0;
		
		System.out.println(n1 / n2);
		throw new ArithmeticException();
	}
	
	public static void inputMismatchTest() {
		//InputMismatchException : 입력이 잘못된 경우 예외 클래스
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("입력한 값은 " + num + "입니다.");
	}
	
	public static void nullPointerTest() {
		//NullPointerException : null 관련 예외 클래스 (생성되지 않은 객체로서의 접근시)
		String name = null;
		System.out.println(name);		//name.toString()
										//toString() : Object클래스 메소드. 클래스 정보와 주소값 반환 
										//String 클래스 변수에서 사용시 저장된 값이 출력됨 -> 오버라이딩
		System.out.println("name 변수의 길이는 " + name.length() + "입니다.");
		
	}
	
	
	public static void customExceptonTest() throws CustomException{
		throw new CustomException("내가 만든 예외");
	}
}

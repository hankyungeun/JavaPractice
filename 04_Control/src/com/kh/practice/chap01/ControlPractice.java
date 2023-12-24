package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		switch (num) {
			case 1:
				System.out.print("입력 메뉴입니다.");
				break;
			case 2:
				System.out.print("수정 메뉴입니다.");
				break;
			case 3:
				System.out.print("조회 메뉴입니다.");
				break;
			case 4:
				System.out.print("삭제 메뉴입니다.");
				break;
			case 7:
				System.out.print("프로그램이 종료됩니다");
				break;
			default:
				break;
		}
	}

	///////////////////////////////////////////////////////////////////////////////////
	public void practice2() {
		System.out.print("숫자를 한 개 입력하세요 : ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다.");
			} else
				System.out.println("홀수다.");
		} else
			System.out.println("양수만 입력해주세요.");
	}

	///////////////////////////////////////////////////////////////////////////////////
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int score1 = sc.nextInt();
		System.out.print("수학점수 : ");
		int score2 = sc.nextInt();
		System.out.print("영어점수 : ");
		int score3 = sc.nextInt();
		float avg = ((float) score1 + (float) score2 + (float) score3) / 3;

		if (score1 >= 40 && score2 >= 40 && score3 >= 40 && avg >= 60) {
			System.out.println("국어점수 : " + score1);
			System.out.println("수학점수 : " + score2);
			System.out.println("영어점수 : " + score3);
			System.out.println("합계 : " + (score1 + score2 + score3));
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");

		} else
			System.out.println("불합격입니다.");
	}

	////////////////////////////////////////////////////////////////////////////////////
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		switch (month) {
			case 12:
			case 1:
			case 2:
				System.out.println(month + "월은 겨울입니다.");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println(month + "월은 봄입니다.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month + "월은 여름입니다.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month + "월은 가을입니다.");
				break;
			default:
				System.out.println(month + "월은 잘못 입력된 달입니다.");
				break;
		}

	}

	///////////////////////////////////////////////////////////////////

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();

		if (id.equals("myId")) {
			if (pw.equals("myPassword12")) {
				System.out.println("로그인 성공");
			} else
				System.out.print("비밀번호가 틀렸습니다.");
		} else {
			System.out.println(id);
			System.out.print("아이디가 틀렸습니다.");
		}
	}

	/////////////////////////////////////////////////////////////////////////
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String right = sc.nextLine();
		if (right.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
		} else if (right.equals("회원")) {
			System.out.println("게시글 작성, 댓글 작성, 게시글 조회");
		} else if (right.equals("비회원")) {
			System.out.println("게시글 조회");
		}
	}

	//////////////////////////////////////////////
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요  : ");
		double weight = sc.nextDouble();
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);
		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("비만");
		} else
			System.out.println("고도비만");
	}

	//////////////////////////////////////////////
	public void practice8() {
		float result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		int a = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String c = sc.nextLine();

		switch (c) {
			case "+":
			case "-":
			case "/":
			case "*":
			case "%":
				switch (c) {
					case "+":
						result = (float) a + (float) b;
						break;
					case "-":
						result = (float) a - (float) b;
						break;
					case "/":
						result = (float) a / (float) b;
						break;
					case "*":
						result = (float) a * (float) b;
						break;
					case "%":
						result = (float) a % (float) b;
						break;
				}
				System.out.println(a + c + b + " = " + result);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				break;
		}
	}

	public void practice9() {
		double total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		int midterm = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int finals = sc.nextInt();
		System.out.print("과제 점수 : ");
		int assign = sc.nextInt();
		System.out.print("출석 회수 : ");
		int att = sc.nextInt();
		double[] score = new double[4];

		score[0] = midterm * 0.2;
		score[1] = finals * 0.3;
		score[2] = assign * 0.3;
		score[3] = att * 5 * 0.2;

		for (int i = 0; i < 4; i++) {
			total += score[i];
		}

		if (att <= 14) {
			System.out.println("Fail [출석 회수 부족 (" + att + "/20)]");
		} else {
			System.out.println("================= 결과 =================");
			System.out.println("중간 고사 점수(20) : " + score[0]);
			System.out.println("기말 고사 점수(30) : " + score[1]);
			System.out.println("과제 점수(30) : " + score[2]);
			System.out.println("출석 회수(20) : " + score[3]);
			System.out.println("총점 : " + total);
			if (total >= 70) {
				System.out.println("Pass");
			} else
				System.out.println("Fail [점수 미달]");
		}
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("실행할 기능을 선택하세요.\r\n"
				+ "1. 메뉴 출력\r\n"
				+ "2. 짝수/홀수\r\n"
				+ "3. 합격/불합격\r\n"
				+ "4. 계절\r\n"
				+ "5. 로그인\r\n"
				+ "6. 권한 확인\r\n"
				+ "7. BMI\r\n"
				+ "8. 계산기\r\n"
				+ "9. P/F\r\n"
				+ "");
		System.out.print("선택 : ");
		int select = sc.nextInt();

		switch (select) {
			case 1:
				practice1();
				break;
			case 2:
				practice2();
				break;
			case 3:
				practice3();
				break;
			case 4:
				practice4();
				break;
			case 5:
				practice5();
				break;
			case 6:
				practice6();
				break;
			case 7:
				practice7();
				break;
			case 8:
				practice8();
				break;
			case 9:
				practice9();
				break;
		}
	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 입력(1000~9999) : ");
		String passwd = sc.next();

	}
}

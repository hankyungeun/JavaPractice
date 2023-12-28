package com.kh.practice.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arry = new int[10];
		for (int i = 0; i < arry.length; i++) {
			arry[i] = i + 1;
			System.out.print(arry[i] + " ");
		}
	}

	public void practice2() {
		int[] arry = new int[10];
		for (int i = 0; i < arry.length; i++) {
			arry[i] = arry.length - i;
			System.out.print(arry[i] + " ");
		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int x = sc.nextInt();
		int[] arry = new int[x];
		for (int i = 1; i <= x; i++) {
			arry[i - 1] = i;
			System.out.print(arry[i - 1] + " ");
		}

	}

	public void practice4() {
		String[] fruit = { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(fruit[1]);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String text = sc.nextLine();
		System.out.print("문자 : ");
		char alph = sc.next().charAt(0);
		char[] c = new char[text.length()];
		int num = 0;

		System.out.print(text + "에 " + alph + "가 존재하는 위치 : ");
		for (int i = 0; i < text.length(); i++) {
			c[i] = text.charAt(i);
			if (c[i] == alph) {
				System.out.print(i + " ");
				num++;
			}
		}
		System.out.println("");
		System.out.println(alph + "의 개수 : " + num);

	}

	public void practice6() {
		String[] week = { "월", "화", "수", "목", "금", "토", "일" };
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int x = sc.nextInt();

		if (x > 6) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.println(week[x] + "요일");
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int x = sc.nextInt();
		int[] array = new int[x];
		int sum = 0;
		for (int i = 0; i < x; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < x; i++) {

			System.out.println(array[i] + " ");
			sum += array[i];
		}
		System.out.println("총 합 : " + sum);
	}

	public void practice8() {
		int x;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("정수 : ");
			x = sc.nextInt();
			if (x < 3 || x % 2 == 0) {
				System.out.println("다시 입력하세요");
			}
		} while (x < 3 || x % 2 == 0);

		int[] array = new int[x];

		for (int i = 0; i <= x / 2; i++) {
			array[i] = i + 1;
		}
		for (int i = x / 2 + 1; i < x; i++) {
			array[i] = array[x - i - 1];
		}
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

	public void practice9() {
		String[] chicken = { "후라이드", "양념" };
		System.out.print("치킨 이름을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String menu = sc.nextLine();
		int num = 0;
		for (int i = 0; i < chicken.length; i++) {
			if (chicken[i].equals(menu)) {
				num++;
			}
		}
		if (num > 0) {
			System.out.println(menu + "치킨 배달 가능");
		} else
			System.out.println(menu + "치킨은 없는 메뉴 입니다.");
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String num = sc.nextLine();

	}

	public void practice14() {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int[] randomInt = new int[6];
		int[] inputInt = new int[6];
		int num = 0;
		System.out.print("입력 : ");
		for (int i = 0; i < 6; i++) {
			inputInt[i] = sc.nextInt();
		}

		for (int i = 0; i < 6; i++) {
			randomInt[i] = random.nextInt(45) + 1;
		}
		Arrays.sort(randomInt);
		Arrays.sort(inputInt);

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (randomInt[i] == inputInt[j]) {
					num++;
					break;
				}
			}
		}
		
		switch (num) {
		case 3:
			System.out.println("5등"); break;
		case 4:
			System.out.println("4등"); break;
		case 5:
			System.out.println("3등"); break;
		case 6:
			System.out.println("1등"); break;
		}

		for (int i = 0; i < 6; i++) {
			System.out.print(randomInt[i] + " ");
		}

		System.out.println();
		System.out.println(num);

	}

}

package com.kh.view;

import java.util.Scanner;

import com.kh.controller.PlayController;

public class DisplayMenu {
	Scanner sc = new Scanner(System.in);
	PlayController pc = new PlayController();

	public void mainMenu() {
		while(true) {
		System.out.println("======Console Game======");
		System.out.println("1. Up & Down");
		System.out.println("2. 가위바위보");
		System.out.println("9. 점수 조회");
		System.out.println("0. 게임 종료");
		System.out.println("=========================");

		System.out.print("게임 선택 : ");
		int select = sc.nextInt();

		switch (select) {
		case 1:
			pc.method01();
			break;
		case 2:
			pc.method02();
			break;
		case 9:
			pc.getUserInfo();
			break;
		case 0:
			System.out.println("종료합니다.");
			return;
		}
	}
	}

}

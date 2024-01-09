package com.kh.practice.file.view;

import java.io.File;
import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();

	public void mainMenu() {
		int num = 0;
		do {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기 ");
			System.out.println("3. 노트 열어서 수정하기 ");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			sc.nextLine();

			switch (num) {
				case 1:		fileSave();		break;
				case 2:		fileOpen();		break;
				case 3:		fileEdit();		break;
				case 9:		System.out.println("프로그램 종료");		return;
				default:	System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");		break;
			}

		} while (num != 9);
	}

	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		String input;

		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			input = sc.nextLine();

			if ("ex끝it".equals(input)) {
				break;
			}

			sb.append(input).append(System.lineSeparator());
		}

		while (true) {
			System.out.print("저장할 파일 명을 입력해주세요 (ex. myFile.txt): ");
			String fileName = sc.nextLine();
			File file = new File(fileName);

			if (file.exists()) {
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n): ");
				String yn = sc.nextLine().toLowerCase();

				if (yn.equals("y")) {
					fc.fileSave(fileName, sb);
					break;
				} else if (yn.equals("n")) {
					continue;
				} else {
					System.out.println("올바른 입력이 아닙니다. 다시 입력해주세요.");
				}
			} else {
				fc.fileSave(fileName, sb);
				break;
			}
		}
		System.out.println("파일 저장이 완료되었습니다.");
	}

	public void fileOpen() {
		String fileName;
		System.out.print("열 파일명 : ");
		fileName = sc.nextLine();
		if (fc.checkName(fileName) == true) {
			System.out.println(fc.fileOpen(fileName));
		} else
			System.out.println("없는 파일 입니다.");
	}

	public void fileEdit() {
		String fileName;
		String input;
		StringBuilder sb = new StringBuilder();
		System.out.print("수정할 파일 파일명 : ");
		fileName = sc.nextLine();
		
		if (fc.checkName(fileName) == true) {
			while (true) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용: ");
				input = sc.nextLine();

				if ("ex끝it".equals(input)) {
					break;
				}

				sb.append(input).append(System.lineSeparator());
			}
			fc.fileEdit(fileName, sb);
		} else
			System.out.println("없는 파일 입니다.");
	}
}

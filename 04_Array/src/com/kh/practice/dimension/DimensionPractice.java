package com.kh.practice.dimension;

import java.util.Random;
import java.util.Scanner;

public class DimensionPractice {
	public void practice1() {
		String[][] arry = new String[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arry[i][j] = "(" + i;
				arry[i][j] += ',';
				arry[i][j] += j;
				arry[i][j] += ')';
				System.out.print(arry[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int[][] arr = new int[4][4];
		int num = 1;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				arr[i][j] = num;
				num++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void practice3() {
		int[][] arr = new int[4][4];
		int num = 16;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				arr[i][j] = num;
				num--;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	public void practice4() {
		int[][] arr = new int[4][4];
		Random random = new Random();
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = random.nextInt(10) + 1;
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
			}
		}
		for(int i = 0; i < 3; i++) {
				arr[3][3] += arr[3][i];
				arr[3][3] += arr[i][3];
		}
		for(int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		int row = 0;
		int col = 0;
		Random random = new Random();
		
		do {
		System.out.print("행 크기 : ");
		row = sc.nextInt();
		if(row < 0 || row > 10) {
			System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야 합니다.");
			break;
		}
		System.out.print("열 크기 : ");
		col = sc.nextInt();
		if(col < 0 || col > 10) {
			System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야 합니다.");
			break;
		}
		}while(row < 0 || row > 10 || col > 10 || col < 0);
		
		char[][] arr = new char[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = (char)(random.nextInt(26) + 65);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice6() {
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"},
											{"차", "지", "습", "으", "냅"},
											{"원", "열", "니", "로", "시"},
											{"배", "심", "다", "좀", "다"},
											{"열", "히", "! ", "더", "!! "}};
		for(int i = 0 ; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(strArr[j][i] + " ");
			}
			System.out.println();
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		int num = 0;
		int col = 0;
		String result = "";
		char arry[][] = new char[row][];
		for (int i = 0; i < row; i++) {
			System.out.print(i + "행의 열 크기 : ");
			col = sc.nextInt();
			arry[i] = new char[col];
			for (int j = 0; j < col; j++) {
				arry[i][j] = (char) (num + 97);
				num++;
				result += arry[i][j];
				result += (" ");
			}
			result += ("\n");

		}
		System.out.println(result);
	}

	public void practice8() {
		String[] name = {"강건강","남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int num=0;
		System.out.println("==1분단==");
		for(int i = 0; i < 3; i ++){
			for(int j = 0; j < 2; j++){
				arr1[i][j] = name[num];
				num++;
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("==2분단==");
		for(int i = 0; i < 3; i ++){
			for(int j = 0; j < 2; j++){
				arr2[i][j] = name[num];
				num++;
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void practice9(){
		String[] name = {"강건강","남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int num=0;
		System.out.println("==1분단==");
		for(int i = 0; i < 3; i ++){
			for(int j = 0; j < 2; j++){
				arr1[i][j] = name[num];
				num++;
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("==2분단==");
		for(int i = 0; i < 3; i ++){
			for(int j = 0; j < 2; j++){
				arr2[i][j] = name[num];
				num++;
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 학생 이름을 입력하세요");
		String find = sc.nextLine();
		String line = "";
		String RL = "";
		String reslt = "";
		for(int i = 0; i < 3; i ++){
			for(int j = 0; j < 2; j++){
				if(arr1[i][j].equals(find)){
					if(j == 0){
						RL+= "왼쪽";
					}
					else RL+= "오른쪽";
					System.out.println("검색하신 " + find + "학생은 1분단" + i + 1 + "번째 줄" + RL + "에 있습니다." );
					break;
				}
			}
		}
		for(int i = 0; i < 3; i ++){
			for(int j = 0; j < 2; j++){
				if(arr2[i][j].equals(find)){
					line += "2분단";

					if(j == 0){
						RL+= "왼쪽";
					}
					else RL+= "오른쪽";
					System.out.println("검색하신 " + find + "학생은 2분단" + (i + 1) + "번째 줄" + RL + "에 있습니다." );
break;
				}
			}
		}
	}


}

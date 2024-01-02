package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		int num;
		do {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			if(num == 1) {
				circleMenu();
			}
			else if (num == 2) {
				rectangleMenu();
			}
			
			else if(num == 9) {
				System.out.println("종료합니다.");
			}
		} while(num != 9);
		
		
	}
	
	public void circleMenu() {
		int cnum;
		System.out.println("==== 원 메뉴 ====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		cnum = sc.nextInt();
		if(cnum == 1) {
			calcCircum();
		}
		else if (cnum == 2) {
			calcCircleArea();
		}
	}
	
	public void rectangleMenu() {
		int rnum;
		System.out.println("==== 사각형 메뉴 ====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		rnum = sc.nextInt();
		if(rnum == 1) {
			calcPerimeter();
		}
		else if (rnum == 2) {
			calcRectArea();
		}
		
	}
	
	public void calcCircum() {
		int x, y , radius;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		System.out.print("반지름 : ");
		radius = sc.nextInt();
		System.out.print("둘레 : " + cc.calcCircum(x, y, radius));
		System.out.println();
	}
	
	public void calcCircleArea() {
		int x, y , radius;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		System.out.print("반지름 : ");
		radius = sc.nextInt();
		System.out.print("면적 : " + cc.calcArea(x, y, radius));
		System.out.println();
	}
	
	public void calcPerimeter() {
		int x, y , height, width;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		System.out.print("높이 : ");
		height = sc.nextInt();
		System.out.print("너비 : ");
		width = sc.nextInt();
		System.out.print("둘레 : " + 	rc.calcPerimeter(x, y, height, width));
		System.out.println();
	}
	
	public void calcRectArea() {
		int x, y , height, width;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		System.out.print("높이 : ");
		height = sc.nextInt();
		System.out.print("너비 : ");
		width = sc.nextInt();
		System.out.print("면적 : " + rc.calcArea(x, y, height, width));
		System.out.println();
	}

}

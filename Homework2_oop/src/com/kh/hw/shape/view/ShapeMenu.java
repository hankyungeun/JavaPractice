package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
    private Scanner sc = new Scanner(System.in);    
    private SquareController scr = new SquareController();
    private TriangleController tc = new TriangleController();

    public void inputMenu(){
        int num = 0;
        do{
        	System.out.println("==== 도형 프로그램====");
        	System.out.println("3. 삼각형");
        	System.out.println("4. 사각형");
        	System.out.println("9. 프로그램 종료");
        	System.out.print("메뉴 번호 : ");
        	num = sc.nextInt();
            if(num == 3){
                triangleMenu();
            }
            else if (num == 4){
                squareMenu();
            }
            else if(num == 9){
                System.out.println("프로그램을 종료합니다.");
            }
            else{
                System.out.println("잘못된 번호입니다. 다시 입력하세요.");
            }
        }while(num != 9);
    }

    public void triangleMenu(){
    	int num = 0;
    	while(true) {
    		
	        System.out.println("===== 삼각형 =====");
	        System.out.println("1. 삼각형 면적");
	        System.out.println("2. 삼각형 색칠");
	        System.out.println("3. 삼각형 정보");
	        System.out.println("9. 메인으로");
	        System.out.print("메뉴 번호 : ");
	        num = sc.nextInt();
	        if(num == 9) {
	        	break;
	        }
	        inputSize(3, num);
    	}        
    }

    public void squareMenu(){
    	int num = 0;
    	while(true) {
	        System.out.println("===== 사각형 =====");
	        System.out.println("1. 사각형 둘레");
	        System.out.println("2. 사각형 면적");
	        System.out.println("3. 사각형 색칠");
	        System.out.println("4. 사각형 정보");
	        System.out.println("9. 메인으로");
	        System.out.print("메뉴 번호 : ");
	        num = sc.nextInt();
	        if(num == 9) {
	        	break;
	        }
	        inputSize(4, num);
    	}

    }

    public void inputSize(int type, int menuNum){
    	if(type == 3) {
	    	switch(menuNum) {
	    	case 1:
                System.out.print("높이 : ");
                double height = sc.nextDouble();
                System.out.print("너비 : ");
                double width = sc.nextDouble();
                System.out.println("삼각형 면적 : " + tc.calcArea(height, width));
                break;
	    	case 2:
	    		System.out.print("색깔을 입력하세요 : ");
	    		String color = sc.next();
	    		tc.paintColor(color);
	    		System.out.println("색이 수정되었습니다.");
	    		break;
	    	case 3:
	    		printInformation(3);
	    		break;
	    	case 0:
	    		break;
            }
    	} else if(type == 4) {
    		double height = 0;
    		double width = 0;
	    	switch(menuNum) {
	    	case 1:
                System.out.print("높이 : ");
                height = sc.nextDouble();
                System.out.print("너비 : ");
                width = sc.nextDouble();
                System.out.println("사각형 둘레 : " + scr.calcPerimeter(height, width));
                break;
	    	case 2:
                System.out.print("높이 : ");
                height = sc.nextDouble();
                System.out.print("너비 : ");
                width = sc.nextDouble();
                System.out.println("사각형 면적 : " + scr.calcArea(height, width));
                break;
	    	case 3:
	    		System.out.print("색깔을 입력하세요 : ");
	    		String color = sc.next();
	    		scr.paintColor(color);
	    		System.out.println("색이 수정되었습니다.");
	    		break;
	    	case 4:
	    		printInformation(4);
	    		break;
	    	case 0:
	    		break;
            }
    	}
    }

    public void printInformation(int type){
    	if (type == 3) {
    		System.out.println(tc.print());

    	}else if (type == 4) {
    		System.out.println(scr.print());
    	}

    }
    
}

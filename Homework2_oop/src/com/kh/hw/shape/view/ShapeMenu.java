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
        System.out.println("==== 도형 프로그램====");
        System.out.println("3. 삼각형");
        System.out.println("4. 사각형");
        System.out.println("9. 프로그램 종료");
        System.out.print("메뉴 번호 : ");
        num = sc.nextInt();
        do{
            if(num == 3){
                triangleMenu();
            }
            else if (num == 4){
                squareMenu();
            }
            else if(num == 9){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            else{
                System.out.println("잘못된 번호입니다. 다시 입력하세요.");
            }
        }while(num != 4 || num != 3 || num != 9);
    }

    public void triangleMenu(){
        System.out.println("===== 삼각형 =====");
        System.out.println("1. 삼각형 면적");
        System.out.println("2. 삼각형 색칠");
        System.out.println("3. 삼각형 정보");
        System.out.println("9. 메인으로");
        System.out.print("메뉴 번호 : ");
        if(sc.nextInt()==1){
            inputSize(3, 1);
        

   }

    public void squareMenu(){

    }

    public void inputSize(int type, int menuNum){
        if(sc.nextInt()==1){
            double width =0;
                    double height = 0;
                    System.out.print("높이 : ");
                    height = sc.nextDouble();
                    System.out.print("너비 : ");
                    width = sc.nextDouble();
                    tc.calcArea(height, width);
                }
    }

    public void printInformation(int type){

    }
    
}

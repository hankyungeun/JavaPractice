package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPracitce1 {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		char text = (char) sc.next().charAt(0);
		int uni = (int)text;
		
		System.out.println(text + " unicode : " + uni);
	}
	
	public void practice3() {
		int num1 = 10;
		int num2 = 4;
		float fnum = 3.0f;
		double dnum = 2.5;
		char ch = 'A';
		
		System.out.println(num1 / num2);
		System.out.println((int)dnum);
		
		System.out.println((double)num2 * dnum);
		System.out.println((float)num1);
		
		System.out.println((float)num1 / (float)num2);
		System.out.println(dnum);
		
		System.out.println((int)fnum);
		System.out.println(num1 / (int)fnum);
		
		System.out.println(num1 / fnum);
		System.out.println(num1 / (double)fnum);
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println((int)ch + num1);
		System.out.println((char)((int)ch + num1));
		
	}
}

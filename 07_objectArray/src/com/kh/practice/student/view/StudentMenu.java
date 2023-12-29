package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	StudentController sc = new StudentController();
	Student[] s = sc.printStudent();

	public StudentMenu() {
		System.out.println("=======학생 정보 출력========");
		for(int i = 0; i < 5; i++) {
			System.out.println("이름 : " + s[i].getName() + " / 과목 : " + s[i].getSubjecte() + " / 점수 : " + s[i].getScore());
		}
		System.out.println();
		System.out.println("=======학생 성적 출력========");
		System.out.println("학생 점수 합계 : " + sc.avgScore()[0]);
		System.out.println("학생 점수 평균 : " + sc.avgScore()[1]);
		System.out.println();
		System.out.println("=======성적 결과 출력========");
		for(int i = 0; i < 5; i++) {
			if(s[i].getScore() >= sc.CUT_LINE)
				System.out.println(s[i].getName() + "학생은 통과입니다.");
			
			else
				System.out.println(s[i].getName() + "학생은 재시험 대상입니다.");

		}
	}
}

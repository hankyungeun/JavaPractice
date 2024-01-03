package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		int num;
		do {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + pc.personCount()[0] + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + pc.personCount()[1] + "명입니다.");
			System.out.println();
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			
			if(num == 1) {
				studentMenu();
			}
			else if(num == 2) {
				employeeMenu();
			}
			else if(num == 9) {
				System.out.println("종료합니다.");
			}
			else
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}while(num != 9);
		
	}
	
	public void studentMenu() {
		int num;
		do {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			if(pc.personCount()[0]==3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			sc.nextLine();
			if(num == 1 && pc.personCount()[0]!=3) {
				insertStudent();
			}
			else if(num == 2) {
				printStudent();
			}
			else if(num == 9) {
				System.out.println("메인으로 돌아갑니다.");
			}
			else
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		} while(num!=9);
	}
	
	public void employeeMenu() {
		int num;
		do {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			if(pc.personCount()[1]==10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}
			System.out.print("메뉴번호 : ");
			num = sc.nextInt();
			sc.nextLine();
			if(num == 1 && pc.personCount()[1]!=10) {
				insertEmployee();
			}
			else if(num == 2) {
				printEmployee();
			}
			else if(num == 9) {
				System.out.println("메인으로 돌아갑니다.");
			}
			else
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		} while(num!=9);
		
	}
	
	public void insertStudent() {
		String name, major, ny="";
		int age, grade;
		double height, weight;
		do{
			System.out.print("학생 이름 : " );
			name = sc.nextLine();
			System.out.print("학생 나이 : " );
			age = sc.nextInt();
			System.out.print("학생 키 : " );
			height = sc.nextDouble();
			System.out.print("학생 몸무게 : " );
			weight = sc.nextDouble();
			System.out.print("학생 학년 : " );
			grade = sc.nextInt();
			sc.nextLine();
			System.out.print("학생 전공 : " );
			major = sc.nextLine();
			pc.insertStudent(name, age, height, weight, grade, major);
			if(pc.personCount()[0]<3){
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				ny = sc.nextLine();
			}
			else{
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				ny = "N";
			}
		} while (!ny.equalsIgnoreCase("N"));
	}
	
	public void printStudent() {
		Student[] students = pc.printStudnet();
		for (Student student : students) {
	        if (student != null) {
	            System.out.println(student);
	        }
	    }
	}
	
	public void insertEmployee() {
		String name, dept, ny="";
		int age, salary;
		double height, weight;
		do{
			System.out.print("사원 이름 : " );
			name = sc.nextLine();
			System.out.print("사원 나이 : " );
			age = sc.nextInt();
			System.out.print("사원 키 : " );
			height = sc.nextDouble();
			System.out.print("사원 몸무게 : " );
			weight = sc.nextDouble();
			System.out.print("사원 급여 : " );
			salary = sc.nextInt();
			sc.nextLine();
			System.out.print("학생 부서 : " );
			dept = sc.nextLine();
			pc.insertEmployee(name, age, height, weight, salary, dept);
			if(pc.personCount()[0]<10){
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				ny = sc.nextLine();
			}
			else{
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				ny = "N";
			}
		} while (!ny.equalsIgnoreCase("N"));
	}
	
	public void printEmployee() {
		Employee[]employees = pc.printEmployee();
		for (Employee employee : employees) {
	        if (employee != null) {
	            System.out.println(employee); 
	        }
	    }
	}

}

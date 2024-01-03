package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];

	
	public int[] personCount() {
		int num[]  = new int[2];
		int snum=0;
		int emnum=0;
		for(int i = 0; i < 3; i++){
			if(s[i] != null){
				 snum++;
			}
		}
		for(int i = 0; i < 10; i++){
			if(e[i] !=null){
				emnum++;
			}
		}
		num[0] = snum;
		num[1] = emnum;
		return num;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int i = 0; i < 3; i++) {
			if(s[i] == null) {
				s[i] = new Student();
				s[i].setName(name);
				s[i].setAge(age);
				s[i].setHeight(height);
				s[i].setWeight(weight);
				s[i].setGrade(grade);
				s[i].setMajor(major);
				break;
			}
		}
	}
	
	public Student[] printStudnet() {
		return s;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i = 0; i < 10; i++) {
			if(e[i] == null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				break;
			}
		}
	}
	
	public Employee[] printEmployee() {
		return e;
	}
	
}

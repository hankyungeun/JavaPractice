package com.kh.generic.practice1;

public class Powder extends Material{

	@Override
	public void doPrinting() {
		System.out.println("Power 재료 출력");
	}
	
	@Override
	public String toString() {
		return "재료 : Powder";
	}
}

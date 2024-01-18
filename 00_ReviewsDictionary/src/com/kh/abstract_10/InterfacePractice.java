package com.kh.abstract_10;

public class InterfacePractice implements TestInterface{
	
	@Override
	public int getNumber() {		// 구현할 인터페이스의 추상메소드 재정의 시 "접근제한자" 주의해야 함
		return 10;
	}
}

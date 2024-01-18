package com.kh.exception_12;

public class ExceptionPractice {

	public static void main(String[] args) {
		
		/*
		반드시 예외처리를 해야하는 예외 : Checked ExceptionPractice
		 : Exception, IOException, FileNotFoundException ... 

		필수는 아니나 예외가 발생할 가능성이 있을 때 예외 처리가 필요한 예외 : Unchked Exception
		 : RuntimeException, ArithmeticException, ArrayIndexOutOfBoundsException
		 	NullPointerException (객체 생성 전에 접근할 때 발생)
			ClassCastException (클래스 형변환(다운캐스팅) 시 생성된 인스턴스가 아닌 클래스 타입으로 형변환)
			클래스 형변환(다운캐스팅) : 상속된 자손 클래스로 형변환이 가능. 해당 자손클래스로 인스턴스 생성되어야함.
		*/

		int[] a  =new int[2];
		System.out.println(a[3]);
	}

}

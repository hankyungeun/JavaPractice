package com.kh.abstract_10;

abstract class Printer {
    private static final int ERROR = -999999999;		//밑줄 : static, 대문자 : final(상수)

    public static int getERROR(){
        return ERROR;
    }
    
    //ERROR필드는 상수로 setter 사용 불가

    public abstract void colorPrint(int rgb);
}

class LGPrinter extends Printer{		//추상메소드 구현하지 않을 경우 오류 발생
	@Override
	public void colorPrint(int rgb) {
		System.out.println(rgb + "으로 프린트 중...");
	}
}
public class AbstractPractice {
/*
 * 추상(abstract) : 미완성, 완전하지 않은 상태
 * - 추상 클래스 => 인스턴스 생성 할 수 없음
 *     [표현식]
 *          [접근제한자] abstract class 클래스명{}
 * - 추상 메소드
 *     [표현식]
 *          [접근제한자] abstract 반환타입 메소드명([매개변수]);
 */

	public static void main(String[] args) {

	
	//	Printer printer = new Printer();		//추상클래스는 인스턴스 생성불가
		Printer printer2 = new LGPrinter();
		printer2.colorPrint(666);				//동적 바인딩(Dynamic Binding)
	}										//다형성이 적용된 참조변수에서 메소드 실행 시 자식 클래스에서 재정의 된 메소드가 실행되는 특징
}

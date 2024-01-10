package com.kh.generic.practice1;

public class PrintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ThreeDPrinter 객체 생성
		ThreeDPrinter tp = new ThreeDPrinter();
		
		//Powder 객체 생성
		Powder p = new Powder();
		
		//ThreeDPrinter 내 setMeterail 메소드를 사용하여 Powder 객체를 저장
		tp.setMaterial(p);
		
		//또다른 Powder객체에 ThreeDPrinter에 저장된 material 데이터를 꺼내서 저장
		Powder p2 = new Powder();
		p2 = (Powder) tp.getMaterial();
		
		//ThreeDPrinter 제네릭 적용한 상태 -> ThreeDPrinterG클래스 정의
		//위와 동일하게Powder객체를 저장한 후 다시 꺼내어 다른 Powder 객체 저장
		ThreeDPrinter<Powder> tdpG = new ThreeDPrinter<>();
		Powder pow3 = new Powder();
		
		tdpG.setMaterial(pow3);
		Powder p4 = tdpG.getMaterial();
		

	}

}

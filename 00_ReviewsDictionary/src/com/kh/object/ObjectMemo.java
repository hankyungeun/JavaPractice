/*
 * 배열 = 하나의 자료형 여러개의 데이터를 저장하는 공간
 * 클래스 = 여러 자료형 여러개의 데이터를 저장하는 공간
 * 
 * - 추상화 과정 : 객체를 클래스로 표현하기 위해 준비하는 과정
 * [1] 필요성 상관없이 데이터와 기능들을 나열
 * [2] 프로그램에 필요한 정보를 추출
 * [3] 자료형과 변수명, 메소드 정의
 * 
 * - [class 표현식]
 * 		package 패키지_경로;
 * 		
 *      import문
 * 		
 *      [접근제한자] [예약어] class 클래스명 [(상속)extends 부모클래스명] [(구현)] implements 인터페이스명] {
 *  		//필드(데이터/변수/멤버변수)
 *           [접근제한자] [예약어] 데이터타입(자료형) 변수명[= 값];
 *  
 *  		//생성자 (객체 생성할 때 호출되고, 보통 초기화 작업을 수행)
 *			  접근제한자 클래스명([매개변수]){ // 매개변수 정의 => 자료형 변수명. 자료형타입의 값을 변수명으로 받겠다.}
 *                  - 매개변수가 있는 경우 보통은 멤버 변수와 데이터 타입과 변수명이 동일 => 멤버 변수를 초기화
 *                  - 특징 : 클래스명과 생성자명이 동일. 오버로딩 가능. 반환타입 없음
 *          
 *          //메소드(기능) : 보통 필드와 관련된 데이터 처리하는 기능
 *            [접근제한자] [예약어] 반환타입 메소드명([매개변수])[(예외처리) throws 예외클래스명]{
 *              // 반환타입 있는 경우 "return"을 사용하여 결과 값을 전달
 *              //       없는 경우 "return"을 사용할 수 없는가? 사용할 수 있음. 메소드를 종료시킬 때
 *          }
 * 
 *  
 * 
 * 
 *  	}
 * 
 * 		
 * 			 
 * 
 * */

package com.kh.array;

class Person{
	String name;
	int age;
	double height;

	public Person() {
		name = "홍길동";
		age = 17;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

/*
 * 상속
	1) 다형성(다양한 형태의 성질을 띈 특징)
	 : 부모 타입의 참조변수는 자식타입의 인스턴스를 생성할 수 있음
		Person p1 = new IU();
	
		Person[] pArr = new Person[3];
		pArr[0] = new Person();
		pArr[1] = new IU();
		pArr[2] = new Hong();
		
	2) 생성자
	 : 자식 클래스의 생성자 호출시 따로 정의하지 않아도 부모 클래스의 생성자가 호출됨

	3)오버라이딩 : 부모클래스에 정의되어있는 메소드를 자식클래스에서 재정의
		*주의사항*
		[1] 동일조건 : 메소드명 / 매개변수 (종류,순서,개수) / 반환타입
		[2] 접근제한자 범위 : 같거나 넓은 범위
			public(+) > protected(#) > [default](~) > private(-)
			//private 메소드는 오버라이딩 할 수 없음
			//protected : 같은 패키지 또는 상속된 클래스 내부(따른 패키지도 가능)
		[3] 예외 처리된 클래스 범위 : 같거나 좁은 범위(자식 클래스)
 */
class IU extends Person {
	public IU() {
		super("아이유", 32);
	}
}

class Hong extends Person {
	/*
		1)생성자가 정의되어있지 않으면, 자동으로 기본 생성자가 실행
		public Hong() {}
		2) 기본 생성자가 실행될 때 부모 클래스 기본생성자가 자동으로 호출
		public Hong() {
				super();
		}
	*/
}

public class C_ObjectArray{
	public static void main(String[] args) {
		Person[] pArr = new Person[2];
		//객체 배열 생성만으로 배열 내에 인스턴스가 생성되는 것은 아님
		//-> 
		
		pArr[0] = new IU();			//다형성 : 부모클래스 타입의 참조변수는 자식클래스타입의 인스턴스를 생성할 수 있 
		pArr[1] = new Hong();
		
		for(Person p : pArr) {
			System.out.println("이름 : " + p.name + ", 나이 : " + p.age);
		}
	}
}


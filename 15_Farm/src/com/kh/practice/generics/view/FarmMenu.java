package com.kh.practice.generics.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;

public class FarmMenu {
    private Scanner sc = new Scanner(System.in);
    private FarmController fc = new FarmController();

    public void mainMenu() {
        while(true){
            System.out.println("========== KH 마트 ==========");
            System.out.println("=====***** 메인 메뉴 *****=====");
            System.out.println("1. 직원 메뉴");
            System.out.println("2. 손님 메뉴");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 입력 : ");
            int select = sc.nextInt();
            switch(select){
                case 1: adminMenu(); break;
                case 2: customerMenu(); break;
                case 9: System.out.println("프로그램 종료."); return;
                default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
            }
        }
    }
    public void adminMenu() {
        while(true){

            System.out.println("******* 직원 메뉴 *******");
            System.out.println("1. 새 농산물 추가"); 
            System.out.println("2. 종류 삭제");
            System.out.println("3. 수량 수정");  
            System.out.println("4. 농산물 목록"); 
            System.out.println("9. 메인으로 돌아가기"); 
            System.out.print("메뉴 번호 선택 : ");
            int num = sc.nextInt();
            switch(num){
                case 1: addNewKind(); break;
                case 2: removeKind(); break;
                case 3: changeAmount(); break;
                case 4: printFarm(); break;
                case 9: return;
                default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요"); break;
            }
        }
    }
    public void customerMenu() {
        while(true){
            System.out.println("현재 KH마트 농산물 수량");
            printFarm();
            System.out.println("******* 고객 메뉴 *******");
            System.out.println("1. 농산물 사기");
            System.out.println("2. 농산물 빼기");
            System.out.println("3. 구입한 농산물 보기");
            System.out.println("9. 메인으로 돌아가기");
            System.out.print("메뉴 번호 선택 : ");
            int num = sc.nextInt();
            switch(num){
                case 1: buyFarm(); break;
                case 2: removeFarm(); break;
                case 3: printBuyFarm(); break; 
                case 9: return;
                default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요"); break;
            }
        }
    }
    public void addNewKind() {
    	while(true) {
	    	System.out.println("1. 과일 / 2. 채소 / 3. 견과");
	    	System.out.print("추가할 종류 번호 : ");
	    	int num = sc.nextInt();
	    	String name;
	    	int amount;
	    	switch(num) {
	    	case 1:
	    		System.out.print("이름 : ");
	    		name = sc.next();
	    		System.out.print("수량 : ");
	    		amount = sc.nextInt();
	    		Fruit f = new Fruit("과일", name);
	    		if(fc.addNewKind(f, amount)) {
	    			System.out.println("새 농산물이 추가되었습니다.");
	    			return;
	    		}
	    		else {
	    			System.out.println("새 농산물 추가에 실패하였습니다");
	    			break;
	    		}
	    		
	    	case 2:
	    		System.out.print("이름 : ");
	    		name = sc.next();
	    		System.out.print("수량 : ");
	    		amount = sc.nextInt();
	    		Vegetable v = new Vegetable("채소", name);
	    		if(fc.addNewKind(v, amount)) {
	    			System.out.println("새 농산물이 추가되었습니다.");
	    			return;
	    		}
	    		else {
	    			System.out.println("새 농산물 추가에 실패하였습니다");
	    			break;
	    		}
	
	    	case 3:
	    		System.out.print("이름 : ");
	    		name = sc.next();
	    		System.out.print("수량 : ");
	    		amount = sc.nextInt();
	    		Nut n = new Nut("견과", name);
	    		if(fc.addNewKind(n, amount)) {
	    			System.out.println("새 농산물이 추가되었습니다.");
	    			return;
	    		}
	    		else {
	    			System.out.println("새 농산물 추가에 실패하였습니다");
	    			break;
	    		}
	    	default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");	break;
	    	}
    	}
    }
    public void removeKind() {
    	while(true) {
	    	System.out.println("1. 과일 / 2. 채소 / 3. 견과");
	    	System.out.print("삭제할 종류 번호 : ");
	    	int num = sc.nextInt();
	    	String name;
	    	switch(num) {
	    	case 1:
	    		System.out.print("이름 : ");
	    		name = sc.next();
	    		Fruit f = new Fruit("과일", name);
	    		if(fc.removeKind(f)) {
	    			System.out.println("농산물 삭제에 성공하였습니다.");
	    			return;
	    		}
	    		else {
	    			System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요");
	    			break;
	    		}
	    		
	    	case 2:
	    		System.out.print("이름 : ");
	    		name = sc.next();
	    		Vegetable v = new Vegetable("채소", name);
	    		if(fc.removeKind(v)) {
	    			System.out.println("농산물 삭제에 성공하였습니다.");
	    			return;
	    		}
	    		else {
	    			System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요");
	    			break;
	    		}
	
	    	case 3:
	    		System.out.print("이름 : ");
	    		name = sc.next();
	    		Nut n = new Nut("견과", name);
	    		if(fc.removeKind(n)) {
	    			System.out.println("농산물 삭제에 성공하였습니다.");
	    			return;
	    		}
	    		else {
	    			System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요");
	    			break;
	    		}
	    	default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");	break;
	    	}
    	}
    }
    public void changeAmount() {
    	while(true) {
	    	System.out.println("1. 과일 / 2. 채소 / 3. 견과");
	    	System.out.print("수정할 종류 번호 : ");
	    	int num = sc.nextInt();
	    	String name;
	    	int amount;
	    	switch(num) {
	    	case 1:
	    		System.out.print("이름 : ");
	    		name = sc.next();
	    		System.out.print("수정할 수량 : ");
	    		amount = sc.nextInt();
	    		Farm f = new Fruit("과일", name);
	    		if(fc.changeAmount(f, amount)) {
	    			System.out.println("농산물 수량이 수정되었습니다.");
	    			return;
	    		}
	    		else {
	    			System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
	    			break;
	    		}
	    		
	    	case 2:
	    		System.out.print("이름 : ");
	    		name = sc.next();
	    		System.out.print("수정할 수량 : ");
	    		amount = sc.nextInt();
	    		Vegetable v = new Vegetable("채소", name);
	    		if(fc.changeAmount(v, amount)) {
	    			System.out.println("농산물 수량이 수정되었습니다.");
	    			return;
	    		}
	    		else {
	    			System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
	    			break;
	    		}
	
	    	case 3:
	    		System.out.print("이름 : ");
	    		name = sc.next();
	    		System.out.print("수정할 수량 : ");
	    		amount = sc.nextInt();
	    		Nut n = new Nut("견과", name);
	    		if(fc.changeAmount(n, amount)) {
	    			System.out.println("농산물 수량이 수정되었습니다.");
	    			return;
	    		}
	    		else {
	    			System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
	    			break;
	    		}
	    	default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");	break;
	    	}
    	}
    }
    public void printFarm() {
    	HashMap<Farm, Integer> farmData = fc.printFarm();
    	for (Farm key : farmData.keySet()) {
            int count = farmData.get(key);
            if (key instanceof Fruit) {
                Fruit fruit = (Fruit) key;
                System.out.println(fruit.getKind() + ": " + fruit.getName() + "(" + count + "개)");
            } else if (key instanceof Nut) {
                Nut nut = (Nut) key;
                System.out.println(nut.getKind() + ": " + nut.getName() + "(" + count + "개)");
            } else if (key instanceof Vegetable) {
                Vegetable vegetable = (Vegetable) key;
                System.out.println(vegetable.getKind() + ": " + vegetable.getName() + "(" + count + "개)");
            }
        }
    }
    public void buyFarm() {
    	while(true) {
	    	System.out.println("1. 과일 / 2. 채소 / 3. 견과");
	    	System.out.print("구매할 것 : ");
	    	int num = sc.nextInt();
	    	String name;
	    	
	    	switch(num) {
	    	case 1:
	    		System.out.print("이름 : ");
	    		name = sc.next();
	    		Fruit f = new Fruit("과일", name);
	    		if(fc.buyFarm(f)) {
	    			System.out.println("구매에 성공하였습니다.");
	    			return;
	    		}
	    		else {
	    			System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
	    			break;
	    		}
	    		
	    	case 2:
	    		System.out.print("이름 : ");
	    		name = sc.next();
	    		Vegetable v = new Vegetable("채소", name);
	    		if(fc.buyFarm(v)) {
	    			System.out.println("구매에 성공하였습니다.");
	    			return;
	    		}
	    		else {
	    			System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
	    			break;
	    		}
	
	    	case 3:
	    		System.out.print("이름 : ");
	    		name = sc.next();
	    		Nut n = new Nut("견과", name);
	    		if(fc.buyFarm(n)) {
	    			System.out.println("구매에 성공하였습니다.");
	    			return;
	    		}
	    		else {
	    			System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
	    			break;
	    		}
	    	default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");	break;
	    	}
    	}
    	
    }
    public void removeFarm() {
    	while(true) {
	    	System.out.println("1. 과일 / 2. 채소 / 3. 견과");
	    	System.out.print("구매 취소할 것 : ");
	    	int num = sc.nextInt();
	    	String name;
	    	
	    	switch(num) {
	    	case 1:
	    		System.out.print("이름 : ");
	    		name = sc.next();
	    		Fruit f = new Fruit("과일", name);
	    		if(fc.removeFarm(f)) {
	    			System.out.println("구매 취소에 성공하였습니다.");
	    			return;
	    		}
	    		else {
	    			System.out.println("구매매 목록에 존재하지 않습니다. 다시 입력해주세요.");
	    			break;
	    		}
	    		
	    	case 2:
	    		System.out.print("이름 : ");
	    		name = sc.next();
	    		Vegetable v = new Vegetable("채소", name);
	    		if(fc.removeFarm(v)) {
	    			System.out.println("구매 취소에 성공하였습니다.");
	    			return;
	    		}
	    		else {
	    			System.out.println("구매매 목록에 존재하지 않습니다. 다시 입력해주세요.");
	    			break;
	    		}
	
	    	case 3:
	    		System.out.print("이름 : ");
	    		name = sc.next();
	    		Nut n = new Nut("견과", name);
	    		if(fc.removeFarm(n)) {
	    			System.out.println("구매 취소에 성공하였습니다.");
	    			return;
	    		}
	    		else {
	    			System.out.println("구매매 목록에 존재하지 않습니다. 다시 입력해주세요.");
	    			break;
	    		}
	    	default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");	break;
	    	}
    	}
    }
    public void printBuyFarm() {
    	ArrayList<Farm> buyList= fc.printBuyFarm();
    	Iterator<Farm> iter = buyList.iterator();

    	while (iter.hasNext()) {
            Farm farm = iter.next();
            if (farm instanceof Fruit) {
                Fruit fruit = (Fruit) farm;
                System.out.println(fruit.getKind() + ": " + fruit.getName());
            } else if (farm instanceof Nut) {
                Nut nut = (Nut) farm;
                System.out.println(nut.getKind() + ": " + nut.getName());
            } else if (farm instanceof Vegetable) {
                Vegetable vegetable = (Vegetable) farm;
                System.out.println(vegetable.getKind() + ": " + vegetable.getName());
            }
        }
    	
    }
}

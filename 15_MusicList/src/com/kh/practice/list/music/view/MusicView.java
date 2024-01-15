package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		while(true){
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 수정");
			System.out.println("7. 곡 명 오름차순 정렬");
			System.out.println("8. 가수 명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int select = sc.nextInt();
			switch (select) {
				case 1: addList();			break;
				case 2: addAtZero();		break;
				case 3: printAll();			break;
				case 4: searchMusic();		break;
				case 5: removeMusic();		break;
				case 6: setMusic();			break;
				case 7: ascTitle();			break;
				case 8: descSinger();		break;
				case 9: System.out.println("종료");return;
				default:
				System.out.println("다시 입력");
					break;
			}
		}
	} 
	public void addList() {
		System.out.println(";****** 마지막 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.next();
		System.out.print("가수 명 : ");
		String singer = sc.next();
		Music music = new Music(title,singer);
		if(mc.addList(music) == 1)	{
			System.out.println("추가 성공");
		}
		else System.err.println("추가 실패");
	} 
	public void addAtZero() {
		System.out.println(";****** 첫 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.next();
		System.out.print("가수 명 : ");
		String singer = sc.next();
		Music music = new Music(title,singer);
		if(mc.addAtZero(music) == 1)	{
			System.out.println("추가 성공");
		}
		else System.err.println("추가 실패");
	} 
	public void printAll() {
		System.out.println(mc.printAll());
	} 
	public void searchMusic() {
		System.out.println(";****** 특정 곡 검색 ******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.next();
		if(mc.searchMusic(title) != null){
			System.out.println("검색한 곡은 " + title + " - " + mc.searchMusic(title).getSinger() +" 입니다.");
		}
		else{
			System.out.println("검색한 곡이 없습니다.");
		}
	} 
	public void removeMusic() {
		System.out.println(";****** 특정 곡 삭제 ******");
		System.out.print("삭제할 곡 명 : ");
		String title = sc.next();
		if(mc.removeMusic(title) != null){
			System.out.println(mc.removeMusic(title).getSinger() + " - " + title + "을 삭제 했습니다.");
		}
		else{
			System.out.println("삭제할 곡이 없습니다.");
		}
	} 
	public void setMusic() {
		System.out.println(";****** 특정 곡 수정 ******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.next();
		System.out.print("수정할 곡 명 : ");
		String newTitle = sc.next();
		System.out.print("수정할 가수 명 : ");
		String newSinger = sc.next();
		Music music = new Music(newTitle,newSinger);
		if(mc.setMusic(title, music)==null){
			System.out.println("수정할 곡이 없습니다.");
		}
		else
		System.out.println(newSinger + " - " + newTitle + "의 값이 변경 되었습니다.");
	} 

	public void ascTitle() {
		if (mc.ascTitle() == 1){
			System.out.println("정렬 성공");
		}
		else
		System.out.println("정렬 실패");
	} 
	public void descSinger() {
		if (mc.descSinger() == 1){
			System.out.println("정렬 성공");
		}
		else
		System.out.println("정렬 실패");
	} 
}

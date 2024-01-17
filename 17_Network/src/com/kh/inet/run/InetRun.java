package com.kh.inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {
	public static void main(String[] args) {
		try {
			InetAddress localhost = InetAddress.getLocalHost();		//getLocalHost() : 내 PC에 대한 정보를 반환
			System.out.println(localhost);		//PC정보 / IP주소
			System.out.println("내 PC 정보 : " + localhost.getHostName());
			System.out.println("내 IP 주소 : " + localhost.getHostAddress());
			
			System.out.println("====================");
			
			//도메인을 통해 서버 정보를 반환
			InetAddress googleHost = InetAddress.getByName("www.google.com");
			
			System.out.println("구글 서버명 : " + googleHost.getHostName());
			System.out.println("구글 IP 주소 : " + googleHost.getHostAddress());

			System.out.println("====================");
			
			//도메인을 통해 서버 관련된 정보를 배열로 받아 확인
			InetAddress[] naverHost = InetAddress.getAllByName("www.naver.com"); 
			System.out.println("네이버 호스트 개수 : " + naverHost.length);
			for(InetAddress inetAddress : naverHost) {
				System.out.println("네이버 호스트명 : " + inetAddress.getHostName());
				System.out.println("네이버 IP주소 : " + inetAddress.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}
}

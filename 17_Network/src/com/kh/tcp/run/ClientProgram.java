package com.kh.tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1) 요청할 서버의 ip주소와 포트번호 확인
		String serverIP = "192.168.110.10";
		int port = 3000;
		
		// 사용되는 통로(소켓, 스트림) 초기화
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter
		pw = null;
		
		// 2) 서버에 연결 요청을 보내기 (요청하고자 하는 서버의 IP주소와 포트 번호를 사용하여 소켓 객체 생성)
		try {
			socket = new Socket(serverIP, port);		// 서버로 연결 요청
			
			if(socket != null) {						// 서버와의 연결 성공했을 경우
				System.out.println("서버(" + serverIP + " : " + port + ") 로 연결 성공!");
				// 3) 서버와 입출력 기반 스트림 생성
				// 4) 보조스트림을 통해서 성능 개선
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				// 출력용 스트림
				pw = new PrintWriter(socket.getOutputStream());
				// 5) 스트림 사용하여 입출력(데이터 통신
				while(true) {			// 계속 통신을 주고 받을 수 있도록 무한루프
					System.out.print("서버로 전달할 메세지 : ");
					String sendMessage = sc.nextLine();
					
					// 출력 - 서버측으로 데이터 전송
					pw.println(sendMessage);
					pw.flush();				// 입력하지 않으면 데이터가 전달되지 않을 수 있어 사용
					
					String message = br.readLine();
					System.out.println("서버로부터 전달된 메세지 : " + message);
				}
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 통신 종료
				br.close();
				pw.close();
				socket.close();
			} catch(IOException e) {
				
			}
		}
		
		
		
	}

}

package com.kh.groupChat.common;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

import com.kh.groupChat.client.Main;


public class Sender implements Runnable {
	
	private final Socket s;
	
	Scanner sc = new Scanner(System.in);

	public Sender(Socket s) {
		this.s = s;
	}



	@Override
	public void run() {
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream(), "utf-8"));
			while(true) {
				String msg = sc.nextLine();
				bw.write(Main.name + msg);
				bw.newLine();
				bw.flush();
				Thread.sleep(1);
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

}
package com.kh.groupChat.server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class ServerSender implements Runnable {
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(1); 
				String msg = Main.msgQueue.poll();
				if(msg == null) continue;
				for(BufferedWriter bw : Main.bwList) {
					bw.write(msg);
					bw.newLine();
					bw.flush();
				}
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

}
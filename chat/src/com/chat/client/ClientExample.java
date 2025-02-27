package com.chat.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientExample {
	public static void main(String[] args) {
		
		try {
			Socket s = new Socket("172.30.1.30", 8080);
			System.out.println("[클라이언트] 연결 성공");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("메시지 입력 : ");
			String msg = sc.nextLine();
			
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF(msg);
			dos.flush();
			
			// // 여러번 보내기
//				if (msg.equals("종료")) {
//					s.close();
//				}
			
			s.close();
			System.out.println("[클라이언트] 연결 종료");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}

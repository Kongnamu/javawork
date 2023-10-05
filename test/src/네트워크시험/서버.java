package 네트워크시험;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class 서버 {

	//필드
	private static ServerSocket serverSocket;
	
	public static void main(String[] args) {
		System.out.println("==============================================");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요");
		System.out.println("==============================================");
		
		startServer();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		
		scanner.close();
		
		stopServer();

	}
	
	public static void startServer() {
	Thread thread = new Thread() {
		@Override
		public void run() {
			try {
				serverSocket = new ServerSocket(6000);
				System.out.println("[서버] 시작됨");
				
				//클라이언트 대기
				while(true) {
					System.out.println("\n[서버] 연결 요청 대기중\n");
					//연결 수락 및 클라이언트와 통신할 소켓 생성
					Socket socket = serverSocket.accept();
				
				//IP 확인
				InetSocketAddress isa = 
						(InetSocketAddress)socket.getRemoteSocketAddress();
				String clientIp = isa.getHostString();
				System.out.println("[서버] " + clientIp + "의 연결 요청을 수락함");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	};
		
	}

}

package tcpnetwork;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
	//IP : Internet Protocol
	public static void main(String[] args) {
		
		try {
			InetAddress local = InetAddress.getLocalHost(); //로컬 컴퓨터 IP 얻기
			System.out.println("내 컴퓨터의 IP주소: " + local.getHostAddress());
			
			//서버 컴퓨터: 여러대인 경우 배열로 출력
			//DNS(Domain Name Service) : 숫자 주소 -> 문자 이름 변경하는 서비스
			//InetAddress server = InetAddress.getByName("www.naver.com");
			//System.out.println("네이버의 IP주소: " + server);
			
			InetAddress[] server = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : server) {
				System.out.println(remote);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}

package ifexample;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
		// 입장객 수에 따른 좌석의 줄(행) 수 계산
		// 변수: 고객 수(customer), 좌석열 수(column), 줄 수(row)
		Scanner sc = new Scanner(System.in); // 입력 객체 sc 생성
		
		System.out.print("입장객 수 입력: ");
		int customer = sc.nextInt();	
		
		System.out.print("좌석 열 수 입력: ");
		int column = sc.nextInt();
				
		int row = 0; // 줄 수(row)를 구해야함
		
		//연산(if ~ else문)
		if(customer % column == 0 ) { // 나누어 떨어짐
		  row = customer / column;
		}else { // 나누어 떨어지고 남은 값이 있으면 1을 더해라
	      row = customer / column + 1;
	    }
		
		System.out.println(row + "줄이 필요합니다.");
		sc.close();
	}

}

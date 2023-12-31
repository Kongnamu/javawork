package seats;

import java.util.Scanner;

public class SeatAllLocation {

	public static void main(String[] args) {
		// 자리 배치도
		// 변수: 입장객 수(customer), 열(column), 줄(row)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입장객 수: ");
		int customer = scan.nextInt(); // 입장객 수
		
		System.out.print("좌석 열 수: ");
		int column = scan.nextInt(); // 좌석 열 수

        int row; // 줄(행) 수
        
        if(customer % column == 0) {
        	row = customer / column;
        }else {
        	row = customer / column + 1;
        }
        
        // 중첩 for
        for(int i = 0; i < row; i++) {
        	for(int j = 1; j <= column; j++) {
        		int seatNum = column*i+j;
        		if(seatNum > customer)
        			break;
        		System.out.print("좌석" + seatNum + " ");
        	}
        	System.out.println();
        }
        scan.close();

	}

}
